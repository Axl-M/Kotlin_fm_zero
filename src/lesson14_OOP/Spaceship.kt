package lesson14_OOP

open class Spaceship(   // open - у класса будут наследники.
// Если надо запретить создание экземпляров этого класса - объявить его abstract class
    val name: String,
    val speed: Int,
    val unmanned: Boolean = false,
) {
    fun switchToWarpMode(){
        println("${name}: Переход в варп-режим")
    }
    fun runSystemDiagnostic(){
        println("${name}: запущена диагностика систем корабля")
    }
}