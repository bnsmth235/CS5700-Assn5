package States

import Detectors.Detector

class InvalidState(detector: Detector) : State {

    override val isAccepting: Boolean
        get() = false

    override fun getInput(string: String) {
        // N/A
    }
}