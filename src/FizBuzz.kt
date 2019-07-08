fun fizBuzz(i: Int) = when {
    i % 15 == 0 -> "Fizz Buzz "
    i % 5 == 0 -> "Fizz "
    i % 3 == 0 -> "Buzz "
    else -> "$i "
}