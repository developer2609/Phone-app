package com.example.myphoneapp.utils

import android.content.Context
import android.content.SharedPreferences
import com.example.myphoneapp.Myphone.MyPhone
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

object MySharedPraference {
    private const val Name="catch_file_name"
    private const val MODE= Context.MODE_PRIVATE
    private lateinit var preferences: SharedPreferences


    fun init (context: Context){

        preferences=context.getSharedPreferences(Name, MODE)

    }
    private  fun SharedPreferences.edit(operation: (SharedPreferences.Editor)->Unit){

        val editor=edit()
        operation(editor)
        editor.apply()

    }

    var list:ArrayList<MyPhone>
        get() =StringToList(preferences.getString("list","[]")!!)
        set(value) = preferences.edit {

            if (value!=null){
                it.putString("list",ListToString(value))

            }
        }

    fun StringToList(str:String): ArrayList<MyPhone> {

        val gson= Gson()
        val list=ArrayList<MyPhone>()
        val type=object : TypeToken<ArrayList<MyPhone>>(){}.type
        list .addAll(gson.fromJson(str,type))

        return list
    }

    fun ListToString(list: ArrayList<MyPhone>):String{
        return Gson().toJson(list)
    }

}