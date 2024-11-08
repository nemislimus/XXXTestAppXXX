package com.practicum.xxxtestappxxx.bindingFragment.presentation

import com.practicum.xxxtestappxxx.bindingFragment.domain.model.MyProduct

sealed interface FilterListState {
    object Loading : FilterListState
    data class Content(val data: List<MyProduct>) : FilterListState
}