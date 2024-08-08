package org.example.States.Float

import FloatValid
import States.InvalidState
import org.example.Detectors.FloatDetector

class FloatDecimal(detector: FloatDetector) : FloatState(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun getInput(string: String) {

        if (string in "0123456789") {
            detector.state = FloatValid(detector)
        } else {
            detector.state = InvalidState(detector)
        }
    }
}