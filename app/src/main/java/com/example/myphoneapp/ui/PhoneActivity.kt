package com.example.myphoneapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.ListView
import android.widget.TextView
import com.example.myphoneapp.R
import kotlinx.android.synthetic.main.activity_phone.*

class PhoneActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone)

        phone1.setOnClickListener {
            startActivity(Intent(this,AddPhoneActivity::class.java))
        }
        phone2.setOnClickListener {
            startActivity(Intent(this,AddPhoneActivity::class.java))
        }
        phone3.setOnClickListener {
            startActivity(Intent(this,AddPhoneActivity::class.java))
        }
        phone4.setOnClickListener {
            startActivity(Intent(this,AddPhoneActivity::class.java))
        }
        phone5.setOnClickListener {
            startActivity(Intent(this,AddPhoneActivity::class.java))
        }
        phone6.setOnClickListener {
            startActivity(Intent(this,AddPhoneActivity::class.java))
        }


    }
}