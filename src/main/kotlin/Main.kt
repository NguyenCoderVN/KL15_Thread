fun main(args: Array<String>) {
    println("Hello World! ${getThreadName()}")
    val myRunnable = MyRunnable()
    val myThread = Thread(myRunnable, "New_Thread")
    myThread.start()
    println("The end ${getThreadName()}")
}

class MyRunnable : Runnable {
    override fun run() {
        println("Runnable run ${getThreadName()}")
    }
}

private fun getThreadName() : String {
    return "at thread name ${Thread.currentThread().name}"
}

private fun sleepThread(second : Long) {
    try {
        Thread.sleep(second * 1000L)
    } catch (e: InterruptedException) {
        e.printStackTrace()
    }
}