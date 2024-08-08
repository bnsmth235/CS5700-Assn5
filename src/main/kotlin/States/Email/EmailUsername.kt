import Detectors.EmailDetector
import States.InvalidState

class EmailUsername(detector: EmailDetector) : EmailState(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun getInput(string: String) {
        if (string in "@"){
            detector.state = EmailDomain(detector)
        } else if (string in " "){
            detector.state = InvalidState(detector)
        }
    }
}