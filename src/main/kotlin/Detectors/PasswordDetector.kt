package org.example.Detectors

import Detectors.Detector
import States.State
import org.example.States.Password.PasswordStart

class PasswordDetector: Detector {
    override var state: State = PasswordStart(this)


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
        state = PasswordStart(this)
        return isAccepting
    }
}