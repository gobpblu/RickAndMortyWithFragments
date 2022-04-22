package com.developer.android.rickandmortyfragments.main.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.developer.android.rickandmortyfragments.main.models.character.ResultResponse
import com.developer.android.rickandmortyfragments.main.ui.databinding.CharacterBinding

class CharacterFragment: Fragment() {

   private lateinit var binding: CharacterBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = CharacterBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val data = arguments?.getSerializable("result") as ResultResponse
        with (binding) {
            context?.let { Glide.with(it).load(data.image).into(imageViewCharacter) }
            textViewName.text = "Name: ${data.name}"
            textViewGender.text = "Gender: ${data.gender}"
            textViewStatus.text = "Status: ${data.status}"
            textViewSpecies.text = "Species: ${data.species}"
        }
    }
}