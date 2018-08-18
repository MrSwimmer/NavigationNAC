package com.androidnavigation.auth.fragment

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.Navigation
import com.androidnavigation.main.MainActivity
import com.navigationjetpack.R
import kotlinx.android.synthetic.main.fragment_sign_in.view.*


class SignInFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_sign_in, container, false)
        view.gotoRegButton.setOnClickListener({
            Navigation.findNavController(view).navigate(R.id.action_signInFragment_to_signUpFragment)
        })
        view.signInButton.setOnClickListener({
            Navigation.findNavController(view).navigate(R.id.action_signInFragment_to_mainActivity)
        })
        return view
    }
}