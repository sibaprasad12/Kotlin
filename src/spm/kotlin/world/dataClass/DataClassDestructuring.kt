package spm.kotlin.world.dataClass


/**
 * Created by Sibaprasad Mohanty on 07/02/2022.
 * Spm Limited
 * sp.dobest@gmail.com
 */

data class User2(val name: String, val age: Int, val gender: String)

fun main(args: Array<String>) {
    val u1 = User2("Siba", 32, "Male")

    println(u1.component1())     // John
    println(u1.component2())     // 29
    println(u1.component3())     // "Male"
}