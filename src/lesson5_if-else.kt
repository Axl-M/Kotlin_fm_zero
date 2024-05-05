fun main() {
    val userAge = readLine()!!.toInt()

    if(userAge >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    } else if (userAge == 16 || userAge == 17) {            // если в теле 1 строка кода {} не нужны
        println("Показать экран с ограниченным контентом")
    } else {
        println("Вернуться на главный экран")
    }

    // даже можно так
    if(userAge >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом")
    else if (userAge == 16 || userAge == 17) println("Показать экран с ограниченным контентом")
    else println("Вернуться на главный экран")

    // записать результат условия в переменную
    val resultText = if (userAge >= AGE_OF_MAJORITY) "Показать экран со скрытым контентом"
    else if (userAge == 16 || userAge == 17) "Показать экран с ограниченным контентом"
    else "Вернуться на главный экран"
    println(resultText)

    when(userAge) {
        10 -> println("Введено число 10")
        20 -> println("Введено число 20")
        42 -> println("Введено число 42")
        else -> println("Введено другое число")
    }

    // when возвращает значение
    val consoleNumber = when(userAge) {
        20 -> "Введено число 20"
        10 -> "Введено число 10"
        42 -> {                                   // если несколько строк использовать {}
            println("Дополнительное действие")
            "Введено число 42"
        }
        else -> "Введено другое число"
    }
    println(consoleNumber)
}

const val AGE_OF_MAJORITY = 18
