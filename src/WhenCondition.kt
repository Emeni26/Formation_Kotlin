



fun main(args: Array<String>) {

print("enter a number : ")
    val number:Int=readLine()!!.toInt()

    when (number){

        1-> {
            println("you enter 1")
        }
        2-> {
            println("you enter 2")
        }
        3,4-> {
            println("you enter 3 or 4")
        }
        in 10..30->{println("number between 10 to 30")}
        !in 10..30->{println("number  not between 10 to 30")}



        else-> { println("out of range")}
    }

}