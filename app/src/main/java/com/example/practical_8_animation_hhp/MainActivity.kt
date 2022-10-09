package com.example.practical_8_animation_hhp

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.WindowCompat
import com.example.practical_8_animation_hhp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var alarmFrameAnimation:AnimationDrawable
    private  lateinit var heartFrameAnimation:AnimationDrawable
    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window,false)
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    //        setSupportActionBar(binding.toolbar)
        //setting an animation list.xml as the backgroung of imageView
        binding.imageAlarmFrame.setBackgroundResource(R.drawable.alarm_animation_list)
        //TypeCasting the Animation Drawable
        alarmFrameAnimation=binding.imageAlarmFrame.background as AnimationDrawable
        binding.imageHeartFrame.setBackgroundResource(R.drawable.heart_animation_list)
        // Typecasting the Animation Drawable
        heartFrameAnimation = binding.imageHeartFrame.background as AnimationDrawable
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus){
            // starting the animation when in Focus
            alarmFrameAnimation.start()
            heartFrameAnimation.start()
        }
        else{
            alarmFrameAnimation.stop()
            heartFrameAnimation.stop()
        }
    }
}