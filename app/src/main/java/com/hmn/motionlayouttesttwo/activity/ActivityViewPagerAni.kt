package com.hmn.motionlayouttesttwo.activity

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.hmn.motionlayouttesttwo.R
import com.hmn.motionlayouttesttwo.adapter.VPFAdapter
import com.hmn.motionlayouttesttwo.databinding.ActivityViewPagerAniBinding
import com.hmn.motionlayouttesttwo.fragment.BlueFragment
import com.hmn.motionlayouttesttwo.fragment.GreenFragment
import com.hmn.motionlayouttesttwo.fragment.RedFragment
import com.zhpan.indicator.enums.IndicatorSlideMode
import com.zhpan.indicator.enums.IndicatorStyle

class ActivityViewPagerAni : AppCompatActivity() {

    lateinit var binding:ActivityViewPagerAniBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewPagerAniBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val mFragmentList = ArrayList<Fragment>()
        mFragmentList.add(RedFragment())
        mFragmentList.add(BlueFragment())
        mFragmentList.add(GreenFragment())

        val vAdapter =
            VPFAdapter(this, mFragmentList)
        binding.viewPager.adapter = vAdapter

        //====indicator at below of viewpager====//
        binding.indicatorView.setSliderColor(Color.BLACK,Color.WHITE)
            .setSliderWidth(resources.getDimension(R.dimen.dimen_15dp))
            .setSliderHeight(resources.getDimension(R.dimen.dimen_5dp))
            .setSlideMode(IndicatorSlideMode.WORM)
            .setIndicatorStyle(IndicatorStyle.CIRCLE)
            .setupWithViewPager(binding.viewPager)

    }
}