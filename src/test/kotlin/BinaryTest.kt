import org.example.Detectors.BinaryDetector
import kotlin.test.*

class BinaryTest {
    @Test
    fun testBinaryDetectorValidInput() {
        val detector = BinaryDetector()
        assertTrue(detector.detect("1"))  // Valid binary
        assertTrue(detector.detect("101"))  // Valid binary
        assertTrue(detector.detect("11011"))  // Valid binary
    }

    @Test
    fun testBinaryDetectorInvalidInput() {
        val detector = BinaryDetector()
        assertFalse(detector.detect("01"))  // Invalid, starts with 0
        assertFalse(detector.detect("10"))  // Invalid, ends with 0
        assertFalse(detector.detect("100a01"))  // Invalid, contains a non-binary character
    }

}