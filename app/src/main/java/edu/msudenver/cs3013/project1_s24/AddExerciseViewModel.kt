package edu.msudenver.cs3013.project1_s24

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AddExerciseViewModel : ViewModel() {

    val exercises: MutableLiveData<MutableList<Exercise>> = MutableLiveData(mutableListOf())

    fun addExercise(exercise: Exercise) {
        val currentList = exercises.value ?: mutableListOf()
        currentList.add(exercise)
        exercises.value = currentList
    }
}

