fun main() {
    val a = 5
    val b = 5
    val result: Int = sum(a, b)
    println("Result of (a + b)*5 is $result")
}

fun sum(a: Int, b: Int): Int {
    val c = a + b
    val d = multi(c, 5)
    return c
}

fun multi(x: Int, y: Int): Int {
    return x * y
}