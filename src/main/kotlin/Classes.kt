fun exersiceClassMain(){
    val car = object {
        val speed: Int = 80
        val brand: String = "Volvo"
    }
    println("${car.brand} ${car.speed}")

    val p1: Point = Point(5, 7)
    val p2: Point = Point(1, 3)

println("${p1.x}, ${p1.y}")
println("${p2.x}, ${p2.y}")



    println(p1)
    println(p2)
}

data class Point(val x: Int, val y: Int)
