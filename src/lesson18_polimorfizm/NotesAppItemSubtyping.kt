package lesson18_polimorfizm

import java.util.Date

// subtyping (полиморфизм включения). Ф-ции использующие базовый тип должны использовать подтипы базового типа
open class NotesAppItemSubtyping {
    open fun getItemData() = ""
}

// под каждый тип создаем подкласс
class MessageItem(
    private val title: String,
    private val creationDate: Date,
    private val type: String,
    private val data: String,
) : NotesAppItemSubtyping() {
    override fun getItemData(): String {
        return "Item \"$title\" added to cell - $creationDate\nType: $type\nData: $data"
    }
}

class PhoneItem(
    private val title: String,
    private val creationDate: Date,
    private val type: String,
    private val data: Long,
) : NotesAppItemSubtyping() {
    override fun getItemData(): String {
        return "Item \"$title\" added to cell - $creationDate\nType: $type\nData: $data"
    }
}

class ListItem(
    private val title: String,
    private val creationDate: Date,
    private val type: String,
    private val data: List<String>,
) : NotesAppItemSubtyping() {
    override fun getItemData(): String {
        return "Item \"$title\" added to cell - $creationDate\nType: $type\nData: $data"
    }
}