package kz.sabyrzhan.kotlinbasics

fun main() {
    nullableDemo()
}

fun nullableDemo() {
    var name: String = "Name"
    var nullableName: String? = "Nullablename"


    var len = name.length
    var nullableLen = nullableName?.length

    println("Len: $len, Nullablelen: ${nullableLen?.toShort()}")

    nullableName?.let {
        println("Safe nullable name=$it and length is ${it.length}")
    }

    // Elvis operatpr
    var notNullValue = nullableName ?: "Guest"
    println("Not nullable one: $notNullValue and its len ${notNullValue.length}")

    var anotherNullVar: String? = null
    println("This is not null assertion operator ${anotherNullVar!!.length}")
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