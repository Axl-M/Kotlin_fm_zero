fun main() {
    val name = getName()
    val age = getAge()
}

fun getName() : String? {
    print("Введите имя: ")
    val name = readLine()
    println(name)
    return readLine()
}

fun getAge() : Int? {
    print("Введите возраст: ")
    val age = readLine()?.toInt()
    println(age)
    return age
}