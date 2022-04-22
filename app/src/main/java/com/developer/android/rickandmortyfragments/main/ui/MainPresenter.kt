package com.developer.android.rickandmortyfragments.main.ui

import com.developer.android.rickandmortyfragments.main.api.RickAndMortyApi
import com.developer.android.rickandmortyfragments.main.models.character.CharacterData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import timber.log.Timber

class MainPresenter(private val api: RickAndMortyApi) {

    private var mainContract: MainContract? = null

    fun attach(mainContract: MainContract) {
        this.mainContract = mainContract
    }

    fun detach() {
        mainContract = null
    }

    fun getCharacterDataFromApi() {
        api.getAllCharacters()
            .enqueue(object : Callback<CharacterData> {
                override fun onResponse(
                    call: Call<CharacterData>,
                    response: Response<CharacterData>
                ) {
                    if (response.isSuccessful && response.body() != null) {
                        val characters = response.body()
                        Timber.i(characters.toString())
                        mainContract?.showCharacters(characters!!)

                    }
                }

                override fun onFailure(call: Call<CharacterData>, t: Throwable) {
                    mainContract?.dataFailure(t)
                }
            })
    }

    /*fun getLocationDataFromApi() {
        api.getAllLocations().enqueue(object : Callback<LocationData> {
            override fun onResponse(call: Call<LocationData>, response: Response<LocationData>) {
                if (response.isSuccessful && response.body() != null) {
                    val locations = response.body()
                    mainContract?.showLocations(locations!!)
                }
            }

            override fun onFailure(call: Call<LocationData>, t: Throwable) {
                mainContract?.dataFailure(t)
            }

        })
    }*/

    /*fun getEpisodeDataFromApi() {
        api.getAllEpisodes().enqueue(object : Callback<EpisodeData> {
            override fun onResponse(call: Call<EpisodeData>, response: Response<EpisodeData>) {
                if (response.isSuccessful && response.body() != null) {
                    val episodes = response.body()

                    mainContract?.showEpisodes(episodes!!)
                }
            }

            override fun onFailure(call: Call<EpisodeData>, t: Throwable) {
            }

        })
    }*/

}