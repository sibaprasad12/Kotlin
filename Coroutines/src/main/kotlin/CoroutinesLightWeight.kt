import kotlinx.coroutines.launchimport kotlinx.coroutines.runBlockingfun main() {    runBlocking {        repeat(10_00000){            launch {                print(".")            }        }    }}