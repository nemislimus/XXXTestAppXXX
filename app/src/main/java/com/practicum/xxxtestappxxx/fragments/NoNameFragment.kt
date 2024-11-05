package com.practicum.xxxtestappxxx.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.practicum.xxxtestappxxx.R
import com.practicum.xxxtestappxxx.databinding.FragmentNoNameBinding

class NoNameFragment: Fragment() {
    private var _binding: FragmentNoNameBinding? = null
    private val bindind: FragmentNoNameBinding
        get() = _binding!!

    private var clickFlag = true

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentNoNameBinding.inflate(inflater, container, false)
        return bindind.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bindind.tvText.setOnClickListener {

            bindind.tvText.setTextColor(changeColor())
        }
    }

    private fun changeColor(): Int {
        if (clickFlag) {
            clickFlag = false
            return requireContext().getColor(R.color.crimson)
        } else {
            clickFlag = true
            return requireContext().getColor(R.color.blue)
        }
    }
}