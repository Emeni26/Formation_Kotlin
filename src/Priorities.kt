
/*
Operation rules ||Priorities rules

1- ()
2- ^ power
3- * , /
4- +, - (quand c la meme priorité ça commence du gauche a droite
5- =
*/

fun main(args: Array<String>) {

    val n1=10
    val n2=20
    val n3=5
    var sum:Int?=null

    sum= (n1+n2)*n3-3
    println("sum 1=$sum")
    sum= (n1+n2)/n3
    println("sum 2=$sum")
}