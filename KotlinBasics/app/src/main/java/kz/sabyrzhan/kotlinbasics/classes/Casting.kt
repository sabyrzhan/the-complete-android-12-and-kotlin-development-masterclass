package kz.sabyrzhan.kotlinbasics.classes

fun main() {
    // Unsafe casting
    var obj: Any? = null
    val str: String? = obj as String?
    println(str)

    // Safe casting
    obj = getNull()
    val str2: String? = obj as? String
    println(str2)
}

fun getNull(): Any? {
    return null
}