package com.example.laboratorio01.ui.gallery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import android.widget.VideoView
import androidx.fragment.app.Fragment
import com.example.laboratorio01.R

class CardView04Activity : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.activity_card_view04,container,false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val mPlayer = view.findViewById<VideoView>(R.id.videoView04)
        mPlayer.setVideoPath("android.resource://${activity?.packageName}/${ com.example.laboratorio01.R.raw.secretsdumbledore }")
        val mc: MediaController = MediaController(view.context)
        mc.setAnchorView(mPlayer)
        mPlayer.setMediaController(mc)
        mPlayer.start()
    }
}