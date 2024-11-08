package com.practicum.xxxtestappxxx.bindingFragment.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.lifecycle.ViewModelProvider
import com.practicum.xxxtestappxxx.bindingFragment.domain.model.MyProduct
import com.practicum.xxxtestappxxx.bindingFragment.presentation.FilterListState
import com.practicum.xxxtestappxxx.bindingFragment.presentation.FilterListViewModel
import com.practicum.xxxtestappxxx.bindingFragment.util.FilterFragment
import com.practicum.xxxtestappxxx.databinding.FragmentFilterListBinding

class FilterListFragment : FilterFragment<FragmentFilterListBinding>() {

    private val viewModel by lazy {
        ViewModelProvider(this)[FilterListViewModel::class.java]
    }

    private val listAdapter: FilterListAdapter by lazy {
        FilterListAdapter(object : FilterListAdapter.Listener {
            override fun itemOnClickListener(item: MyProduct) {
                Toast.makeText(requireContext(), "Нажатие на ${item.name}", Toast.LENGTH_SHORT)
                    .show()
            }
        })
    }

    override fun getToolbarPanel(): Toolbar {
        return binding.tbPanel
    }

    override fun filterCmdOnClick() {
        Toast.makeText(requireContext(), "Нажатие на кнопку фильтр", Toast.LENGTH_SHORT).show()
    }

    override fun createBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
    ): FragmentFilterListBinding {
        return FragmentFilterListBinding.inflate(inflater, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.getProdListOne()

        binding.rvList.adapter = listAdapter

        binding.btnV1.setOnClickListener {
            viewModel.getProdListOne()
        }

        binding.btnV2.setOnClickListener {
            viewModel.getProdListTwo()
        }

        binding.btnV3.setOnClickListener {
            viewModel.getProdListTree()
        }

        viewModel.stateLiveDataObserver().observe(viewLifecycleOwner){
            render(it)
        }

    }

    private fun render(state: FilterListState) {
        when (state) {
            is FilterListState.Content -> {
                listAdapter.submitList(state.data)
            }

            FilterListState.Loading -> {}
        }
    }

}