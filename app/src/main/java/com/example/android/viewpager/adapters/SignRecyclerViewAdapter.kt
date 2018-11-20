package com.example.android.viewpager.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.android.viewpager.R

class SignRecyclerViewAdapter(
        private val items: List<Pair<String, Int>>
):  RecyclerView.Adapter<SignRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val itemView = inflater.inflate(R.layout.sign_item, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        private val itemText: TextView = itemView.findViewById(R.id.sign_text)
        private val image: ImageView = itemView.findViewById(R.id.sign_image)

        fun onBind(item: Pair<String, Int>) {
            itemText.text = item.first
            image.setImageResource(item.second)
        }
    }
}