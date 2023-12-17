package com.example.project3_media_player

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.project3_media_player.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mediaPlayerUtil: MediaPlayerUtil

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
       setContentView(binding.root)

        mediaPlayerUtil = MediaPlayerUtil(this, R.raw.beat_02)

        binding.apply{
            startButton.setOnClickListener {
                mediaPlayerUtil.startMedia()
            }

            stopButton.setOnClickListener{
                mediaPlayerUtil.stopMedia()
            }
        }
    }
}