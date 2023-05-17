package com.asadbek.spinner

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.TextView

// itemda imageview bor bo`lsa yoki boshqa viewlar qatnashsa BaseAdapter dan foydalanish yaxshi
class AdapterSpinner(context:Context,val list:ArrayList<String>):BaseAdapter(){
    override fun getCount(): Int {
     return list.size
    }
    override fun getItem(position: Int): Any {
        return list[position]
    }
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val itemView:View
        if (convertView == null){
            itemView = LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        }else{
            itemView = convertView
        }
        itemView.findViewById<TextView>(R.id.itemTxt).text = list[position]
        return itemView
    }
}