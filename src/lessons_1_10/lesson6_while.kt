package lessons_1_10

fun main(){
    var counter = 5

    while (counter>0){
        println("Реклама закончится через ${counter--}")  // выражение радо оборачивать в {}
        Thread.sleep(1000)
    }

    println("===============")

    // гарантированно выполниться хотябы 1 раз
    do {
        println("Реклама закончится через ${counter--}")  // выражение радо оборачивать в {}
        Thread.sleep(1000)
    } while (false)
}