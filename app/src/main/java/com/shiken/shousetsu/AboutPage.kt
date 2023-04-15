package com.shiken.shousetsu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shiken.shousetsu.databinding.AboutPageBinding

class AboutPage : AppCompatActivity() {

    private lateinit var profpageBinding : AboutPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        profpageBinding = AboutPageBinding.inflate(layoutInflater)
        setContentView(profpageBinding.root)

        supportActionBar?.title = "About"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
