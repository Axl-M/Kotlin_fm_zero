fun main() {
    // ссылочное сравнение
    // === и !==
    // ссылаются на ОДИН объект

    var userAge = 42
    var comparisonResult = (userAge >= AGE_OF_MAJORITY) && (userAge <= RETIREMENT_AGE)
    // скобки необзательны для  &&  || и обязательны для and or
    println("Результат проверки возраста пользователя: $comparisonResult")

    // &&  ||  !
    userAge = 72
    comparisonResult = userAge >= AGE_OF_MAJORITY && userAge <= RETIREMENT_AGE
    println("Результат проверки возраста пользователя: $comparisonResult")

    // изящная запись
    comparisonResult = userAge in AGE_OF_MAJORITY..RETIREMENT_AGE   // находится в диапазоне
    comparisonResult = userAge !in AGE_OF_MAJORITY..RETIREMENT_AGE   // находится вне диапазона
    // ставим .. потом 2-ю переменную и ввод (знаки поставятся сами)
    println("Результат проверки возраста пользователя: $comparisonResult")

}

const val AGE_OF_MAJORITY = 18
const val RETIREMENT_AGE = 65