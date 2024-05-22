package lessons_1_10// collections
// переменное количество элементов или 0 обычно одного типа
// List - можно менять размер (add, remove) в отличие от массивов. Сравнение по значению (в массиве по ячейке памяти)
// Set
// Map - словарь (ассоциативный список)

fun main() {
    val list: List<Int> = listOf(2, 2, 4)  // не изменяется
    val list2: MutableList<Int> = mutableListOf(1, 2, 3)  // изменяемый

    println(list2)
    list2.add(100)  // Один параметр, добавляет в конец
    println(list2)
    list2.add(0, 88)  // 2 параметра (куда добавить, что добавить
    println(list2)

    println(list2.contains(88))
    println(list2.isEmpty())
    println(list2.isNotEmpty())

    list2.add(88)
    println(list2.indexOf(88))          // индекс первого встретившегося числа
    println(list2.lastIndexOf(88))  // последнего

    list2.sort()                // сортировать по возраствнию
    list2.sortDescending()      // по убыванию
    list2.reverse()             // обратиь порядок

    list2.forEach {
        println(it)     // для каждого элемента что сделать
    }

    val mutableList2 = list2.filter { it == 88 }
    mutableList2.forEach { println(it) }

    val mutableList3 = list2.map { it * 2 }
    println(mutableList3)
}