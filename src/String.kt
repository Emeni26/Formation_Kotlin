fun main(args: Array<String>) {
    var msg =" Welcome to NYC"
    println(msg)

   for (index in 0..msg.length -1) {
       println("msg [$index]=" + msg[index])
   }

    var name="Emeni"
    var msgWelcome=name+","+msg
    println(msgWelcome)
    println(msgWelcome.toLowerCase())
    println(msgWelcome.toUpperCase())
    println(msg.trim())  //supprimer les espaces au debut
    println(msgWelcome.split(""))//décomposer la phrase et ajouter des espaces
}