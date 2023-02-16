package com.example.csc415base

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.fragment.app.commit
import androidx.recyclerview.widget.RecyclerView
import com.example.csc415base.ui.OfficeDetailFragment
import com.bumptech.glide.Glide

class CharacterAdapter(private val characters: List<Character>) : RecyclerView.Adapter<CharacterAdapter.CharacterViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.character_card_view, parent, false)
        return CharacterViewHolder(view){position ->
            val character = characters[position]

            val bundle = bundleOf(
                "name" to character.name,
                "age" to character.age,
                "image" to character.image,
                "id" to character.id,
                "job" to character.job,
                "companies" to character.companies
            )

            val detailFragment = OfficeDetailFragment()
            detailFragment.arguments = bundle

            val activity = view.context as AppCompatActivity

            activity.supportFragmentManager.commit {
                setReorderingAllowed(true)
                replace(R.id.fragment_container_view, detailFragment)
                addToBackStack(null)
            }

        }
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        val character = characters[position]
//        holder.characterImage.setImageResource(character.image)
        Glide.with(holder.itemView.context).load(character.image).into(holder.characterImage)
        holder.characterName.text = character.name
        holder.characterAge.text = character.age.toString()
        holder.characterJob.text = character.job
        holder.characterID.text = character.id.toString()
        holder.characterCompanies.text = character.companies.toString()
    }

    override fun getItemCount() = characters.size


    inner class CharacterViewHolder(
        itemView: View,
        private val onItemClick:(adapterPosition: Int) -> Unit
    ) : RecyclerView.ViewHolder(itemView){
        val characterImage: ImageView = itemView.findViewById(R.id.character_image)
        val characterName: TextView = itemView.findViewById(R.id.character_name)
        val characterAge: TextView = itemView.findViewById(R.id.character_age)
        val characterJob: TextView = itemView.findViewById(R.id.character_job)
        val characterCompanies: TextView = itemView.findViewById(R.id.character_companies)
        val characterID: TextView = itemView.findViewById(R.id.character_id)

        init {
            itemView.setOnClickListener {
                onItemClick(adapterPosition)
            }
        }

    }

}
