package org.example.States.Integer

import States.InvalidState
import org.example.Detectors.IntegerDetector

class IntegerStart(detector: IntegerDetector) : IntegerState(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun getInput(string: String) {
        if (string in "123456789") {
            detector.state = IntegerValid(detector)
        } else {
            detector.state = InvalidState(detector)
        }
    }
}