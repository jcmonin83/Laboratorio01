package com.example.laboratorio01.ui.gallery

import android.content.ContextWrapper
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView
import androidx.fragment.app.Fragment
import com.example.laboratorio01.R

class CardView01Activity : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.activity_card_view01,container,false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val mPlayer = view.findViewById<VideoView>(R.id.videoView01)
        mPlayer.setVideoPath("android.resource://${activity?.packageName}/${ com.example.laboratorio01.R.raw.laciudadperdida }")
        val mc:MediaController = MediaController(view.context)
        mc.setAnchorView(mPlayer)
        mPlayer.setMediaController(mc)
        mPlayer.start()
    }
}