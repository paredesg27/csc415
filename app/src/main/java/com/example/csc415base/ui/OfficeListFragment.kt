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
            "https://d1zp01vk4nyewr.cloudfront.net/images/blog/_1200x630_crop_center-center_82_none/scott.jpg?mtime=1622137257",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT4TjuN6VTO5xNRCHyPdHm1Gf1CAXSwRjRpvg&usqp=CAU",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTppTjguozjXk3WRtXC_UFP_1-LuSElPdn0sg&usqp=CAU",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTRspbfZiL1UHmEfSxyEa3FzGMZl0P4GpeQaw&usqp=CAU",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTy1L3tFWAq93Y3RPJzjI7WFdFEHe2f_OKepg&usqp=CAU",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRaxtWozMqJDG1PkdTEZTAjhnTu8jQ-KOgx4A&usqp=CAU",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTfWX794Vk1oZQt_c2KLHnNU7dCHVGwM-OArg&usqp=CAU",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQrSOTQQSRTkjzwEk3MvceivY6PyAAFPB4T2w&usqp=CAU",
            "https://www.looper.com/img/gallery/randall-park-forgetting-about-his-role-on-the-office-led-to-some-awkward-fan-encounters/intro-1669938075.jpg",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSzZppt6MXH_A_FIu0KVXcK93Xwb3Rd632Uig&usqp=CAU",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQiFIHUk9khEnuhFy3CBS0iCMpbg5P-NsTBTQ&usqp=CAU",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQiqBguHfwzVmhlz4H6QJpO9rkGaf4pL7Y60g&usqp=CAU",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRPq5O8om43i0AfRRLI4gFuf0F9a5OtGpV-Sw&usqp=CAU",

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


