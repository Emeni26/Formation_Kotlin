class  Car(Type:String, Model:Int, Price:Double,MilesDrive:Int, Owner:String){
    var Owner:String?=null
    var Price:Double?=null
    var MilesDrive:Int?=null
    var  Model:Int?=null
    var Type:String?=null
    init {
        println("Type:$Type")
        this.Type=Type
        println("Model:$Model")
        this.Model=Model
        println("Price:$Price")
        this.Price=Price
        println("MilesDrive:$MilesDrive")
        this.MilesDrive=MilesDrive
        println("Owner:$Owner")
        this.Owner=Owner

    }


    fun GetPrice():Double?{
        return this.Price!! -( this.MilesDrive!!.toDouble() *10)
    }

    fun GetOwner(): String? {

        return this.Owner;
    }


}



fun  main(args:Array<String>){
    var huCar= Car("BMW",2015,10000.0,105,"Hussein")
    println("Get Owner:"+ huCar.GetOwner())
    println("Get price:"+ huCar.GetPrice())

    var jeCar= Car("Ka",2017,20000.0,1,"Jena")
    println("Get Owner:"+ jeCar.GetOwner())
    println("Get price:"+ jeCar.GetPrice())
}