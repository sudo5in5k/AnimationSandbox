package com.example.animationsandbox

import android.graphics.drawable.TransitionDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        transition_iv.setOnTouchListener { _, _ ->
            val td = transition_iv.background as TransitionDrawable?
            td?.startTransition(1000)
            td?.reverseTransition(1000)
            false
        }

        fadein_iv.startAnimation(AnimationUtils.loadAnimation(this, R.anim.fadein))

        call_iv.startAnimation(AnimationUtils.loadAnimation(this, R.anim.rotate))

        search_iv.startAnimation(AnimationUtils.loadAnimation(this, R.anim.zoomin))

        like_iv.startAnimation(AnimationUtils.loadAnimation(this, R.anim.bounce))

        star_iv.startAnimation(AnimationUtils.loadAnimation(this, R.anim.blink))
    }
}
