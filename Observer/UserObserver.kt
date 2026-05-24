package observer

class UserObserver(
    private val name: String
) : Observer {

    override fun update(message: String) {
        println("[$name received notification] $message")
    }
}