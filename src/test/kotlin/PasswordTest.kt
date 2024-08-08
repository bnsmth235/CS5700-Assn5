import kotlin.test.*
import org.example.Detectors.PasswordDetector

class PasswordTest {
    @Test
    fun testPasswordDetectorValidInput() {
        val detector = PasswordDetector()
        assertTrue(detector.detect("aaaaH!aa"))  // Valid password
        assertTrue(detector.detect("1234567*9J"))  // Valid password with numbers and special character
        assertTrue(detector.detect("asdpoihj;loikjasdf;ijp;lij2309jasd;lfkm20ij@aH"))  // Valid long password
    }

    @Test
    fun testPasswordDetectorInvalidInput() {
        val detector = PasswordDetector()
        assertFalse(detector.detect("a"))  // Invalid, too short and missing criteria
        assertFalse(detector.detect("aaaaaaa!"))  // Invalid, no capital letter and ends with special char
        assertFalse(detector.detect("aaaHaaaaa"))  // Invalid, no special character
        assertFalse(detector.detect("Abbbbbbb!"))  // Invalid, ends with special char
    }

}