package com.example.daggerhilt

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Named


/**
 * Created by Abhinay on 01/12/24.
 *
 *
 */
@HiltViewModel
class TestViewModel @Inject constructor(
    @Named("String1") testString2: String
) : ViewModel() {

    init {
        Log.d("ViewModel", "Test String from ViewModel: $testString2")
    }

}