fun main() {
    val greeting = "Здравстуйте"
    val userName = "мой повелитель"

    println("$greeting, $userName! Какое будет указание?")
    println("Я могу доставить для вас ${10 + 6 } девствениц.")

    // многострочник
    val multyString = """
           строка1
        строка2
                строка3
    """.trimIndent()        // удалит прбелы в начале строк выровняв по итнимальному отступу
    println(multyString)

    val multyString2 = """
           |строка1
        |строка2
               | строка3
    """.trimMargin()        // удалит прбелы в начале строк выровняв по |
    println(multyString2)
}