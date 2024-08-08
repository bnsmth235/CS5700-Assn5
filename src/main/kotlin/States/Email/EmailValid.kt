import Detectors.EmailDetector
import States.InvalidState

class EmailValid(detector: EmailDetector) : EmailState(detector) {
    override val isAccepting: Boolean
        get() = true

    override fun getInput(string: String) {
        if (string in "@. "){
            detector.state = InvalidState(detector)
        }
    }
}