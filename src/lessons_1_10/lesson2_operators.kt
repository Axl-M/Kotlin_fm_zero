package lessons_1_10

fun main() {
    val a = 5
    val b = 7
    println(a + b)

    val intNum1: Int = 10   // указание типа здесь излишне
    val intNum2: Int = 3
    println(intNum1 / intNum2) // 3 так как передали целые числа, дробна часть отбрасывается

    val floatNum1: Float = 10f  // указание типа здесь излишне
    val floatNum2: Float = 3f
    println(floatNum1 / floatNum2)  // 3.3333333

    val doubleNum1: Double = 10.0   // указание типа здесь излишне
    val doubleNum2: Double = 3.0
    println(doubleNum1 / doubleNum2)  // 3.3333333333333335

    println(10 % 3)     // остаток от деления = 1

    val c = floatNum1 + doubleNum1
    println(c)
    println(c::class)               // ссылка на Kotlin-class (double (Kotlin reflection is not available))
    println(c::class.simpleName)    // имя класса  (Double)

    var counter = 0
    counter = counter + 1
    counter += 1
    counter++
    println(counter)

    counter -= 1
    counter--

    ++counter
    --counter

}