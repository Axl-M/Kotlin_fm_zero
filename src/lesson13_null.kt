// NullPointException (NPE)
// когда переменная не инициализирована
// null - отсутствие объекта

fun main() {
    // nullable type - может хранить как значение, так и null
    val nullableString: String? = null
    val notNullableString: String = "some string"

    println(nullableString?.length)     // ?. -оператор безопасного вызова (проверяет слева если не null, то выполит код)
    println(notNullableString.length)

//    val nullableLine: String? = readLine()
//    val stringLength: Int = nullableString?.length ?: 90  // ?: если слева значение null - отдать значение справа
//    println(stringLength)

    // !! - оператор утверждения (уверены не может быть null)
    val stringLength: Int = nullableString!!.length
    // получаем
    // Exception in thread "main" java.lang.NullPointerException

}