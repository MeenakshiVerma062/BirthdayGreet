package com.example.helloapp.ui

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.helloapp.R
import com.example.helloapp.databinding.ActivityBirthdayBinding

class BirthdayActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
private lateinit var activityBinding: ActivityBirthdayBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityBinding = ActivityBirthdayBinding.inflate(layoutInflater)
        setContentView(activityBinding.root)

        onclick()
    }

    private fun onclick(){

    }

}