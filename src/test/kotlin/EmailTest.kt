import Detectors.EmailDetector
import kotlin.test.*

class EmailTest {
    @Test
    fun testEmailDetectorValidInput() {
        val detector = EmailDetector()
        assertTrue(detector.detect("a@b.c"))  // Valid email
        assertTrue(detector.detect("joseph.ditton@usu.edu"))  // Valid email
        assertTrue(detector.detect("{}*$.&$*(@*$%&.*&*"))  // Valid email with special characters
    }

    @Test
    fun testEmailDetectorInvalidInput() {
        val detector = EmailDetector()
        assertFalse(detector.detect("@b.c"))  // Invalid, part1 is empty
        assertFalse(detector.detect("a@b@c.com"))  // Invalid, too many @ symbols
        assertFalse(detector.detect("a.b@b.b.c"))  // Invalid, too many periods after @
        assertFalse(detector.detect("joseph ditton@usu.edu"))  // Invalid, contains space character
    }

}