package com.androidnavigation.auth

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import androidx.navigation.Navigation
import com.androidnavigation.auth.fragment.IntroFragment
import com.androidnavigation.main.MainActivity
import com.navigationjetpack.R

class AuthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
        if (isSignedIn()) {
            Navigation.findNavController(this, R.id.auth_host_fragment).navigate(R.id.mainActivity)
        }
    }

    fun isSignedIn(): Boolean {
        return true
    }
}