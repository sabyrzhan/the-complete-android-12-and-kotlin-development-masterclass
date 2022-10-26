package kz.sabyrzhan.kotlinbasics.classes

fun main() {
    val sample = GetterExample()
    sample.make = "Make"
    println(sample.make)
    println(sample.model)
}

class GetterExample {
    lateinit var make: String
    var model: String? = null

    get() {
        return field?.lowercase()
    }

    set(value) {
        field = "updated: $value"
    }
}