package kz.sabyrzhan.kotlinbasics.classes

fun main() {
    // Arrays
    val numbers: IntArray = intArrayOf(1,2,3,4,5,6)
    println(numbers.contentToString())
    numbers[0] = numbers[0] + 1
    println(numbers.contentToString())

    val numbers2: Array<Any> = arrayOf(1, "2", "three", 4.0f)
    println(numbers2.contentToString())
    numbers2[1] = "222"


    // Lists
    val months = listOf("January", "February", "March")
    println(months)
    val mutableMonths = months.toMutableList()
    mutableMonths[0] = mutableMonths[0] + " 1"
    println(mutableMonths)


    // Sets
    val fruits = setOf("apple", "mango", "banana", "apple")
    println(fruits)
    val mutableFruits = fruits.toMutableSet()
    mutableFruits.add("grapefruit")
    mutableFruits.add("orange")
    mutableFruits.add("orange")
    println(mutableFruits)

    // Maps
    val daysOfTheWeek = mapOf(1 to "Mon", 2 to "Tue", 3 to "Wed", 4 to "Thur", 5 to "Fri", 6 to "Sat", 7 to "Sun")
    println(daysOfTheWeek)
}