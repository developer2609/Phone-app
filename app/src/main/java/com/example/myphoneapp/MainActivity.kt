package com.example.myphoneapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myphoneapp.Myphone.PhoneActivity2
import com.example.myphoneapp.ui.PhoneActivity
import com.example.myphoneapp.ui.Phonetypes
import com.example.myphoneapp.utils.PhoneVarietyActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_phone.setOnClickListener{
            startActivity(Intent(this,PhoneActivity2::class.java))


        }
        btn_add_phone.setOnClickListener{
         startActivity(Intent(this,PhoneActivity::class.java))
        }

    }
}