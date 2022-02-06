package ru.netology

fun main() {
    val likes = 22
    val person = "человеку"
    val people = "людям"


    val text =
        if (likes == 1 || likes == 21 || likes == 31) "Понравилось $likes $person" else "Понравилось $likes $people"
    println(text)


}