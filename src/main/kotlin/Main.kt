fun main(args: Array<String>) {
    println("Hello World! ${getThreadName()}")
    val myThread = MyThread()
    myThread.start()
    sleepThread(5)
    println("The end ${getThreadName()}")
}

private fun getThreadName() : String {
    return "at thread name ${Thread.currentThread().name}"
}

class MyThread : Thread("New_Thread") {
    override fun run() {
        sleepThread(2)
        println("Running ${getThreadName()}")
    }
}

private fun sleepThread(second : Long) {
    try {
        Thread.sleep(second * 1000L)
    } catch (e: InterruptedException) {
        e.printStackTrace()
    }
}