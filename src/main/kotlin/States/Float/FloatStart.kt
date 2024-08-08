package org.example.States.Float

import States.InvalidState
import org.example.Detectors.FloatDetector

class FloatStart(detector: FloatDetector) : FloatState(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun getInput(string: String) {
        if (string in ".") {
            detector.state = FloatDecimal(detector)
        } else if (string in "0") {
            detector.state = FloatZero(detector)
        } else if (string in "123456789") {

        } else {
            detector.state = InvalidState(detector)
        }
    }
}