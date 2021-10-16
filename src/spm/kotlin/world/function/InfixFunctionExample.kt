package spm.kotlin.world.function

/**
 *But an Infix function must satisfy the following requirements
They must be member functions or extension functions.
They must have a single parameter.
The parameter must not accept a variable number of arguments and must have no default value.
 */
fun main(args: Array<String>) {
    val x = 10
    val y = 20
    val greaterValue = x.greaterValue(y)
    print("Greater number between $x and $y is $greaterValue")
}


infix fun Int.greaterValue(other: Int): Int {
    return if (this > other)
        this
    else
        other
}