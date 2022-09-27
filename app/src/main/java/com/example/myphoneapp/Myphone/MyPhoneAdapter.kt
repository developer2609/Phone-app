package com.example.myphoneapp.Myphone

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.appcompat.view.menu.MenuView
import com.example.myphoneapp.R
import kotlinx.android.synthetic.main.item_list.view.*

class MyPhoneAdapter(val list:ArrayList<MyPhone>,context: Context):ArrayAdapter<MyPhone>(context, R.layout.item_list,list){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val itemView:View
        if (convertView==null){
            itemView=LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false)

        }else{
            itemView=convertView
        }
      itemView.text_item.text=getItem(position)?.name
        return itemView
    }
}