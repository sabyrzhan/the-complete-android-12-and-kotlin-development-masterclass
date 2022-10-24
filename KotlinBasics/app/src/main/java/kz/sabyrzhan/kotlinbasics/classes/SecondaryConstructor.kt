package kz.sabyrzhan.kotlinbasics.classes

fun main() {
    val car = Car("Toyota", "Camry")
    val nonameCar = Car()
    car.printDetails()
    nonameCar.printDetails()

    val animal = Animal("Wolf")
    animal.printDetails()
}

class Car(var make: String, var model: String) {
    constructor(): this("NONAME_MAKE", "NONAME_MODEL") {
    }

    fun printDetails() {
        println("Make is ${this.make} and model is ${this.model}")
    }
}

class Animal(name: String) {
    var name: String? = null
    init {
        println("Initializing animal with name=$name")
        this.name = name
    }

    fun printDetails() {
        println("Animal is $name")
    }
}