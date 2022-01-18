class Car(
    var brand: String = "BMW",
    var price: Int = 0,
    var speed: Int = 0,

)
{
    fun throttle(){
        speed += 10
        println(speed)
    }
    fun getInfo(): String {
        return "$brand, $price, $speed"

    }

    fun makeCopy(brand: String = this.brand, price: Int = this.price, speed: Int = this.speed) = Car(brand, price, speed)

}
