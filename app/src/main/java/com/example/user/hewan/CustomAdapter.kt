package com.example.user.hewan

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(private val context: Activity,
                    private val gambar : Array<Int>,
                    private  val nama : Array<String>) : BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val inflater = context.layoutInflater
        val view = inflater.inflate(R.layout.listitem, null)

        val image = view.findViewById<ImageView>(R.id.imgitem)
        val text = view.findViewById<TextView>(R.id.txtItem)

        image.setImageResource(gambar[position])
        text.setText(nama[position])

        return view
    }

    override fun getItem(position: Int): Any {
        return gambar.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return gambar.size
    }
}