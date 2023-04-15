package com.shiken.shousetsu

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.shiken.shousetsu.databinding.DetailLightNovelBinding
import com.shiken.shousetsu.dataclass.LightNovel

class DetailLN : AppCompatActivity() {

    private lateinit var dBind: DetailLightNovelBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dBind = DetailLightNovelBinding.inflate(layoutInflater)
        setContentView(dBind.root)

        val isi = intent.getParcelableExtra<LightNovel>(EXTRA_LIGHT_NOVEL)

        Glide.with(this@DetailLN)
            .load(isi?.sampul)
            .into(dBind.imgSampulLn)

        with(dBind) {
            tvJudulLn.text = isi?.judul
            tvKeteranganLn.text = isi?.keterangan
            tvNamaPenulisIlustrator.text = isi?.namapenulisilustrator
            tvTahunTerbitLn.text = isi?.terbit
            tvNamaPenerbit.text = isi?.penerbit
            tvGenreLn.text = isi?.genre
            tvVolumeLn.text = isi?.volume
            tvLinkTokoResmiLn.text = isi?.tokoresmi
            tvDeskripsiLn.text = isi?.deskripsi
            tvPlotLn.text = isi?.plot
            tvSelengkapnyaLn.text = isi?.selengkapnya


            actionShare.setOnClickListener {
                val intent = Intent(Intent.ACTION_SEND)
                intent.putExtra(Intent.EXTRA_TEXT,
                    ("${isi?.judul} " + "\n\n${isi?.keterangan} " +

                            "\n\nPenulis & Illustrator   :" +
                            "\n"+
                            "\n${isi?.namapenulisilustrator} " +

                            "\n"+

                            "\n\nTerbit  :" +
                            "\n"+
                            "\n${isi?.terbit} " +

                            "\n"+

                            "\n\nPenerbit  :" +
                            "\n"+
                            "\n${isi?.penerbit} " +

                            "\n"+

                            "\n\nGenre  :" +
                            "\n"+
                            "\n${isi?.genre} " +

                            "\n"+

                            "\n\nVolume  :" +
                            "\n"+
                            "\n${isi?.volume} " +

                            "\n"+

                            "\n\nToko Resmi  :" +
                            "\n"+
                            "\n${isi?.tokoresmi} " +

                            "\n"+

                            "\n\nKeterangan    :" +
                            "\n"+
                            "\n${isi?.deskripsi}  " +

                            "\n"+

                            "\n\nPlot  :" +
                            "\n"+
                            "\n${isi?.plot}  " +

                            "\n"+

                            "\n\nSelengkapnya  :" +
                            "\n"+
                            "\n${isi?.selengkapnya}"))

                intent.type = "text/plain"
                startActivity(Intent.createChooser(intent, "Bagikan Detail Novel Ringan Ke"))
            }

            dBind.tvLinkTokoResmiLn.setOnClickListener{
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(isi?.tokoresmi)
                startActivity(intent)
            }

            dBind.tvSelengkapnyaLn.setOnClickListener{
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(isi?.selengkapnya)
                startActivity(intent)
            }

        }

        supportActionBar?.title = "Shousetsu Detail"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    companion object {
        const val EXTRA_LIGHT_NOVEL = "extra_light_novel"
    }
}
