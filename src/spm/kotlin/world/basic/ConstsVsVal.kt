package spm.kotlin.world.basic

/**
 *
 */

const val newName = "Spm" // this is valid because its declared at top level

class ConstsVsVal {

    val myValue = getValue() // this is valid, because it will generate the value at runtime
//    const val myName = "Sibaprasad" this will show error, it will show error saying const only declare at top evel

    companion object {
        const val myName = "Sibaprasad" // this is allowed
        @JvmStatic
        fun main(args: Array<String>) {
            println("spm.kotlin.world.basic.Hello World!")
        }
    }

    fun getValue() = 12*23

}