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

    println("=============")
    println(Status.NEW.getStatusDescription())
    println(Status.COOKING.getStatusDescription())
    println(Status.COMPLETED.getStatusDescription())
}

//enum class Status {
//    NEW,
//    COOKING,
//    COMPLETED,
//    ERROR,
//}

enum class Status(val id:Int) {
    NEW(101) {
        override fun getStatusDescription(): String {
            return "Заказ создан и ожидает оплаты"
        }
    },
    COOKING(102) {
        override fun getStatusDescription(): String {
            return "Заказ оплачен и начал готовиться"
        }
    },
    COMPLETED(103) {
        override fun getStatusDescription(): String {
            return "Заказ готов, можно забирать"
        }
    },
    ERROR(0) {
        override fun getStatusDescription(): String {
            return "Что-то пошло не так. Мы уже разбираемся"
        }
    };

    abstract fun getStatusDescription(): String
}

fun setStatus(status: Status){
    when(status){
        Status.NEW -> println("Заказ принят")
        Status.COOKING -> println("Заказ готовиться")
        Status.COMPLETED -> println("Заказ готов")
        Status.ERROR -> println("Статус неизвестен")
    }
}