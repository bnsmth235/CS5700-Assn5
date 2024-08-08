package State.Email
import Detectors.EmailDetector
import EmailState
import EmailUsername
import States.InvalidState

class EmailStart(detector: EmailDetector) : EmailState(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun getInput(string: String) {
        if (string in " @"){
            detector.state = InvalidState(detector)
        }else{
            detector.state = EmailUsername(detector)
        }
    }
}