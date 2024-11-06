package com.practicum.xxxtestappxxx.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.practicum.xxxtestappxxx.databinding.FragmentArtemSBinding

class ArtemSFragment : Fragment() {

    private var _binding: FragmentArtemSBinding? = null
    private val binding: FragmentArtemSBinding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentArtemSBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}