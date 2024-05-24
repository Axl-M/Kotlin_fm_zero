package lesson15_abstrac_class

fun main() {
    val upsilonShuttle = Upsilon(50)

    upsilonShuttle.runDiagnostic()
    upsilonShuttle.startEngine()
    upsilonShuttle.prepareForTakeoff()
    upsilonShuttle.prepareForLanding()
    upsilonShuttle.startShooting()
    upsilonShuttle.reloadGuns()
}
