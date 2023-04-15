package com.shiken.shousetsu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.shiken.shousetsu.adapter.LightNovelAdapter
import com.shiken.shousetsu.data.DataLN
import com.shiken.shousetsu.databinding.ActivityMainBinding
import com.shiken.shousetsu.dataclass.LightNovel

class MainActivity : AppCompatActivity() {

    //var buat list.addAll di bawah
    private var list: ArrayList<LightNovel> = arrayListOf()

    //bind
    private lateinit var mainBind: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBind.root)


        //panggil data yang di kelas DataLN
        list.addAll(DataLN.listData)

        mainBind.listLn.layoutManager = LinearLayoutManager(this)

        val lnAdapter = LightNovelAdapter(list)
        mainBind.listLn.adapter = lnAdapter


        supportActionBar?.title = "Shousetsu Daisuki!"


    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.profile, menu)
        return true

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean = when (item.itemId) {
        R.id.profileBtn -> {
            startActivity(Intent(this, AboutPage::class.java))
            true
        }
        else -> super.onOptionsItemSelected(item)
    }


}
