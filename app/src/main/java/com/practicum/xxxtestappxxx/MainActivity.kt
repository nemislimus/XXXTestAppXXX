package com.practicum.xxxtestappxxx

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.practicum.xxxtestappxxx.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*
        Создаём каждый свой фрагмент с супер-лёгкой вёрсткой.
        Добавляем в MainFragment кнопку для перехода на свой фрагмент
        */

    }
}