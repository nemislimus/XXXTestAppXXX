package com.practicum.xxxtestappxxx

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class VacancyViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_vacancy_view)

        if (Intent.ACTION_VIEW == intent.action) {
            val uri = intent.data
            uri?.let {

                findViewById<TextView>(R.id.tvKey).text = it.getQueryParameter("key")
            }
        }
    }
}