package com.practicum.xxxtestappxxx.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.practicum.xxxtestappxxx.R
import com.practicum.xxxtestappxxx.databinding.FragmentMainBinding


class MainFragment: Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding: FragmentMainBinding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNoName.setOnClickListener {
            findNavController().navigate(
                R.id.action_mainFragment_to_noNameFragment
            )
        }

        binding.btnVitaly.setOnClickListener {
            findNavController().navigate(
                R.id.action_mainFragment_to_vitalyFragment
            )
        }

        binding.btnArtemSFragment.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_artemSFragment)
        }


    }
}