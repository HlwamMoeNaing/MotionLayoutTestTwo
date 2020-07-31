package com.hmn.motionlayouttesttwo.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.hmn.motionlayouttesttwo.R
import com.hmn.motionlayouttesttwo.databinding.ActivityDetailBinding

@Suppress("NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
class DetailActivity : AppCompatActivity() {
    lateinit var binding:ActivityDetailBinding
    lateinit var img_thumb_url:String
    lateinit var news_source:String
    lateinit var news_title:String
    lateinit var news_desc:String
    lateinit var img_source_logo_url:String
    lateinit var news_category:String
    lateinit var news_date:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        img_thumb_url = intent.getStringExtra("img_thumb_url")
        news_source = intent.getStringExtra("news_source")
        news_title = intent.getStringExtra("news_title")
        news_desc = intent.getStringExtra("news_desc")
        img_source_logo_url = intent.getStringExtra("img_source_logo_url")
        news_category = intent.getStringExtra("news_category")
        news_date = intent.getStringExtra("news_date")







        val option = RequestOptions().centerCrop().placeholder(R.mipmap.ic_launcher_round)
            .error(R.mipmap.ic_launcher_round)
        Glide.with(this).load(img_thumb_url).apply(option).into(binding.imgThumb)
        binding.tvNewSource.text = news_source
        binding.tvNewTittle.text = news_title
        binding.tvNewDesc.text = news_desc
        binding.tvNewCategory.text = news_category
        binding.tvNewDate.text = news_date


        Log.d("img_source_logo_url", img_source_logo_url.toString())
        Glide.with(this).load(img_source_logo_url).apply(option).into(binding.imgNewSourceLogo)
    }
}