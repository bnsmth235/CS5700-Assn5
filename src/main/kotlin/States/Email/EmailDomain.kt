import Detectors.EmailDetector
import States.InvalidState

class EmailDomain(detector: EmailDetector) : EmailState(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun getInput(string: String) {
        if (string in "@ "){
            detector.state = InvalidState(detector)
        } else if (string in "."){
            detector.state = EmailExtension(detector)
        }
    }
}