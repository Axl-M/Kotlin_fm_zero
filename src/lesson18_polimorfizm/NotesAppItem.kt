package lesson18_polimorfizm

import java.util.Date

class NotesAppItem {

    fun addItemToCell(
        title: String,
        creationDate: Date,
        type: String,
        data: String,
    ){
        println("Item \"$title\" added to cell - $creationDate\nType: $type\nData: $data")
    }

    fun addItemToCell(
        title: String,
        creationDate: Date,
        type: String,
        data: Long,     // номер телефона
    ){
        println("Item \"$title\" added to cell - $creationDate\nType: $type\nData: $data")
    }

    fun addItemToCell(
        title: String,
        creationDate: Date,
        type: String,
        data: List<String>,
    ){
        println("Item \"$title\" added to cell - $creationDate\nType: $type\nData: $data")
    }
}