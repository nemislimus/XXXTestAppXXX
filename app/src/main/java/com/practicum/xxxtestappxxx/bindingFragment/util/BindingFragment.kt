package com.practicum.xxxtestappxxx.bindingFragment.util

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BindingFragment<T : ViewBinding> : Fragment() {

    private var _binding: T? = null
    protected val binding: T get() = _binding!!

    /**Заполненый ViewBinding определяеться в наследнике*/
    abstract fun createBinding(inflater: LayoutInflater, container: ViewGroup?): T

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = createBinding(inflater, container)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        beforeDestroyBinding()
        _binding = null
    }

    /**Оставил для примера. В принципе Виталий прав,
    можно просто делать что нужно перед супер методом в наследнике
     **/
    open fun beforeDestroyBinding() {}

}