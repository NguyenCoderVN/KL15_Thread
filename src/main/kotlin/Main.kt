fun main(args: Array<String>) {
    println("Hello World! ${getThreadName()}")
    for (i in 1..9) {
        object : Thread(""+i) {
            override fun run() {
                println("Running at thread $name")
            }
        }.start()
    }
    println("The end ${getThreadName()}")
}

private fun getThreadName() : String {
    return "at thread name ${Thread.currentThread().name}"
}