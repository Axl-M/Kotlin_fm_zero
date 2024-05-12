fun main() {
    printNameAndAge(userName = getName(), userAge = getAge())
}

fun getName() : String? {
    print("Введите имя: ")
    return readLine()
}

// можно сократить. не нужно {} и return. Только 1 строка (print использовать не сможем)
//fun getName() : String? = readLine()


fun getAge() : Int? {
    print("Введите возраст: ")
    return readLine()?.toInt()
}

//fun getAge() : Int? = readLine()?.toInt()

fun printNameAndAge(userName: String?, userAge: Int?) {
    println("Данные пользователя: $userName, $userAge лет" )
}