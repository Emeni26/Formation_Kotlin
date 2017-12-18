fun main(args: Array<String>) {


    var arrayInt=Array<String> (5) {""}

    for (index in 0..4){
       println("enter the element n : $index  :")
        arrayInt[index]= readLine()!!.toString()
       // println(arrayInt[index]) le resultat au debut est 0 pour les 5 lignes
    }
println("list of elements")
    for (item in arrayInt){ println(item)}

}