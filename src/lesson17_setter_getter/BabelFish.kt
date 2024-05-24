package lesson17_setter_getter

// getter i setter automatically created
//class BabelFish {
//    var nerveSignalLel = 200
//}

class BabelFish (
    private val coefficient: Int?
){
    var isTranslated = false
    var nerveSignalLel = 200
        // можно прописать самостотельно что она будет отдавать (field -означает значение проинициализированное по-умолчанию)
//        get() = field
        get() = if (coefficient != null) field * coefficient else field  // обязательно здесь использовать field (имя переменной вызовет рекурсию)
         // либо установить что она будет возвращать всегда
//        get() = 250
        set(value) {
            field = value
            if(value > 300){
                isTranslated = true
                println("isTranslated = true")
            }
        }
}