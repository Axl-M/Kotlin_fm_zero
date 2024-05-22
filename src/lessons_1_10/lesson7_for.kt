package lessons_1_10

fun main(){
    // диапазоны (интервалы) - содержат числа в заданном промежутке
    val range1: IntRange = 42..422        // просто ставим ..
    val range2: IntRange = 42 until 422   // последнее число не входит
    val range3: LongRange = 42L..422L
    val range4: CharRange = 'a'..'z'
    val range5: ClosedRange<Double> = 42.1..432.1 // ClosedRange нельзя использовать для итерации по их значениям
    val range6: ClosedRange<Float> = 42.1f..422.1f
    val range7: IntProgression = 1..1000 step 2  // шаг (IntProgression)
    val range8: IntProgression  = 100 downTo 1  // диапазон по убыванию (тоже IntProgression)

    val a = 52 in range1
    val b = 52 !in range1
    println(a)
    println(b)

    for (i in 5 downTo 1) {
        println("Реклама закончится через $i")  // выражение радо оборачивать в {}
        Thread.sleep(1000)
    }

    for (i in range2 step 3) {
        if (i == 42) {
            println("42 не распечатается")
//            continue
            return // завершит текущую функцию
        }

        println(i)

        if (i == 201) {
            println("Пользователь нажал кнопку \"Пропустить\"")
            break
        }


    }
}