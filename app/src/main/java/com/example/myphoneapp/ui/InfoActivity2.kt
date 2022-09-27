package com.example.myphoneapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myphoneapp.Myphone.MyPhone
import com.example.myphoneapp.R
import com.example.myphoneapp.utils.MySharedPraference
import kotlinx.android.synthetic.main.activity_add_phone2.*
import kotlinx.android.synthetic.main.item_list.*

class InfoActivity2 : AppCompatActivity() {

    private lateinit var myPhone: MyPhone
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info2)



      text_item.setOnClickListener {

        startActivity(Intent(this,InfoActivity2::class.java))



      }


    }
}