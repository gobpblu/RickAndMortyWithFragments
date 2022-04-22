package com.developer.android.rickandmortyfragments.main.api

import com.developer.android.rickandmortyfragments.main.models.character.CharacterData
import com.developer.android.rickandmortyfragments.main.models.character.ResultResponse
import com.developer.android.rickandmortyfragments.main.models.episode.EpisodeData
import com.developer.android.rickandmortyfragments.main.models.location.LocationData
import retrofit2.Call
import retrofit2.http.GET

interface RickAndMortyApi {
    @GET("character")
    fun getAllCharacters(): Call<CharacterData>

}