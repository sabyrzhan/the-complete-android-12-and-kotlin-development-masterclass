package kz.sabyrzhan.kotlinbasics.classes

class OuterClass {
    var name: String = "this is the outer class property"

    class NestedClass {
        var description: String = "code inside the nested class"
        private var id: Int = 101

        fun foo() {
            // println("$name") // ERROR: cannot access outer class data
            println("ID is $id")
        }
    }

    inner class InnerClass {
        var description: String = "code inside the inner class"
        private var id: Int = 101

        fun foo() {
            println("$name") // can access outer class member data
            println("ID is $id")
        }
    }
}

fun main() {
    println(OuterClass.NestedClass().description)
    OuterClass.NestedClass().foo()

    println()

    // Inner class
    println(OuterClass().InnerClass().description)
    OuterClass().InnerClass().foo()
}