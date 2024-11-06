package com.practicum.xxxtestappxxx.fragments.AK

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.practicum.xxxtestappxxx.R

class DogImageViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    fun bind(url: String) {
        val image = itemView.findViewById<ImageView>(R.id.image)
        Glide.with(image).load(url).centerCrop().into(image)
    }
}