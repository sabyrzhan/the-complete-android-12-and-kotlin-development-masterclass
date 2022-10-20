package kz.sabyrzhan.kotlinbasics

fun main() {
    println(add(1, 2))
}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun forEachRangeWithMethodWay() {
    1.rangeTo(10).step(2).forEach {
        println("For each method: $it")
    }
}

fun forEachWithInAndStep() {
    for (num in 1..10 step 2) {
        println("WIth step: $num")
    }
}

fun forEachWithDownTo() {
    for (num in 10 downTo 1) {
        println("Downto: $num")
    }
}

fun forEachWithUntilDemo() {
    for (num in 1 until 10) {
        println(num)
    }
}

fun forEachWithInDemo() {
    for (num in 1..3) {
        println(num)
    }
}

fun whenDemo() {
    val age = 220
    when (age) {
        in 1..10 -> println("Age is 1 to 10")
        in 20..200 -> println("Age is 20 to 200")
        220, 230 -> println("Something else")
        else -> println("Something diff")
    }
}