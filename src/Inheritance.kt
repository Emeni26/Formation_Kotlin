open class Operations
//le mot open pour pouvoir l'hériter, par ce que par defaut la classse est de type final on peut pas l'hériter
//c'est pour ça on ecrit le mot open devant la classe
{
    //protected c-a-d je peux l'utiliser et celui qui hérite de moi peut l'utiiliser
    //private seul moi qui peut l'utiliser : meme celui qui hérite de moin ne peut pas l'utiliser


   protected var process="com.mansri.news.main process"
    fun sum (n1:Double , n2:Double): Double {

        return n1+n2
    }

    open fun sub (n1:Double , n2:Double): Double {

        return n1-n2
    }

    fun mainprocess()
    {
        println(process)

    }

}

class MulOperations():Operations() {

    /*fun sum (n1:Double , n2:Double): Double {

        return n1+n2
    }

    fun sub (n1:Double , n2:Double): Double {

        return n1-n2
    }*/

//je veux heriter la methode sub de la classe operations mais je veux une differente implémentation
    //donc je met le mot override et je met o

    //casting il injecte le contenu d'une méthode dans l 'autre methode
    override fun sub (n1:Double, n2:Double): Double
{   super.sub(n1, n2)

    return n1 - n2+156
}
    fun div (n1:Double , n2:Double): Double
{

        return n1/n2
}

    fun mul (n1:Double , n2:Double): Double
{

        return n1*n2
}

    fun parentProcess()
    {
        print(process)
    }
}

fun main(args: Array<String>) {
    println("----------------Class Operations---------------")
    var op=Operations()

    println("The result of the sum is : "+op.sum(10.3,17.6))
    println("The result of the substruction is : "+op.sub(10.0,12.0))

    println("----------------Class MulOperations---------------")

    var mulop=MulOperations() as Operations
    println("The result of the sum is : "+mulop.sum(10.3,17.6))
    println("The result of the substruction is : " +mulop.sub(10.0,12.0))
   // println("The result of the division is : "+ mulop.div(10.3,17.6))
  //  println("The result of the multiplication is  is : "+mulop.mul(10.0,12.0))

}