package lesson14_OOP

class Scout(
    name: String,
    speed: Int,
    val radarRange: Int,
    val afterBurnerSpeed: Int,
) : Spaceship(name, speed) {   // наследовать от. Необходимо вызвать конструктор (так как в базовом есть поля)

    fun handleDataFromRadar(){
        println("$name: обработка данных с радара")
    }

    fun runAfterburner(){
        println("$name: форсаж запущен")
    }
}