import States.InvalidState
import org.example.Detectors.BinaryDetector
import org.example.States.Binary.BinaryState

class BinaryOne(detector: BinaryDetector) : BinaryState(detector) {
    override val isAccepting: Boolean
        get() = true

    override fun getInput(string: String) {
        if (string in "0") {
            detector.state = BinaryZero(detector)
        } else if (string in "1") {
            // N/A
        } else{
            detector.state = InvalidState(detector)
        }
    }
}