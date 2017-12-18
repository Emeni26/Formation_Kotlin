

fun main(args: Array<String>) {


    print ("Enter a grade :")
    var grade: Int = readLine()!!.toInt()
    if (grade>=50)
    {
        grade=grade+5
        println("you pass exam")
        println("You get 5 grades more then your grade  : $grade")

    }


    else {
        //block code
        if (grade>45){
            grade=grade+5
            println("You get 5 grades more then your grade  : $grade")


        }else {

            println(" you get $grade ,Infortunately you fail")

        }

    }

    /*if (grade<50)
    {

        println(" you get $grade ,Infortunately you fail")
    }

     print ("Enter a number :")
     var number: Int = readLine()!!.toInt()

    if (number >= 1 && number <= 100) {
         //block code
         println("Number Between 1 -100")
     }
     */

    println("end app")
}