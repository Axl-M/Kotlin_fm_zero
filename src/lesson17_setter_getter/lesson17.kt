package lesson17_setter_getter

fun main () {
    val fish = BabelFish(null)

    println("old value: ${fish.nerveSignalLel}")
//    println("old value: ${fish.isTranslated}")
//    fish.nerveSignalLel = 400
//    println("new value: ${fish.nerveSignalLel}")
//    println("old value: ${fish.isTranslated}")

    val fish2 = BabelFish(2)
    println("old value: ${fish2.nerveSignalLel}")

    val fish3 = BabelFish(21)
    println("old value: ${fish3.nerveSignalLel}")

}