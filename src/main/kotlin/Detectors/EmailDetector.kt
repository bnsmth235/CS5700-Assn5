package Detectors

import State.Email.EmailStart
import States.State

class EmailDetector: Detector {
    override var state: State = EmailStart(this)

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
        state = EmailStart(this)
        return isAccepting
    }
}