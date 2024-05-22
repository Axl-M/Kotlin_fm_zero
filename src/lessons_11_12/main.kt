package lessons_11_12

fun main() {

    val dish1: Dish = Dish(     // тип переменной необязательно (можно выбрать из всплывающео меню Alt + ENTER) тоже Dish
        id = 1,
        name = "яичница",
        category = "Завтраки",
        ingridients = listOf("яйцо", "помидор", "соль", "перец"),
    )

    val dish2: Dish = Dish(
        id = 2,
        name = "Суп лапша",
        category = "Обеды",
        ingridients = listOf("вода", "курица", "вермишель", "соль", "перец"),
    )

    println(dish1.name)
    println(dish1.ingridients)
    println(dish1.inFAvorites)
    println()
    println(dish2.name)
    println(dish2.ingridients)
    println(dish2.inFAvorites)

    dish1.category = "Блюда из яиц"
    dish2.inFAvorites = true
    println(dish1.category)
    println(dish2.inFAvorites)

    println()
    println("================")
    println("Действия для блюда ЯИЧНИЦА")
    dish1.addToFavorites()
    println( dish1.inFAvorites)
    dish1.startCooking()

    println()
    println("Действия для блюда СУП ЛАПША")
    dish2.addToFavorites()
    println( dish2.inFAvorites)
    val ingridientsForSoup = dish2.downloadIngridients()
    println(ingridientsForSoup)
    dish2.removeFromFavorites()
    println( dish2.inFAvorites)

    val ingridient1 = Ingridient()
    println()
    println(ingridient1.name)
    ingridient1.name = "репчатый лук"
    println(ingridient1.name)

}