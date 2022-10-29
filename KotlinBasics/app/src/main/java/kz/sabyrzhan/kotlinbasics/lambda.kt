package kz.sabyrzhan.kotlinbasics

fun main() {
    val sum: (Int, Int) -> Int = { a: Int, b: Int -> a + b}
    println(sum(1,2))

    // Short version
    val sum2 = {a: Int, b: Int -> a + b}
    println(sum2(1,2))
}