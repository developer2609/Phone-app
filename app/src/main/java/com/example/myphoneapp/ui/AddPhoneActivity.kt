package com.example.myphoneapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myphoneapp.Myphone.MyPhone
import com.example.myphoneapp.R
import com.example.myphoneapp.utils.MySharedPraference
import kotlinx.android.synthetic.main.activity_add_phone2.*

class AddPhoneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_phone2)
        MySharedPraference.init(this)

        btn_save.setOnClickListener{
            val turi=edt_name.text.toString().trim()
            val features=phone_features.text.toString().trim()

            if (turi!=""&& features!=""){

                val myPhone=MyPhone(turi,features)
                val list=MySharedPraference.list
                list.add(myPhone)
                MySharedPraference.list=list
                Toast.makeText(this, "saqlandi", Toast.LENGTH_SHORT).show()
                finish()
            }else{

                Toast.makeText(this, "malumotni to'liq kiriting", Toast.LENGTH_SHORT).show()
            }

        }
    }
}