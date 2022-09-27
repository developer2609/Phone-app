package com.example.myphoneapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myphoneapp.Myphone.MyPhone
import com.example.myphoneapp.R
import com.example.myphoneapp.utils.MySharedPraference
import kotlinx.android.synthetic.main.activity_add_phone2.*

class InfoActivity : AppCompatActivity() {
    private lateinit var myPhone: MyPhone
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)


        val index=intent.getIntExtra("Keyname",0)
        MySharedPraference.init(this)

        myPhone=MySharedPraference.list[index]
        edt_name.text=myPhone.name

    }
}