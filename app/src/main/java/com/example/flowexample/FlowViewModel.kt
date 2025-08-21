package com.example.flowexample

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow

class FlowViewModel: ViewModel() {

    val cuntDownFlow = flow<Int> {

        val startingValue = 10

        var currentValue = startingValue

        emit(startingValue)

        while (currentValue > 0) {
            delay(1000L)
            currentValue--
            emit(currentValue)
        }

    }
}