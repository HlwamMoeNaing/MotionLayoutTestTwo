package com.hmn.motionlayouttesttwo.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hmn.motionlayouttesttwo.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_img_swipe.setOnClickListener {
            startActivity(Intent(this,
                ImageSwipAndResize::class.java))
        }
        btn_resize.setOnClickListener {
            startActivity(Intent(this, ResizeText::class.java))
        }

        btn_recycler.setOnClickListener {
            startActivity(Intent(this,
                RecyclerAnimation::class.java))
        }
        btn_viewPager.setOnClickListener {
            startActivity(Intent(this,
                ActivityViewPagerAni::class.java))
        }
        btn_recycler_full.setOnClickListener {
            startActivity(Intent(this,
                ActivityRecyclerViewFull::class.java))
        }

        btn_key_circle.setOnClickListener {
            startActivity(Intent(this,
                ActivityKeyCircle::class.java))
        }

        btn_swipe.setOnClickListener {
            startActivity(Intent(this,
                ActivityOnSwipe::class.java))
        }
        btn_circle_animate.setOnClickListener {
            startActivity(Intent(this,
                CircleAnimationActivity::class.java))
        }
        btn_star_animate.setOnClickListener {
            startActivity(Intent(this,
                StarActivityMotion::class.java))
        }

        btn_appbar_animate.setOnClickListener {
            startActivity(Intent(this,
                AppbarKeyFrameActivity::class.java))
        }
    }
}