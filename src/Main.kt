import geometry.shapes.createRandomRectangle
import java.util.*
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

fun printBinaryReps() {
    val binaryReps = TreeMap<Char, String>()
    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }

    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }
}

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigit(c: Char) = c !in '0'..'9'

fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "It's a digit!"
    in 'a'..'z', in 'A'..'Z' -> "It's letter"
    else -> "I don't know"
}

fun main(args: Array<String>) {
//    println(createRandomRectangle().isSquare)

//    println(Color.RED.rgb())
//    println(getMnemonic(Color.RED))
//    println(getWarmth(Color.ORANGE))
//    println(mix(Color.ORANGE, Color.YELLOW))
//    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
//    println(evalWithLogging(Sum(Sum(Num(1), Num(2)), Num(4))))

//    for (i in 1..100) {
//        print(fizBuzz(i))
//    }

//    for (i in 100 downTo 1 step 2) {
//        print(fizBuzz(i))
//    }

//    printBinaryReps()

    println(isLetter('q'))
    println(isNotDigit('x'))
    println(recognize('8'))
}

