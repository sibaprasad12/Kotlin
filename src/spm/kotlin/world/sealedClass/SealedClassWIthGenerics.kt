package spm.kotlin.world.sealedClass


/**
 * Created by Sibaprasad Mohanty on 07/02/2022.
 * Spm Limited
 * sp.dobest@gmail.com
 */

fun main() {
    println("Message for string as result = ${messageForStringResult()}")
    println("Message for Float as result${messageForFloatResult()}")
}

sealed class Result<out T>
object GenericError1 : Result<Nothing>()
object GenericError2 : Result<Nothing>()
class Success<T>(val result: T) : Result<T>()
object StringError : Result<String>()

fun returnStringResult(): Result<String> {
    return Success("success")
}

fun returnFloatResult(): Result<Float> {
    return Success(234324.23432f)
}

// The following functions include a return statements before when so that the when has to be exhaustive
fun messageForStringResult(): String {
    return when (val result = returnStringResult()) {
        is GenericError1 -> {
            println("Generic error 1 occurred")
            "Generic error 1"
        }
        is GenericError2 -> {
            println("Generic error 2 occurred")
            "Generic error 2"
        }
        is Success -> {
            result.result
        }
        is StringError -> {
            println("String-specific error occurred")
            "String specific"
        }
    }
}

fun messageForFloatResult(): String {
    return when (val result = returnFloatResult()) {
        is GenericError1 -> {
            println("Generic error 1 occurred")
            "Generic error 1"
        }
        is GenericError2 -> {
            println("Generic error 2 occurred")
            "Generic error 2"
        }
        is Success -> {
            "Result: ${result.result}"
        }
        else -> {
            "Impossible"
        }
    }
}