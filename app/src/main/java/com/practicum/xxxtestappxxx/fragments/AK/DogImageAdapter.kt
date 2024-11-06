package com.practicum.xxxtestappxxx.fragments.AK

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.practicum.xxxtestappxxx.R

class DogImageAdapter(private val list: List<String>) : RecyclerView.Adapter<DogImageViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogImageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.dog_in_list, parent, false)
        return DogImageViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: DogImageViewHolder, position: Int) {
        holder.bind(list[position])
    }
}