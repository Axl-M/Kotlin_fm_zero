fun main() {
    val name = getName()
    val age = getAge()
    printNameAndAge(name, age)
}

fun getName() : String? {
    print("Введите имя: ")
    return readLine()
}

fun getAge() : Int? {
    print("Введите возраст: ")
    return readLine()?.toInt()
}

fun printNameAndAge(name: String?, age: Int?) {
    println("Данные пользователя: $name, $age лет" )
}