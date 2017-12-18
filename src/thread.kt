import sun.awt.datatransfer.ToolkitThreadBlockedHandler

class MyThread : Thread {


    var processName:String?=null
    constructor(processName:String):super(){
        this.processName=processName
    }

    override fun run() {

        var count=0
        while (count<10){
            println ("${this.processName} ,count:$count")
            try {
                Thread.sleep(1000)
            } catch (ex:Exception){print(ex.message) }
            count++
        }
    }
}

fun main(args: Array<String>) {
    var t1=MyThread ("T1")
    t1.start()

    var t2=MyThread ("T2")
    t2.start()

    var t3=MyThread ("T3")
    t3.start()

    println("Threads is running")
}