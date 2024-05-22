package lessons_11_12

class Dish(
    val id: Int,
    val name: String,
    var category: String,
    val ingridients: List<String>,
    var inFAvorites: Boolean = false,
) {
    fun addToFavorites() {
        inFAvorites = true
        println("Блюдо $name добавлено в избранное")
    }

    fun removeFromFavorites() {
        inFAvorites = false
        println("Блюдо $name удалено из избранного")
    }

    fun startCooking() {
        println("Пользователь перешел на экран начала приготовления блюда $name")
    }

    fun downloadIngridients(): List<String> {
        return ingridients
    }

}