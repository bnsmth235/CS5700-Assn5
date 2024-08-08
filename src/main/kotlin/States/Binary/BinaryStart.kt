package org.example.States.Binary

import BinaryOne
import States.InvalidState
import org.example.Detectors.BinaryDetector

class BinaryStart(detector: BinaryDetector) : BinaryState(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun getInput(string: String) {
        if (string in "1") {
            detector.state = BinaryOne(detector)
        } else {
            detector.state = InvalidState(detector)
        }
    }
}