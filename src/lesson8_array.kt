fun main(){
    val arrayOfIngridients: Array<String> = arrayOf("яйцо", "помидор", "зелень", "соль", "перец")
    val intArray: IntArray = intArrayOf(4, 4, 2) // val intArray = intArrayOf()  можно просто проинициализировать
    val charArray: CharArray = charArrayOf('2', '3', '4')  // здесь нельзя

    println("Размер массива с ингридиентами: ${arrayOfIngridients.size}")
    println(arrayOfIngridients.indexOf("помидор"))  // -1 если не найдет
    println(arrayOfIngridients[2])

    arrayOfIngridients.set(1, "капуста")  // рекомендуется обращаться по индексу вместо set и get
    val new = arrayOfIngridients.get(1)
    println(new)

    println()
    for (i in arrayOfIngridients) {
        println(i)
    }

    println("================")
    for (i in  arrayOfIngridients) {
        println("Ингридиент ${arrayOfIngridients.indexOf(i) + 1}: $i")
    }

}