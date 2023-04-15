package com.shiken.shousetsu.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.shiken.shousetsu.DetailLN
import com.shiken.shousetsu.databinding.ListLightNovelBinding
import com.shiken.shousetsu.dataclass.LightNovel

class LightNovelAdapter(private var lightnovel: ArrayList<LightNovel>) :  RecyclerView.Adapter<LightNovelAdapter.LightNovelViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LightNovelViewHolder {
        val adapter = ListLightNovelBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LightNovelViewHolder(adapter)
    }

    override fun onBindViewHolder(holder: LightNovelViewHolder, position: Int) {
        holder.bindLN(lightnovel[position])
    }

    override fun getItemCount(): Int {
       return lightnovel.size
    }

    inner class LightNovelViewHolder (private val lnBind: ListLightNovelBinding) : RecyclerView.ViewHolder(lnBind.root) {

        fun bindLN(l : LightNovel)   {
            with(lnBind){
                tvJudulLn.text = l.judul
                tvKeteranganLn.text = l.keterangan
            }

            Glide.with(itemView)
                .load(l.sampul)
                .into(lnBind.imgSampulLn)

            itemView.setOnClickListener {
                val intent = Intent(itemView.context, DetailLN::class.java)
                intent.putExtra(DetailLN.EXTRA_LIGHT_NOVEL, l)
                itemView.context.startActivity(intent)
            }
        }
    }
}
