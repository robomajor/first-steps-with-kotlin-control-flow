fun main() {

    val whenClass = When()

    whenClass.cases("Hello")
    whenClass.cases(1)
    whenClass.cases(0L)
    whenClass.cases(MyClass())
    whenClass.cases("hello")

    println()

    println(whenClass.whenAssign("Hello"))
    println(whenClass.whenAssign(3.4))
    println(whenClass.whenAssign(1))
    println(whenClass.whenAssign(MyClass()))
}

class MyClass