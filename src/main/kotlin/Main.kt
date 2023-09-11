fun main() {

    val a: Byte = 112
    val b: Short = 11245
    val c: Int =  100000
    val d: Long = 9999L
    val e: Double = 999.5
    val f: Float = 19.5F
    val letter: Char = 'a'
    val flag: Boolean = true
    val array: Array<String> = arrayOf("1","2","3")
    val shape = Shape()
    shape.show()
}

class Shape {
     var aShape : Byte = 15

    fun show() {
        val i : Int = 10
        println("This is shape")
    }
}
