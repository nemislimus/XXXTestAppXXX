package com.practicum.xxxtestappxxx.bindingFragment.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.practicum.xxxtestappxxx.bindingFragment.domain.model.MyProduct

class FilterListViewModel : ViewModel() {

    private val stateLiveData = MutableLiveData<FilterListState>()
    fun stateLiveDataObserver(): LiveData<FilterListState> = stateLiveData

    fun getProdListOne() {

        val list = mutableListOf<MyProduct>()
        list.add(MyProduct(1, "Батон", "Хлеб/Мучное"))
        list.add(MyProduct(2, "Колесо", "Для машины"))
        list.add(MyProduct(3, "Полка", "Мебель"))

        render(FilterListState.Content(list))

    }

    fun getProdListTwo() {

        val list = mutableListOf<MyProduct>()
        list.add(MyProduct(6, "Бампер", "Для машины"))
        list.add(MyProduct(1, "Батон", "Хлеб/Мучное"))
        list.add(MyProduct(3, "Полка", "Мебель"))

        render(FilterListState.Content(list))

    }

    fun getProdListTree() {

        val list = mutableListOf<MyProduct>()
        list.add(MyProduct(36, "Шкаф", "Мебель"))
        list.add(MyProduct(31, "Зеркало", "Мебель"))
        list.add(MyProduct(3, "Полка", "Мебель"))
        list.add(MyProduct(6, "Бампер", "Для машины"))

        render(FilterListState.Content(list))

    }


    private fun render(state: FilterListState) {
        stateLiveData.postValue(state)
    }

}