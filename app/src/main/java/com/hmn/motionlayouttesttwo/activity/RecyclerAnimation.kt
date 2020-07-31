package com.hmn.motionlayouttesttwo.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hmn.motionlayouttesttwo.adapter.CustomAdapter
import com.hmn.motionlayouttesttwo.Model
import com.hmn.motionlayouttesttwo.databinding.ActivityRecyclerAnimationBinding

class RecyclerAnimation : AppCompatActivity() {
    lateinit var binding: ActivityRecyclerAnimationBinding
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var list: ArrayList<Model>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerAnimationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        layoutManager = LinearLayoutManager(this)
        binding.myRecyclerView.layoutManager = layoutManager
        list = ArrayList<Model>()
        list.add(
            Model(
                "https://image-ticketfly.imgix.net/00/01/61/65/25-og.jpg?w=500&h=334&fit=crop&crop=top",
                "Youtube",
                "what new in android Gaming",
                "This is Short Description of my Demo,This is Short Description of my Demo,This is Short Description of my Demo,This is Short Description of my Demo",
                "https://ichef.bbci.co.uk/news/660/cpsprodpb/1094D/production/_108471976_95214ef6-d0b9-462c-98e9-9d0a86f2d135.jpg",
                "Android Developer",
                "june 10,2018"
            )
        )

        list.add(
            Model(
                "https://miro.medium.com/max/2400/1*9QwZkXU_gfk5FJotW-dCnA.jpeg",
                "Facebook",
                "what new in android Gaming",
                "You are stupid,made more practice,You are stupid,made more practice,You are stupid,made more practice,You are stupid,made more practice ",
                "https://miro.medium.com/max/2400/1*9QwZkXU_gfk5FJotW-dCnA.jpeg",
                "Game Developer",
                "May 31,2020"
            )
        )


        list.add(
            Model(
                "https://www.indiewire.com/wp-content/uploads/2019/06/joker-movie-fb.jpg?w=768",
                "Instragam",
                "what new in android Gaming",
                "Instagram is good social network,Instagram is good social network,Instagram is good social network,Instagram is good social network.",
                "https://www.indiewire.com/wp-content/uploads/2019/06/joker-movie-fb.jpg?w=768",
                "IOS Developer",
                "Dec 18,2017"
            )
        )

        list.add(
            Model(
                "https://ichef.bbci.co.uk/news/660/cpsprodpb/1094D/production/_108471976_95214ef6-d0b9-462c-98e9-9d0a86f2d135.jpg",
                "Twitter",
                "what new in android Gaming",
                "Twitter feel me annoy,Twitter feel me annoy,Twitter feel me annoy,Twitter feel me annoy",
                "https://ichef.bbci.co.uk/news/660/cpsprodpb/1094D/production/_108471976_95214ef6-d0b9-462c-98e9-9d0a86f2d135.jpg",
                "Web Developer",
                "August 9,2020"
            )
        )

        val customAdapter =
            CustomAdapter(list, this)
        binding.myRecyclerView.adapter = customAdapter

    }
}