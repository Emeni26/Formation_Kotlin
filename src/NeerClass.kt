
class Outer{

    val name :String="Mansri"

    //pour lle class inner peut utiliser les données de la classe Outer il faut ajouter le mot  inner
   inner class inner{

        fun getMsg():String{

            return "Welcome to kotl in"
        }

        fun getname():String{

            return name
        }
    }

}

fun main(args: Array<String>) {


}