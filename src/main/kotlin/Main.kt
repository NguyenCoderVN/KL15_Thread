fun main(args: Array<String>) {
    println("Hello World! ${getThreadName()}")
    val myRunnable = MyRunnable()
    val myThread = Thread(myRunnable, "New_Thread")
    myThread.start()
    sleepThread(6)
    myRunnable.stopThread()
    println("The end ${getThreadName()}")
}

class MyRunnable : Runnable {
    private var check = false

    fun stopThread() {
        check = true
    }

    private fun stillRunning() = !check

    override fun run() {
        var i = 0
        while (stillRunning()) {
            println("Runnable run step $i ${getThreadName()}")
            sleepThread(2)
            i += 1
        }
    }
}

private fun getThreadName(): String {
    return "at thread name ${Thread.currentThread().name}"
}

private fun sleepThread(second: Long) {
    try {
        Thread.sleep(second * 1000L)
    } catch (e: InterruptedException) {
        e.printStackTrace()
    }
}