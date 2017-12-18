


fun main(args: Array<String>) {

    print("enter a grade : ")
    val grade: Int= readLine()!!.toInt()
    if(grade>=90)
    {
        print("A")
    }else if (grade>=80 && grade<90){

        println("B")
    }

    else if (grade>70 && grade<80){

        println("C")
    }
    else {

        println("Fail")
    }
}