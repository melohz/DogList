package com.example.doglist.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.doglist.model.DogBreed

/**
 * View Model doesn't know about the fragment, or activity
 */
class ListViewModel: ViewModel() {
    val dogs = MutableLiveData<List<DogBreed>>()
    val dogsLoadError = MutableLiveData<Boolean>()
    val loading = MutableLiveData<Boolean>()

    fun refresh() {
        val dog1 = DogBreed("1", "Corgi", "15years", "breedGroup", "bred For", "temperament", "")
        val dog2 = DogBreed("2", "Labrador", "13years", "breedGroup", "bred For", "temperament", "")
        val dog3 = DogBreed("3", "Shiba", "8years", "breedGroup", "bred For", "temperament", "")
        val dogList = arrayListOf<DogBreed>(dog1, dog2, dog3)

        dogs.value = dogList
        dogsLoadError.value = false
        loading.value = false
    }
}