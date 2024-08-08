import org.example.Detectors.FloatDetector
import kotlin.test.*

class FloatTest {
    @Test
    fun testFloatDetectorValidInput() {
        val detector = FloatDetector()
        assertTrue(detector.detect("1.23"))  // Valid float
        assertTrue(detector.detect("0.456"))  // Valid float with leading 0
        assertTrue(detector.detect(".789"))  // Valid float starting with a period
    }

    @Test
    fun testFloatDetectorInvalidInput() {
        val detector = FloatDetector()
        assertFalse(detector.detect("123"))  // Invalid, no period
        assertFalse(detector.detect("123.123."))  // Invalid, too many periods
        assertFalse(detector.detect("0123.4"))  // Invalid, leading 0 not followed by a period
        assertFalse(detector.detect("123."))  // Invalid, period not followed by a digit
    }

}