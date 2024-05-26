package lesson18_polimorfizm

import java.util.Date


// много форм. Один интерфейс для разных типов. (Поведение множеством способов)

fun main(){

    // ad hoc (по случаю). Какая ф-ция сработает в зависимости от типа переданных данных и их количества
    // subtyping (полиморфизм включения). Ф-ции использующие базовый тип должны использовать подтипы базового типа
    // parametric (параметрический). Через обобщенные типы.

    val creationDate = Date()

//    val messageItem: MessageItem = MessageItem(
//        "call sister",
//        creationDate,
//        "message",
//        "Call sister to congratulate",
//    )
//
//    val phoneItem: PhoneItem = PhoneItem(
//        "sister's number",
//        creationDate,
//        "phone",
//        8914777000,
//    )
//
//    val listItem: ListItem =  ListItem(
//        "TodoList",
//        creationDate,
//        "List",
//        listOf("wash dog", "do the cleaning", "buy new shoes"),
//    )

    // типы можно указать базовый класс
    val messageItem: NotesAppItemSubtyping = MessageItem(
        "call sister",
        creationDate,
        "message",
        "Call sister to congratulate",
    )

    val phoneItem: NotesAppItemSubtyping = PhoneItem(
        "sister's number",
        creationDate,
        "phone",
        8914777000,
    )

    val listItem: NotesAppItemSubtyping =  ListItem(
        "TodoList",
        creationDate,
        "List",
        listOf("wash dog", "do the cleaning", "buy new shoes"),
    )



//    println(messageItem.getItemData())
//    println()
//    println(phoneItem.getItemData())
//    println()
//    println(listItem.getItemData())
//    ===================================

    // или так
    // parametric (параметрический). Через обобщенные типы.

    val arrayOfNotes = arrayOf<NotesAppItemSubtyping>(messageItem, phoneItem, listItem)
    showAllNotes(arrayOfNotes)

}

fun showAllNotes(notes: Array<NotesAppItemSubtyping>){
    notes.forEach {
        println()
        println(it.getItemData())
    }
}