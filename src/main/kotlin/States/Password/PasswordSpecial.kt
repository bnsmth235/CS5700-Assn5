package org.example.States.Password

import org.example.Detectors.PasswordDetector

class PasswordSpecial(detector: PasswordDetector) : PasswordState(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun getInput(string: String) {
        if (string in "QWERTYUIOPLKJHGFDSAZXCVBNM") {
            detector.state = PasswordValid(detector)
        }
    }
}
