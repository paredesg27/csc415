package com.example.csc415base.ui



import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.andriodapptest.R


class OfficeDetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_office_detail, container, false)

        if (arguments != null){
            val officeDescriptions = listOf("0","1","2","3","4","5","6","7","8","9","10","10","12")

            val name ="Name: " + requireArguments().getString("name")
            val age = "Age: " + requireArguments().getInt("age").toString()
            val job = "Job: " + requireArguments().getString("job")
            val image = requireArguments().getString("image")
            val officeId = requireArguments().getInt("id")
            view.findViewById<TextView>(R.id.office_age).text = age
            view.findViewById<TextView>(R.id.office_job).text = job
            view.findViewById<TextView>(R.id.office_description).text = officeDescriptions[officeId]
            view.findViewById<TextView>(R.id.office_name).text = name
            Glide.with(requireContext()).load(image).override(1000).into(view.findViewById(R.id.office_image))


        }

        return view
    }
}
