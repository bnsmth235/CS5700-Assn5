package States

interface State {
    val isAccepting: Boolean
    fun getInput(string: String): Unit
}