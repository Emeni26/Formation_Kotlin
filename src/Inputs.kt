
/*
*
The first input kotlin file
*/
fun main (args:Array<String>) {
    //Pour validation de code
    // var name : String="Emeni Mansri"
    print ("Enter Name : ")
    var name:String= readLine()!!
    println(name)

//convertir en entier avec !!.toInt()
    print ("Enter Age : ")
    val age:Int = readLine() !!.toInt()
    println(age)
    print ("Enter Departement : ")
    val dep:String= readLine()!!
    println(dep)
    print ("Enter Avg : ")
//convertir en entier avec !!.toInt()
    val avg:Double= readLine()!!.toDouble()
    println(avg)

    print ("Enter title : ")
    var title:String?=null
    print(title)
    title= readLine()
    print(title)

}