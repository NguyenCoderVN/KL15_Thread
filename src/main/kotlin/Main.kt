fun main() {
    val a = 5
    val b = 5
    val result: Int = sum(a, b)
    println("Result of (5 + 5) * 5 is $result")
}

fun sum(a: Int, b: Int): Int {
    val c = a + b
    return multi(c, 5)
}

fun multi(x: Int, y: Int): Int {
    return x * y
}