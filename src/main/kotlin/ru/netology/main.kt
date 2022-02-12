package ru.netology

fun main() {
    val likes = 1000
    val chislo = likes % 10
    val chislo2 = likes % 100
    val person = "человеку"
    val people = "людям"
    val person2 = "человек"


    val text =
        if (chislo == 1 && chislo2 !== 11)
            "Понравилось $likes $person"
        else if (likes == 1000) "Понравилось $likes $person2"
        else "Понравилось $likes $people"
    println(text)

}


