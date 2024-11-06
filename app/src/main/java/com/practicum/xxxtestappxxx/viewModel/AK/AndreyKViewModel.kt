package com.practicum.xxxtestappxxx.viewModel.AK

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AndreyKViewModel : ViewModel() {

    private val liveData = MutableLiveData<List<String>>()

    init {
        liveData.postValue(
            listOf(
                "https://images.wallpapershq.com/wallpapers/5436/thumbnail_350x622.jpg",
                "https://images.wallpapershq.com/wallpapers/3153/thumbnail_350x622.jpg",
                "https://images.wallpapershq.com/wallpapers/7353/thumbnail_350x622.jpg",
                "https://images.wallpapershq.com/wallpapers/6924/thumbnail_350x622.jpg",
                "https://images.wallpapershq.com/wallpapers/5576/thumbnail_350x622.jpg",
                "https://images.wallpapershq.com/wallpapers/7312/thumbnail_350x622.jpg",
                "https://images.wallpapershq.com/wallpapers/5573/thumbnail_350x622.jpg",
                "https://images.wallpapershq.com/wallpapers/5809/thumbnail_350x622.jpg",
                "https://images.wallpapershq.com/wallpapers/7190/thumbnail_350x622.jpg",
                "https://images.wallpapershq.com/wallpapers/7799/thumbnail_350x622.jpg",
                "https://images.wallpapershq.com/wallpapers/5975/thumbnail_350x622.jpg",
                "https://images.wallpapershq.com/wallpapers/6075/thumbnail_350x622.jpg",
                "https://images.wallpapershq.com/wallpapers/4616/thumbnail_350x622.jpg",
                "https://images.wallpapershq.com/wallpapers/4403/thumbnail_350x622.jpg",
                "https://images.wallpapershq.com/wallpapers/6882/thumbnail_350x622.jpg",
                "https://images.wallpapershq.com/wallpapers/6369/thumbnail_350x622.jpg",
                "https://images.wallpapershq.com/wallpapers/7800/thumbnail_350x622.jpg",
                "https://images.wallpapershq.com/wallpapers/4289/thumbnail_350x622.jpg",
                "https://images.wallpapershq.com/wallpapers/4612/thumbnail_350x622.jpg",
                "https://images.wallpapershq.com/wallpapers/4419/thumbnail_350x622.jpg",
                "https://images.wallpapershq.com/wallpapers/6909/thumbnail_350x622.jpg",
                "https://images.wallpapershq.com/wallpapers/4404/thumbnail_350x622.jpg",
                "https://images.wallpapershq.com/wallpapers/5571/thumbnail_350x622.jpg",
                "https://images.wallpapershq.com/wallpapers/4622/thumbnail_350x622.jpg",
                "https://images.wallpapershq.com/wallpapers/4981/thumbnail_350x622.jpg",
                "https://images.wallpapershq.com/wallpapers/7236/thumbnail_350x622.jpg",
                "https://images.wallpapershq.com/wallpapers/4778/thumbnail_350x622.jpg",
                "https://images.wallpapershq.com/wallpapers/7295/thumbnail_350x622.jpg",
                "https://images.wallpapershq.com/wallpapers/3999/thumbnail_350x622.jpg",
                "https://images.wallpapershq.com/wallpapers/4296/thumbnail_350x622.jpg"
            )
        )
    }

    fun getLiveData(): LiveData<List<String>> {
        return liveData
    }
}