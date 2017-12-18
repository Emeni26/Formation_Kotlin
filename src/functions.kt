fun main(args: Array<String>) {

    var sumResult = sum(10.2, 12.54)
    println("sum1 : $sumResult")

    sumResult = sum(12.0,22.0)
    println("sum : $sumResult")

    sumResult = sum(100.0,10.0)
    println("sum : $sumResult")

    ShowName("Emeni MNSRI")
}

fun sum (n1:Double , n2:Double) :Double
{
    val sumVal =  n1+n2
    return sumVal
}


fun ShowName (name:String)
{
    println(name)
}

/*  show(10)
    show(12)
    show(145)
*/


/*fun show(number :Int)
{
println("number is $number")
}*/

