class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
    get() = height == width
}

val rectangle = Rectangle(1, 1)
fun main(args: Array<String>) {
    println("${rectangle.isSquare}")
}