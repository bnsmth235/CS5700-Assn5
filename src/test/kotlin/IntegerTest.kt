import org.example.Detectors.IntegerDetector
import kotlin.test.*

class IntegerTest {
    @Test
    fun testIntegerDetectorValidInput() {
        val detector = IntegerDetector()
        assertTrue(detector.detect("123"))  // Valid integer
        assertTrue(detector.detect("987654321"))  // Valid large integer
    }

    @Test
    fun testIntegerDetectorInvalidInput() {
        val detector = IntegerDetector()
        assertFalse(detector.detect("0123"))  // Invalid, starts with 0
        assertFalse(detector.detect("123a"))  // Invalid, contains a non-digit
        assertFalse(detector.detect(""))  // Invalid, empty string
        assertFalse(detector.detect("0"))  // Invalid, starts with 0
    }
}