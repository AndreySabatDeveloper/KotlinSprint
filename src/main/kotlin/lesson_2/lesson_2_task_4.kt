package org.example.lesson_2

fun main() {
    val miningBonus = 20
    val cristalOre = 7
    val ironOre = 11
    val cristalOreWithBonus: Int = (((miningBonus * 0.01) + 1) * cristalOre).toInt()
    val ironOreWithBonus: Int = (((miningBonus * 0.01) + 1) * ironOre).toInt()
    println(cristalOreWithBonus)
    println(ironOreWithBonus)
}
