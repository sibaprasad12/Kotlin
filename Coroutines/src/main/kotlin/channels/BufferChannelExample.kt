package channelsimport kotlinx.coroutines.channels.Channelimport kotlinx.coroutines.delayimport kotlinx.coroutines.launchimport kotlinx.coroutines.runBlockingfun main() {    runBlocking {        val chanel  = Channel<Int>(4)        val sender = launch {            repeat(10){                chanel.send(it)                println("sent $it")            }        }        repeat(3){            delay(1000)            println("Received ${chanel.receive()}")            println("Received ${chanel.receive()}")        }        sender.cancel()    }}