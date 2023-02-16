package com.example.csc415base.ui


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.csc415base.R


class OfficeDetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_office_detail, container, false)

        if (arguments != null) {
            val officeDescriptions = listOf(
                "Michael Gary Scott is a fictional character and the protagonist of the NBC sitcom, The Office, portrayed by Steve Carell. Michael serves as the regional manager of the Scranton, Pennsylvania branch of paper company, Dunder Mifflin Inc. ",
                "Dwight Kurt Schrute III (born January 20, 1970) is a fictional character on The Office who is portrayed by Rainn Wilson. He is one of the highest-ranking salesmen as well as the original assistant to the regional manager, (disputed)[2], and former Assistant Regional Manager at the paper distribution company Dunder Mifflin. Additionally, he is a bed-and-breakfast proprietor at Schrute Farms, a beet plantation owner, and an owner of the business park in which Dunder Mifflin exists.",
                "Kevin is typically quite subdued, although he is known for making blunt or offensive comments regarding the other employees.",
                "Ryan Bailey Howard is an American salesman, former receptionist, and convicted fraudster who works at Dunder Mifflin. He was a temporary employee until he is promoted as Vice President of Sales. However, David Wallace demotes him when the Michael Scott Paper Company is acquired by Dunder Mifflin. He also worked at the Michael Scott Paper Company until the acquisition. ",
                "Stanley Hudson (born July 14, 1951) is a fictional character played by Leslie David Baker in the television series The Office. He is a salesman at Dunder Mifflin Scranton and sits across from Phyllis Vance.",
                "Creed Rowland Bratton (claims to have been born November 1, 1925) is a character from the U.S. television series The Office. Confusion may arise from the fact that the character is played by and partially based on the musician of the same name, Creed Bratton.",
                "Darryl Philbin (born October 25, 1971), is the foreman of the warehouse of the Scranton branch of fictitious paper distributor Dunder Mifflin. ",
                "Pamela Morgan  Halpert (née Beesly; born March 25, 1979) is a fictional character on The Office, who is played by Jenna Fischer.",
                "He is introduced as a sales representative at the Scranton branch of paper distribution company Dunder Mifflin, before temporarily transferring to the Stamford branch in the third season. Upon the merger of Scranton and Stamford branches, he becomes Assistant Regional Manager, and later co-manager alongside Michael Scott.",
                "Oscar Martinez is a fictional character played by Oscar Nunez on The Office. He is an accountant at the Scranton branch of Dunder Mifflin.",
                "Angela Noelle Schrute (née Martin, formerly Lipton) is a fictional character played by Angela Kinsey. She is head of the Accounting department at Dunder Mifflin Scranton. She can often be cold and stern with others. Angela loves cats and owned several of them.",
                "Kelly Rajnigandha Kapoor (केली रजनीगन्धा कपूर‌, Kelī Rajnīgandhā Kapūr), (born February 5, 1980) is a fictional character on The Office played by one of the show's writers Mindy Kaling. She is the former Customer Service Representative at Dunder Mifflin/Sabre's Scranton Branch, but left for Ohio.",
                "Phyllis Vance (née Lapin), is played by Phyllis Smith in the television series The Office. She is a sales representative at Dunder Mifflin Scranton. Phyllis is a quiet but friendly type who likes girl talk and gossip."
            )

           val name ="Name: " + requireArguments().getString("name")
            val age = "Age: " + requireArguments().getInt("age").toString()
            val job = "Job: " + requireArguments().getString("job")
            val image = requireArguments().getString("image")
            val officeId = requireArguments().getInt("id")
            view.findViewById<TextView>(R.id.office_age).text = age
            view.findViewById<TextView>(R.id.office_job).text = job
            view.findViewById<TextView>(R.id.office_description).text = officeDescriptions[officeId]
            view.findViewById<TextView>(R.id.office_name).text = name
            Glide.with(requireContext()).load(image).override(800,800).into(view.findViewById(R.id.office_image))

        }

        return view
    }
}
