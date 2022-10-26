package kz.sabyrzhan.kotlinbasics.classes

data class User(val id: Int, val name: String)

fun main() {
    val (id, name) = User(1, "Username")
    val (id2, name2) = User(2, "Username2")
    println("Id=$id, name=$name")
    println("Id=$id2, name=$name2")
}