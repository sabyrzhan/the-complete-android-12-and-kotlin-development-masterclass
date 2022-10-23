package kz.sabyrzhan.kotlinbasics.classes

fun main() {
    println(add(1, 2))
}

// The value of `a` is overridden. Thus the scope of parameter `a` is lost.
fun add(a: Int, b: Int): Any {
    val a = "Something"
    return a + b
}