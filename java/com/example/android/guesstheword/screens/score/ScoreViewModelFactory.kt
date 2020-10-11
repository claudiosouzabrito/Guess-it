package com.example.android.guesstheword.screens.score



import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class ScoreViewModelFactory (private val finalscore: Int): ViewModelProvider.Factory{
    override fun <T: ViewModel> create(modelClass: Class<T>): T{
        if(modelClass.isAssignableFrom(ScoreViewModel::class.java)){
            return ScoreViewModel(finalscore) as T
        }
        throw IllegalArgumentException("unknown ViewModel class")
    }
}