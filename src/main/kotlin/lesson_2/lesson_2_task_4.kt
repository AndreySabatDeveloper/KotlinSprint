package org.example.lesson_2

fun main() {
    val miningBonus = 1.2
    val cristalOre = 7
    val ironOre = 11
    val cristalOreWithBonus: Int = (miningBonus * cristalOre).toInt()
    val ironOreWithBonus: Int = (miningBonus * ironOre).toInt()
    println(cristalOreWithBonus)
    println(ironOreWithBonus)
}
