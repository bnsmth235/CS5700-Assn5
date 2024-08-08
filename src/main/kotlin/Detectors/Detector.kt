package Detectors

import States.State

interface Detector {
    var state: State
    fun detect(input: String): Boolean
}