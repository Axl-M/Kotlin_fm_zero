package lesson16_acess_modificator

fun main() {

    // public - по-умолчанию дл всех классов, методов, переменных (доступ из люблго места проекта)
    // private - доступны только в рамках файла или класса
    // protected - видны в классе и в классах наследниках
    // internal - в любой части модуля в котором определены

    val guide = HitchHikerGuide()
    guide.title = "Don't panic"
//    guide.chooseArticle()


    // Инкапсуляция. Получаем приватные данные через публичную ф-цию
    // упаковка данных и ф-ций для работы с ними внутрь общего компонента
    Support().printInfo()

    println()
    println(guide.getNumberOfPages())
    guide.setNumberOfPages(42_000)
    println(guide.getNumberOfPages())


}