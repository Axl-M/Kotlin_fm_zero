package lesson15_abstrac_class

abstract class SpaceShutle {
    abstract val tankSize: Int
    abstract fun runDiagnostic()
}

class Upsilon(override val tankSize: Int): SpaceShutle() {
    override fun runDiagnostic() {
        println("Диагностика запущена")
    }
}