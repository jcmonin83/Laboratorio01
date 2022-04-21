package com.example.laboratorio01.ui.gallery

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.core.widget.NestedScrollView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.example.laboratorio01.R

class GalleryFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_gallery,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val cardView1 = view.findViewById<CardView>(R.id.cardView01)
        cardView1.setOnClickListener { cardView ->
            Navigation.findNavController(view).navigate(R.id.nav_gallery_to_cardView01)
        }
        val cardView2 = view.findViewById<CardView>(R.id.cardView02)
        cardView2.setOnClickListener { cardView ->
            Navigation.findNavController(view).navigate(R.id.nav_gallery_to_cardView02)
        }
        val cardView3 = view.findViewById<CardView>(R.id.cardView03)
        cardView3.setOnClickListener { cardView ->
            Navigation.findNavController(view).navigate(R.id.nav_gallery_to_cardView03)
        }
        val cardView4 = view.findViewById<CardView>(R.id.cardView04)
        cardView4.setOnClickListener { cardView ->
            Navigation.findNavController(view).navigate(R.id.nav_gallery_to_cardView04)
        }
        val cardView5 = view.findViewById<CardView>(R.id.cardView05)
        cardView5.setOnClickListener { cardView ->
            Navigation.findNavController(view).navigate(R.id.nav_gallery_to_cardView05)
        }
    }
}