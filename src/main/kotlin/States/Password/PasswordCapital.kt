package org.example.States.Password

import org.example.Detectors.PasswordDetector

class PasswordCapital(detector: PasswordDetector) : PasswordState(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun getInput(string: String) {
        if (string in "!@#\$%&*") {
            detector.state = PasswordInvalid(detector)
        }
    }
}