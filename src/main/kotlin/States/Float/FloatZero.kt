package org.example.States.Float

import FloatValid
import States.InvalidState
import org.example.Detectors.FloatDetector

class FloatZero(detector: FloatDetector) : FloatState(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun getInput(string: String) {
        if (string in ".") {
            detector.state = FloatValid(detector)
        } else {
            detector.state = InvalidState(detector)
        }
    }
}
