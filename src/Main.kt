import geometry.shapes.createRandomRectangle
import javax.swing.plaf.basic.BasicLabelUI

fun getMnemonic(color: Color) =
    when (color) {
        Color.RED -> "Richard"
        Color.ORANGE -> "Of"
        Color.YELLOW -> "York"
    }

fun getWarmth(color: Color) = when(color) {
    Color.RED, Color.ORANGE -> "warm"
    Color.YELLOW -> "little warm"
}

fun mix(c1: Color, c2: Color) =
        when (setOf(c1, c2)) {
            setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
            setOf(Color.YELLOW, Color.ORANGE) -> Color.RED
            else -> throw Exception("Dirty Color")
        }

fun main(args: Array<String>) {
//    println(createRandomRectangle().isSquare)

    println(Color.RED.rgb())
    println(getMnemonic(Color.RED))
    println(getWarmth(Color.ORANGE))
    println(mix(Color.ORANGE, Color.YELLOW))
}
