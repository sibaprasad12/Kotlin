import kotlinx.coroutines.GlobalScopeimport kotlinx.coroutines.delayimport kotlinx.coroutines.launchfun main() {    GlobalScope.launch {//        delay(1000)        println("World")    }    println("Hello")    Thread.sleep(5000) // This will not effect to execute the coroutines code    // This will only pause the main thread for 5 seconds}