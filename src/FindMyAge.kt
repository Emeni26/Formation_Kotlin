import java.util.*


fun main(args: Array<String>) {

    //inputs
    println("Plese type the year of your birth :")
    var yearOfBirth :Int= readLine()!!.toInt()
    println("Plese type the mounth of your birth :")
    var monthOfBirth :Int= readLine()!!.toInt()
    println("Plese type the day of your birth :")
    var dayOfBirth :Int= readLine()!!.toInt()

    //process
    //Time of computer (year/month/hour/minutes ..
    var year= Calendar.getInstance().get(Calendar.YEAR)
    var month= Calendar.getInstance().get(Calendar.MONTH)
    var day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH)
    var y = year-yearOfBirth
    var m = month-monthOfBirth
    var d = day-monthOfBirth
    //output

    println("Your age is $y years and $m  months and $d days")
}