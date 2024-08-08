import Detectors.EmailDetector
import States.State

abstract class EmailState(val detector: EmailDetector): State {
    // N/a
}