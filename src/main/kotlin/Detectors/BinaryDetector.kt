package org.example.Detectors

import org.example.States.Binary.BinaryStart
import Detectors.Detector
import States.State

class BinaryDetector: Detector {
    override var state: State = BinaryStart(this)

    override fun detect(input: String): Boolean{
        val characters = input
            .trim()
            .split("")
            .drop(1)
            .dropLast(1)
            .toMutableList()

        for (character in characters){
            state.getInput(character)
        }
        val isAccepting = state.isAccepting
        state = BinaryStart(this)
        return isAccepting
    }
}