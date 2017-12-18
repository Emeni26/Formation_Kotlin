fun main(args: Array<String>) {
    var arrayList = ArrayList<String>()
    arrayList.add("Emeni")
    arrayList.add("Dhekra")
    arrayList.add("Ahmed")
    arrayList.add("Amal")
    arrayList.set(1,"Emeni Mansri") //la meme chose


    println("**************Without index*******************")
    for (item in arrayList ){

        println(item)
    }
    println("**************With index***********************")
    for (index in 0..arrayList.size-1){

        println(arrayList[index])
    }
    print("enter the name that you search :")
    var search= readLine()!!.toString()
    if (arrayList.contains(search))
    {
        println("name is found")
    } else {
        println("name is not found")
    }
}