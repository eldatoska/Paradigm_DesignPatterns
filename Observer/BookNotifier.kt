package observer

class BookNotifier : Subject {

    private val observers = mutableListOf<Observer>()

    override fun addObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    private fun notifyObservers(message: String) {
        for (observer in observers) {
            observer.update(message)
        }
    }

    fun bookBorrowed(title: String) {
        notifyObservers("Book borrowed: $title")
    }

    fun bookReturned(title: String) {
        notifyObservers("Book returned: $title")
    }

    fun bookReserved(title: String) {
        notifyObservers("Book reserved: $title")
    }

    fun bookLost(title: String) {
        notifyObservers("Book lost: $title")
    }
}