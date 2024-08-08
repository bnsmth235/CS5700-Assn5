package org.example.States.Integer

import States.InvalidState
import org.example.Detectors.IntegerDetector

class IntegerValid(detector: IntegerDetector) : IntegerState(detector) {
    override val isAccepting: Boolean
        get() = true

    override fun getInput(string: String) {
        if (string !in "0123456789") {
            detector.state = InvalidState(detector)
        }
    }
}