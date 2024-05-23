package lesson14_OOP

class Industrial(
    name: String,
    speed: Int,
    val numberOfMiners: Int,
) : Spaceship(name, speed, unmanned = true) {

    fun launchScanningDrones(){
        println("$name: сканирующие дроны запущены")
    }
}