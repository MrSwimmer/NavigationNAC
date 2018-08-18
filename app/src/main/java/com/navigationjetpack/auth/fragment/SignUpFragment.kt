package com.androidnavigation.auth.fragment

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.Navigation
import com.androidnavigation.main.MainActivity
import com.navigationjetpack.R
import kotlinx.android.synthetic.main.fragment_sign_up.view.*


class SignUpFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_sign_up, container, false)
        view.backButton.setOnClickListener({
            Navigation.findNavController(view).popBackStack()
        })
        view.signUpButton.setOnClickListener({
            Navigation.findNavController(view).navigate(R.id.action_signUpFragment_to_mainActivity)
        })
        return view
    }
}