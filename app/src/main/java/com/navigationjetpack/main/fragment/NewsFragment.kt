package com.androidnavigation.main.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.Navigation
import com.navigationjetpack.R
import kotlinx.android.synthetic.main.fragment_news.view.*

class NewsFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_news, container, false)
        view.postButton.setOnClickListener({
            val bundle = Bundle()
            bundle.putString("id", "1")
            Navigation.findNavController(view).navigate(R.id.action_newsFragment_to_postFragment, bundle)
        })
        return view
    }
}