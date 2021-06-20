package spm.kotlin.world.function

open class Function1 {

    fun printName(name: String) {
        println("FUnction with Parameters ${name}")


    }

    fun printName(): Unit {
        println("FUnction without Parameters ")
    }

    /**
     * Function with default parameters
     */
    fun printName1(name: String = "Sibaprasad"): Unit {
        println("FUnction without Parameters ${name}")
    }

    /**
     * FUnction with multiple parameters
     */
    fun sum(a: Int, b: Int, c: Int) {
        println("Sum of $a , $b and $c is ${a + b - c}")
    }

}