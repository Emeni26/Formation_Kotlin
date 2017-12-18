

fun main (args: Array<String>)
{
//peut être null ou peut avoir une valeur
    var name:String? //sans le point d'interrogation la valeur null ne peut pas être connu
    name="a" //name="null
    //null safety c'est le fait d'empecher le programme à s'exécuter si la valeur est null
   //Quand on veut qu'il soit pas null on met les deux points d'exclamations
    println(name !!)
    name="Emeni"
    print(name)
}