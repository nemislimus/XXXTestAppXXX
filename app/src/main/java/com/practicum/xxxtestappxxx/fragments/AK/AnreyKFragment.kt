package com.practicum.xxxtestappxxx.fragments.AK

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.practicum.xxxtestappxxx.R
import com.practicum.xxxtestappxxx.viewModel.AK.AndreyKViewModel

class AnreyKFragment : Fragment() {

    private val vModel: AndreyKViewModel by lazy {
        ViewModelProvider(requireActivity())[AndreyKViewModel::class]
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return LayoutInflater.from(requireContext())
            .inflate(R.layout.frarment_andrey_k, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        vModel.getLiveData().observe(viewLifecycleOwner) { list ->

            getView()?.findViewById<RecyclerView>(R.id.imageList)?.let {

                it.layoutManager =
                    GridLayoutManager(requireContext(), 2, LinearLayoutManager.VERTICAL, false)

                it.adapter = DogImageAdapter(list)
            }
        }
    }
}