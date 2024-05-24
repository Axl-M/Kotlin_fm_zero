package lesson16_acess_modificator

private val supportInfo = "Support Info"

class HitchHikerGuide { // public перед классом необзателен (по умолчанию)

    var title= "============"
    private var numberOfPages = 999

    private fun chooseArticle() {
        println("Open catalog")
    }

    fun getNumberOfPages() = numberOfPages  // через эту публичную ф-цию имеем доступ к приватному свойству

    fun setNumberOfPages(number: Int){
        numberOfPages = number
    }
}

class Support {
    fun printInfo() {
        println(HitchHikerGuide::class.simpleName)
        println(HitchHikerGuide().title)
        // chooseArticle() // не видна так как она приватна и видна только в своем классе
        println(supportInfo)  // объявлена в файле и видна в нем везде
    }
}