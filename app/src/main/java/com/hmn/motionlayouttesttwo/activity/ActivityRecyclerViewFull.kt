package com.hmn.motionlayouttesttwo.activity

import android.app.Person
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hmn.motionlayouttesttwo.Pojo
import com.hmn.motionlayouttesttwo.R
import com.hmn.motionlayouttesttwo.adapter.PersonAdapter
import com.hmn.motionlayouttesttwo.databinding.ActivityRecyclerViewFullBinding

class ActivityRecyclerViewFull : AppCompatActivity() {
    lateinit var binding:ActivityRecyclerViewFullBinding
    lateinit var list:ArrayList<Pojo>
    lateinit var layoutManager:RecyclerView.LayoutManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerViewFullBinding.inflate(layoutInflater)
        setContentView(binding.root)
        layoutManager = LinearLayoutManager(this,RecyclerView.HORIZONTAL,true)
        binding.recyclerrFull.layoutManager = layoutManager
        initRecycler()

    }

    private fun initRecycler(){
        list = ArrayList<Pojo>()
        list.add(Pojo(R.drawable.david_backham,"David backham"))
        list.add(Pojo(R.drawable.jenny,"Jenny"))
        list.add(Pojo(R.drawable.ronaldinho,"Ronaldinho"))
        list.add(Pojo(R.drawable.ronaldo,"C Ronaldo"))
        list.add(Pojo(R.drawable.messi,"Leonal Messi"))
        list.add(Pojo(R.drawable.kin_jone_an,"Kin Jone An"))
        list.add(Pojo(R.drawable.mother_su,"Daw Aung San Su Kyi"))
        list.add(Pojo(R.drawable.hritik_roshan,"Hritik Roshan"))
        list.add(Pojo(R.drawable.ney_mar,"Neymar.jr"))
        val adapter = PersonAdapter(this,list)
        binding.recyclerrFull.adapter = adapter

    }

}