package com.hmn.motionlayouttesttwo.adapter


import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.hmn.motionlayouttesttwo.Pojo
import com.hmn.motionlayouttesttwo.databinding.EntityPersonBinding

class PersonAdapter(val context: Context, val list: List<Pojo>) :
    RecyclerView.Adapter<PersonAdapter.MyViewHolder>() {
    class MyViewHolder(b: EntityPersonBinding) : RecyclerView.ViewHolder(b.root) {
        var binding: EntityPersonBinding

        init {
            binding = b

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInfator = LayoutInflater.from(context)
        return MyViewHolder(EntityPersonBinding.inflate(layoutInfator, parent, false))
    }

    override fun getItemCount(): Int {
     return list.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       holder.binding.tvName.text = list[position].name
        Glide.with(context).load(list[position].img).into(holder.binding.imgThumb)
    }
}