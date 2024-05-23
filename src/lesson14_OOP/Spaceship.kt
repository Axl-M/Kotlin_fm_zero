package lesson14_OOP

class Spaceship(
    val name: String,
    val speed: Int,
    val unmanned: Boolean = false,
) {
    fun switchToWarpMode(){
        println("Переход в варп-режим")
    }
    fun runSystemDiagnostic(){
        println("запущена диагностика систем корабля")
    }
}