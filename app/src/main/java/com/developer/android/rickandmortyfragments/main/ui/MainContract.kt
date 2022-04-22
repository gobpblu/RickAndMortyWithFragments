package com.developer.android.rickandmortyfragments.main.ui

import com.developer.android.rickandmortyfragments.main.models.character.CharacterData


interface MainContract {
    fun showCharacters(data: CharacterData)
    fun dataFailure(t: Throwable)
}