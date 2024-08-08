import States.InvalidState
import org.example.Detectors.BinaryDetector
import org.example.States.Binary.BinaryState

class BinaryZero(detector: BinaryDetector) : BinaryState(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun getInput(string: String) {
        if (string in "0") {
            // N/A
        } else if (string in "1") {
            detector.state = BinaryOne(detector)
        } else {
            detector.state = InvalidState(detector)
        }
    }
}