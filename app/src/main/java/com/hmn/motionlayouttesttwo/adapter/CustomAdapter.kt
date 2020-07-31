package com.hmn.motionlayouttesttwo.adapter

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.hmn.motionlayouttesttwo.Model
import com.hmn.motionlayouttesttwo.R
import com.hmn.motionlayouttesttwo.activity.DetailActivity
import com.hmn.motionlayouttesttwo.databinding.EntityNewBinding
import java.net.URL

class CustomAdapter(val list: List<Model>, val context: Context) :
    RecyclerView.Adapter<CustomAdapter.MyViewHolder>() {

    class MyViewHolder(b: EntityNewBinding) :
        RecyclerView.ViewHolder(b.getRoot()) {
        var binding: EntityNewBinding

        init {
            binding = b
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(context)
        return MyViewHolder(
            EntityNewBinding.inflate(layoutInflater, parent, false)
        )

    }

    override fun getItemCount(): Int {
      return list.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        try {

            val img_thumb_url = URL(list[position].img_thumb + "")
            Log.d("img_thumb_url", img_thumb_url.toString())
            val option = RequestOptions().centerCrop().placeholder(R.mipmap.ic_launcher_round)
                .error(R.mipmap.ic_launcher_round)
            Glide.with(context).load(img_thumb_url).apply(option).into(holder.binding.imgThumb)
            holder.binding.tvNewSource.text = list[position].news_source
            holder.binding.tvNewTittle.text = list[position].news_title
            holder.binding.tvNewDesc.text = list[position].news_desc
            holder.binding.tvNewCategory.text = list[position].news_category
            holder.binding.tvNewDate.text = list[position].news_date

            val img_source_logo_url = URL(list[position].new_source_logo + "")
            Log.d("img_source_logo_url", img_source_logo_url.toString())
            Glide.with(context).load(img_source_logo_url).apply(option).into(holder.binding.imgNewSourceLogo)
            // ...code for go to detail start.....//
            holder.binding.imgThumb.setOnClickListener {
                val intent = Intent(context,
                    DetailActivity::class.java)
                intent.putExtra("img_thumb_url",img_thumb_url.toString())
                intent.putExtra("news_source",list[position].news_source)
                intent.putExtra("news_title",list[position].news_title)
                intent.putExtra("news_desc",list[position].news_desc)
                intent.putExtra("img_source_logo_url",img_source_logo_url.toString())
                intent.putExtra("news_category",list[position].news_category)
                intent.putExtra("news_date",list[position].news_date)
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                context.startActivity(intent)
            }

            //========code for go to detail end======//





        } catch (e: Exception) {
            e.printStackTrace()
        }
    }


}