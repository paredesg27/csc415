package com.example.csc415base.ui

import android.os.Bundle
import android.print.PrintJob
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.csc415base.CharacterAdapter
import com.example.csc415base.Character
import com.example.csc415base.R
import kotlin.random.Random

class OfficeListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_office_list, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.office_recycler_view)

        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val characters = mutableListOf<Character>()
        val companiesList = listOf("Dunder-Mifflin", "Sabre", "Michael Scott Paper Company")
        val listNames = listOf(
            "Micheal Scott",
            "Dwight Schrute",
            "Kevin Malone",
            "Ryan Howard",
            "Stanley Hudson",
            "Creed Bratton",
            "Darryl Philbin",
            "Pam Beasley-Halpert",
            "Jim Halpert",
            "Oscar Martinez",
            "Angela Schrute",
            "Kelly Kapoor",
            "Phyliss Vance"
        )
        val listJobs = listOf(
            "Ex-Regional manager",
            "Regional manager",
            "Ex-Accountant",
            "Temporary Worker",
            "Retired",
            "Dead???",
            "Ex-Warehouse Foreman",
            "Ex-Officer Manager",
            "Ex-Assistant to the Regional manager",
            "Ex-accountant",
            "Head Accountant",
            "Ex-Human Resources",
            "Salesman"
        )

        for (i in 0..12) {
            characters.add(
                createCharacter(
                    listNames[i],
                    Random.nextInt(30, 60),
                    "https://d1zp01vk4nyewr.cloudfront.net/images/blog/_1200x630_crop_center-center_82_none/scott.jpg?mtime=1622137257",
                    listJobs[i],
                    i,
                    companiesList
                )
            )
        }

        val adapter = CharacterAdapter(characters)
        recyclerView.adapter = adapter

        return view
    }

    private fun createCharacter(
        name: String,
        age: Int,
        image: String,
        job: String,
        id: Int,
        companies: List<String>
    ) = Character(
        name = name,
        age = age,
        image = image,
        job = job,
        id = id,
        companies = companies
    )
}


