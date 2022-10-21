package kz.sabyrzhan.kotlinbasics

fun main(args: Array<String>) {
    val person = Person("Name", "Surname")
    println(person)

    val defaultPerson = Person()
    println(defaultPerson)

    val personWithSurname = Person(surname = "Othersurname")
    println(personWithSurname)


    val personWithName = Person(name = "Myname")
    println(personWithName)
}

// Constructor
class Person constructor(name: String = "DEFAULT_NAME", surname: String = "DEFAULT_SURNAME") {
    // Initializer
    init {
        println("Name: $name, Surname: $surname")
    }
}