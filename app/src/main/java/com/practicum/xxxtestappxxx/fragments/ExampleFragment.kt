package com.practicum.xxxtestappxxx.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.practicum.xxxtestappxxx.databinding.FragmentExampleBinding

class ExampleFragment : Fragment() {

    private var _binding: FragmentExampleBinding? = null
    private val binding get() = _binding!!

    private var counter = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentExampleBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Установка начального значения
        binding.tvCounter.text = counter.toString()

        // Увеличение счетчика при клике
        binding.root.setOnClickListener {
            counter++
            binding.tvCounter.text = counter.toString()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}