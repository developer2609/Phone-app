package com.example.myphoneapp.utils

import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.myphoneapp.R
import kotlinx.android.synthetic.main.item_phonelist.view.*

private const val TAG = "PhoneVarietyActivity"

class PhoneVarietyActivity : AppCompatActivity() {
    private lateinit var linearLayout: LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_variety)

        linearLayout = findViewById(R.id.linear_conter)
        loadDate()


        MySharedPraference.init(this)
        Log.d(TAG, "onCreate: ${MySharedPraference.list}")


    }

    private fun loadDate() {
        val item1 = layoutInflater.inflate(R.layout.item_phonelist, null, false)
        item1.tv_item.text = "Iphpne"
        linearLayout.addView(item1)
    }
}