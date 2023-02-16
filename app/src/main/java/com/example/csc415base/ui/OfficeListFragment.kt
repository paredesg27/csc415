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
        inflater: LayoutInflater,
        container: ViewGroup?,
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
        val listImages = listOf(
            "https://static.wikia.nocookie.net/theoffice/images/9/96/Prisonmike.png/revision/latest?cb=20100327171549",
            "https://static.wikia.nocookie.net/theoffice/images/c/c5/Dwight_.jpg/revision/latest/scale-to-width-down/700?cb=20170701082424",
            "https://static.wikia.nocookie.net/theoffice/images/b/b2/2009Kevincropped.PNG/revision/latest/scale-to-width-down/700?cb=20170701083657",
            "https://static.wikia.nocookie.net/theoffice/images/e/e0/Character_-_RyanHoward.PNG/revision/latest?cb=20200414174545",
            "https://static.wikia.nocookie.net/theoffice/images/2/23/Stanley_Hudson.jpg/revision/latest/scale-to-width-down/700?cb=20170701085445",
            "https://static.wikia.nocookie.net/theoffice/images/2/20/2009Creed.jpg/revision/latest/scale-to-width-down/700?cb=20170701085348",
            "https://static.wikia.nocookie.net/theoffice/images/4/49/2009DarrylCroppeed.PNG/revision/latest/scale-to-width-down/700?cb=20170701085636",
            "https://static.wikia.nocookie.net/theoffice/images/6/67/Pam_Beesley.jpg/revision/latest/scale-to-width-down/700?cb=20170701084358",
            "https://static.wikia.nocookie.net/theoffice/images/e/e9/Character_-_JimHalpert.PNG/revision/latest?cb=20200414162003",
            "https://static.wikia.nocookie.net/theoffice/images/2/25/Oscar_Martinez.jpg/revision/latest/scale-to-width-down/700?cb=20170701085818",
            "https://static.wikia.nocookie.net/theoffice/images/0/0b/Angela_Martin.jpg/revision/latest/scale-to-width-down/700?cb=20170701090232",
            "https://static.wikia.nocookie.net/theoffice/images/6/69/Kelly_Kapoor.jpg/revision/latest/scale-to-width-down/700?cb=20170701090501",
            "https://static.wikia.nocookie.net/theoffice/images/e/e6/Phyllis_Vance.jpg/revision/latest/scale-to-width-down/700?cb=20170701090016",

            )
        for (i in 0..12) {
            characters.add(
                createCharacter(
                    listNames[i],
                    Random.nextInt(30, 60),
                    listImages[i],
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


