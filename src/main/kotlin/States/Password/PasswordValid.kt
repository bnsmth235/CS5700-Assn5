package org.example.States.Password

import org.example.Detectors.PasswordDetector

class PasswordValid(detector: PasswordDetector) : PasswordState(detector) {
    override val isAccepting: Boolean
        get() = true

    override fun getInput(string: String) {
        if (string in "!@#\$%&*") {
            detector.state = PasswordInvalid(detector)
        }
    }
}