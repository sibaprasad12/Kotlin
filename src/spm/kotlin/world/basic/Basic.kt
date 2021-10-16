package spm.kotlin.world.basic

class Basic {
    val a: Int = 123
    val b = 12
    val c: Int = 1234

    lateinit var latExample: LatExample
}

fun main() {
    // use of lateinit var initialization check
    lateinit var latExample: LatExample
//    if (this::latExample.isInitialized) {
//
//    }

}

data class LatExample(val name: String)
