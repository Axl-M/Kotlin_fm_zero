package lesson19_ENUM

fun main(){
    // дни недели
    // цвета ( и hex код)
    // статусы

    val statusesFromServer = listOf(101, 102, 103)

    for (i in statusesFromServer){
        println(i)
        Thread.sleep(1000)
    }

//    for (i in statusesFromServer){
//        when(i){
//            101 -> setStatus(Status.NEW)
//            102 -> setStatus(Status.COOKING)
//            103 -> setStatus(Status.COMPLETED)
//            else -> setStatus(Status.ERROR)
//        }
//        Thread.sleep(1000)
//    }

    for (i in statusesFromServer){
        when(i){
            Status.NEW.id -> setStatus(Status.NEW)
            Status.COOKING.id -> setStatus(Status.COOKING)
            Status.COMPLETED.id -> setStatus(Status.COMPLETED)
            else -> setStatus(Status.ERROR)
        }
        Thread.sleep(500)
    }

    println()
    println(Status.NEW.name)    // имя задекларированной константы
    println(Status.NEW.ordinal) // её порядковый номер
    // values - массив ENUM-ов
    for (i in Status.values()) println(i)
}

//enum class Status {
//    NEW,
//    COOKING,
//    COMPLETED,
//    ERROR,
//}

enum class Status(val id:Int) {
    NEW(101),
    COOKING(102),
    COMPLETED(103),
    ERROR(0),
}

fun setStatus(status: Status){
    when(status){
        Status.NEW -> println("Заказ принят")
        Status.COOKING -> println("Заказ готовиться")
        Status.COMPLETED -> println("Заказ готов")
        Status.ERROR -> println("Статус неизвестен")
    }
}