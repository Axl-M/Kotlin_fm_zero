package lesson14_OOP

fun main(){
//    название, скорость, беспилотник
//    варп-режим, диагностика системы
//    разведчик, индустриальный

    val ship1 = Spaceship( "ship1", 500)
    ship1.runSystemDiagnostic()
    ship1.switchToWarpMode()
}