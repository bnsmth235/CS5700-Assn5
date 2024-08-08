import States.InvalidState
import org.example.Detectors.FloatDetector
import org.example.States.Float.FloatState

class FloatValid(detector: FloatDetector) : FloatState(detector) {
    override val isAccepting: Boolean
        get() = true

    override fun getInput(string: String) {
        if (string !in "0123456789") {

            detector.state = InvalidState(detector)
        }
    }
}