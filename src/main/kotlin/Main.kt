fun main() {
    val a = 2
    val b = 4
    val result: Int = sum(a, b)
    println("Result of (2 + 4) * 5 is $result")
}

fun sum(a: Int, b: Int): Int {
    val c = a + b
    return multi(c, 5)
}

fun multi(x: Int, y: Int): Int {
    return x * y
}