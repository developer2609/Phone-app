package com.example.myphoneapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myphoneapp.Myphone.MyPhone
import com.example.myphoneapp.Myphone.MyPhoneAdapter
import com.example.myphoneapp.R
import com.example.myphoneapp.utils.MySharedPraference
import kotlinx.android.synthetic.main.activity_phonetypes.*

class Phonetypes : AppCompatActivity() {

    private lateinit var list: ArrayList<MyPhone>
    private lateinit var myPhoneAdapter: MyPhoneAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phonetypes)


        MySharedPraference.init(this)
        list=MySharedPraference.list

        myPhoneAdapter=MyPhoneAdapter(list,this)
        list_view_phone.adapter=myPhoneAdapter

        list_view_phone.setOnItemClickListener{adapterView,view,i,l ->
            val intent=Intent(this,InfoActivity::class.java)
            intent.putExtra("Keyname",i)
            startActivity(intent)

        }

    }
}