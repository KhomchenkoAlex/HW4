package com.example.android.viewpager.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android.viewpager.R
import com.example.android.viewpager.adapter.SignRecyclerViewAdapter
import com.example.android.viewpager.decorator.ItemDecorator
import com.example.android.viewpager.enums.Signs

class SignFragment: Fragment(){

    private val columns = 3
    private val signsList = Signs.values().map { it -> Pair(it.signName, it.image) }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.sign_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView = view.findViewById<RecyclerView>(R.id.sign_recycler_view)
        recyclerView.layoutManager = GridLayoutManager(context, columns)
        recyclerView.adapter = SignRecyclerViewAdapter(signsList)
        recyclerView.addItemDecoration(ItemDecorator())
    }
}