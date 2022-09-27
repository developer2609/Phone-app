package com.example.myphoneapp.Myphone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myphoneapp.R
import com.example.myphoneapp.ui.AddPhoneActivity
import com.example.myphoneapp.ui.Phonetypes
import kotlinx.android.synthetic.main.activity_phone.*

class PhoneActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone2)



        phone1.setOnClickListener {
            startActivity(Intent(this, Phonetypes::class.java))
        }
        phone2.setOnClickListener {
            startActivity(Intent(this, Phonetypes::class.java))
        }
        phone3.setOnClickListener {
            startActivity(Intent(this, Phonetypes::class.java))
        }
        phone4.setOnClickListener {
            startActivity(Intent(this, Phonetypes::class.java))
        }
        phone5.setOnClickListener {
            startActivity(Intent(this, Phonetypes::class.java))
        }
        phone6.setOnClickListener {
            startActivity(Intent(this, Phonetypes::class.java))
        }



    }
}