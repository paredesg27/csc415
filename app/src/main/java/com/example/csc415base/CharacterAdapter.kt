package com.example.csc415base

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CharacterAdapter(private val characters: List<Character>) : RecyclerView.Adapter<CharacterAdapter.CharacterViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.character_card_view, parent, false)
        return CharacterViewHolder(view)
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        val character = characters[position]
        holder.characterImage.setImageResource(character.image)
        holder.characterName.text = character.name
        holder.characterAge.text = character.age.toString()
        holder.characterJob.text = character.job
        holder.characterID.text = character.id.toString()
        holder.characterCompanies.text = character.companies.toString()
    }

    override fun getItemCount() = characters.size


    class CharacterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val characterImage: ImageView = itemView.findViewById(R.id.character_image)
        val characterName: TextView = itemView.findViewById(R.id.character_name)
        val characterAge: TextView = itemView.findViewById(R.id.character_age)
        val characterJob: TextView = itemView.findViewById(R.id.character_job)
        val characterCompanies: TextView = itemView.findViewById(R.id.character_companies)
        val characterID: TextView = itemView.findViewById(R.id.character_id)
//        val characterGender: TextView = itemView.findViewById(R.id.character_gender)
    }

}