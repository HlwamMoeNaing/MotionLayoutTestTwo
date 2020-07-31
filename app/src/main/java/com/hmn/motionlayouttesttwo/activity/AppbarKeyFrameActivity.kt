package com.hmn.motionlayouttesttwo.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout
import com.google.android.material.appbar.AppBarLayout
import com.hmn.motionlayouttesttwo.R

class AppbarKeyFrameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_appbar_key_frame)
        createAppBarMotion()
    }

    fun createAppBarMotion() {
        val appbarLayout = findViewById<AppBarLayout>(R.id.app_bar_layout)
        val motionlayout = findViewById<MotionLayout>(R.id.motion_layout)
        val listener = AppBarLayout.OnOffsetChangedListener { unused, verticalOffset ->
            val seePosition = -verticalOffset / appbarLayout.totalScrollRange.toFloat()
            motionlayout.progress = seePosition
        }
        appbarLayout.addOnOffsetChangedListener(listener)
    }
}