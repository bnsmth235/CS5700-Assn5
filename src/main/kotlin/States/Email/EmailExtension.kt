import Detectors.EmailDetector
import States.InvalidState

class EmailExtension(detector: EmailDetector) : EmailState(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun getInput(string: String) {
        if (string in "@. "){
            detector.state = InvalidState(detector)
        } else {
            detector.state = EmailValidState(detector)
        }
    }
}