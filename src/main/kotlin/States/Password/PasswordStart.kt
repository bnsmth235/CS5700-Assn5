package org.example.States.Password

import org.example.Detectors.PasswordDetector

class PasswordStart(detector: PasswordDetector) : PasswordState(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun getInput(string: String) {
        if (string in "!@#\$%&*") {
            detector.state = PasswordSpecial(detector)
        } else if (string in "QWERTYUIOPLKJHGFDSAZXCVBNM") {
            detector.state = PasswordCapital(detector)
        }
    }
}