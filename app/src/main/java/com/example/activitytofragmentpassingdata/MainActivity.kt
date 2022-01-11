package com.example.activitytofragmentpassingdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var btn:Button
    lateinit var input_txt:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    btn = findViewById(R.id.sand_btn)
    input_txt= findViewById(R.id.edit_txt)

     val transition = this.supportFragmentManager.beginTransaction()

        btn.setOnClickListener {
            input_txt.visibility= View.GONE
            btn.visibility=View.GONE

            val bundle= Bundle()
            val input  = input_txt.text.toString()
            bundle.putString("input",input)

            val oneFragment =OneFragment()
            oneFragment.arguments= bundle
            transition.replace(R.id.content,oneFragment).commit()

        }

    }
}