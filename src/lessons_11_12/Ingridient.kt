package lessons_11_12

// пустой конструктор первичный (primary)
// можно указать явно ключевое слово constructor

class Ingridient constructor(name: String, weight:Int, count: Int) {

    var name = name
    var weight = weight
    var count = count

}

// secondary constructor
class Ingridient2(val name: String, val weight:Int, val count: Int) {

    var isNeedToPrepare = false

    constructor(
        name: String,
        weight: Int,
        count: Int,
        isNeedToPrepare: Boolean,
    ) : this(name, weight, count){
        this.isNeedToPrepare = isNeedToPrepare      // если имена разные this не нужен
    }

    init {
        println("Ингридиент $name создан")
    }


}