package kz.sabyrzhan.kotlinbasics

fun main() {
    val num = parseNumber("10")
    println(num)

    val num2 = parseNumber("unparsable")
    println(num2)
}

fun parseNumber(str: String): Int {
    return try {
        Integer.parseInt(str)
    } catch (e: Exception) {
        0
    }
}