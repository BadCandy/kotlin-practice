class Person(
    val name: String,
    val isMarried: Boolean
)

val person = Person("bob", true)

fun main(args: Array<String>) {
    println("${person.name} ${person.isMarried}")
}