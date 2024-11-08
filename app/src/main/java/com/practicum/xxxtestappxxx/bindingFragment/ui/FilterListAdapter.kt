package com.practicum.xxxtestappxxx.bindingFragment.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.practicum.xxxtestappxxx.R
import com.practicum.xxxtestappxxx.bindingFragment.domain.model.MyProduct

/** Список item тут зашит в сам ListAdapter и отдельно не указывается */
class FilterListAdapter(private val listener: Listener) :
    ListAdapter<MyProduct, FilterListAdapter.FilterHolder>(ItemComparator()) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilterHolder {
        val viewHolder = LayoutInflater.from(parent.context).inflate(
            R.layout.list_item, parent, false
        )
        return FilterHolder(viewHolder)
    }

    override fun onBindViewHolder(holder: FilterHolder, position: Int) {
        holder.bind(getItem(position))
    }


    class FilterHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val tvText1: TextView
        private val tvText2: TextView

        init {
            tvText1 = itemView.findViewById(R.id.tv_text1)
            tvText2 = itemView.findViewById(R.id.tv_text2)
        }

        fun bind(item: MyProduct) {

            tvText1.text = item.name
            tvText2.text = item.description

        }
    }

    interface Listener {
        fun itemOnClickListener(item: MyProduct)
    }

    private class ItemComparator : DiffUtil.ItemCallback<MyProduct>() {
        override fun areItemsTheSame(oldItem: MyProduct, newItem: MyProduct): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: MyProduct, newItem: MyProduct): Boolean {
            return oldItem == newItem
        }

    }

}