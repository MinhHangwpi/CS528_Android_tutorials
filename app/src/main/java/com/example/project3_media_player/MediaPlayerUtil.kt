package com.example.project3_media_player

import android.content.Context
import android.media.MediaPlayer

class MediaPlayerUtil(private val context: Context, private val audioResourceId: Int) {

    private var mediaPlayer: MediaPlayer? = null

    fun startMedia(){
       if (mediaPlayer == null){
           mediaPlayer = MediaPlayer.create(context, audioResourceId)

           mediaPlayer?.isLooping = true

           mediaPlayer?.start()
       }

        mediaPlayer?.start()
    }

    fun stopMedia(){
       mediaPlayer?.stop()
       mediaPlayer?.release()
       mediaPlayer = null
    }
}