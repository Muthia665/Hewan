package com.example.user.hewan

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var imageList = arrayOf(
        R.drawable.anjing, R.drawable.badak, R.drawable.beruang, R.drawable.gajah, R.drawable.jerapah,
        R.drawable.kanguru, R.drawable.koceng, R.drawable.komodo, R.drawable.kuda, R.drawable.macan,
        R.drawable.panda, R.drawable.rusa, R.drawable.semut, R.drawable.serigala, R.drawable.singa)

    var textList = arrayOf("Ini Hewan Anjing", "Ini Hewan Badak", "Ini Hewan Beruang", "Ini Hewan Gajah", "Ini Hewan Jerapah",
                            "Ini Hewan Kanguru", "Ini Hewan Koceeeng", "Ini Hewan Komodo", "Ini Hewan Kuda", "Ini Hewan Macan",
                            "Ini Hewan Panda", "Ini Hewan Rusa", "Ini Hewan Semut", "Ini Hewan Serigala", "Ini Hewan Singa")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listview)

        val adapter = CustomAdapter(this@MainActivity, imageList, textList)

        listView.adapter = adapter

        listView.onItemClickListener = object : AdapterView.OnItemClickListener{
            override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(this@MainActivity,""+textList[position], Toast.LENGTH_SHORT).show()

                val intent = Intent(this@MainActivity, Main2Activity::class.java)
                intent .putExtra("text", textList[position])
                intent .putExtra("image", imageList[position])
                startActivity(intent)
            }
        }
    }
}
