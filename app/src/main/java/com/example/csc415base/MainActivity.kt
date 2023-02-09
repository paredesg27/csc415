package com.example.csc415base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.character_recycler_view)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val characters = mutableListOf<Character>()
        val companiesList = listOf("Dunder-Mifflin", "Sabre", "Michael Scott Paper Company")
        val listNames = listOf("Micheal Scott","Dwight Schrute","Kevin Malone","Ryan Howard","Stanley Hudson","Creed Bratton",
            "Darryl Philbin","Pam Beasley-Halpert","Jim Halpert","Oscar Martinez","Angela Schrute","Kelly Kapoor","Phyliss Vance")
        val listJobs = listOf("Ex-Regional manager", "Regional manager","Ex-Accountant" ,"Temporary Worker", "Retired","Dead???","Ex-Warehouse Foreman",
            "Ex-Officer Manager", "Ex-Assistant to the Regional manager","Ex-accountant","Head Accountant","Ex-Human Resources", "Salesman")

        for (i in 0..12) {
            val imageName = "image$i"
            val imageFile = resources.getIdentifier(imageName, "drawable", this.packageName)
            characters.add(createCharacter(listNames[i], Random.nextInt(30,60), imageFile, listJobs[i], i, companiesList))
        }


//        characters.add(createCharacter("Micheal Scott", 55, R.drawable.image0, "Ex-Regional manager", 0, companiesList))
//        characters.add(createCharacter("Dwight Schrute", 40, R.drawable.image1, "Regional manager", 1, companiesList))
//        characters.add(createCharacter("Kevin Malone", 46, R.drawable.image2, "Ex-Accountant", 2, companiesList))
//        characters.add(createCharacter("Ryan Howard", 30, R.drawable.image3, "Temporary Worker", 3, companiesList))
//        characters.add(createCharacter("Stanley Hudson", 65, R.drawable.image4, "Retired", 4, companiesList))
//        characters.add(createCharacter("Creed Bratton", 80, R.drawable.image5, "Dead???", 5, companiesList))
//        characters.add(createCharacter("Darryl Philbin", 44, R.drawable.image6, "Ex-Warehouse Foreman", 6, companiesList))
//        characters.add(createCharacter("Pam Beasley-Halpert", 42, R.drawable.image7, "Ex-Officer Manager", 7, companiesList))
//        characters.add(createCharacter("Jim Halpert", 41, R.drawable.image8, "Ex-Assistant to the Regional manager", 8, companiesList))
//        characters.add(createCharacter("Oscar Martinez", 47, R.drawable.image9, "Ex-accountant", 9, companiesList))
//        characters.add(createCharacter("Angela Schrute", 41, R.drawable.image10, "Head Accountant", 10, companiesList))
//        characters.add(createCharacter("Kelly Kapoor", 29, R.drawable.image11, "Ex-Human Resources", 11, companiesList))
//        characters.add(createCharacter("Phyliss Vance", 54, R.drawable.image12, "Salesman", 12, companiesList))


        val adapter = CharacterAdapter(characters)
        recyclerView.adapter = adapter
    }

    private fun createCharacter(name: String, age: Int, image: Int, job: String, id: Int,companies: List<String>) = Character(
        name = name,
        age = age,
        image = image,
        job = job,
        id = id,
        companies = companies
    )
}