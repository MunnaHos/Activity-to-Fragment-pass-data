package com.example.activitytofragmentpassingdata

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class OneFragment : Fragment() {
    lateinit var txt:TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view= inflater.inflate(R.layout.fragment_one, container, false)
         txt = view.findViewById(R.id.textView)

    val bundle =arguments
    val output = bundle?.getString("input")
    txt.text= output



        return view
    }


}