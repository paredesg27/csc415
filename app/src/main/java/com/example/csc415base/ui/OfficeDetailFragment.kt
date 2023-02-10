package com.example.csc415base.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.csc415base.R


class OfficeDetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_office_detail, container, false)

        if (arguments != null){
            val name = requireArguments().getString("name")
            val age = requireArguments().getString("age")
            view.findViewById<TextView>(R.id.office_age).text = age
        }

        return view
    }
}