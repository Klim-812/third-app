package ru.netology

fun main() {
    val likes = 411
    val chislo = likes%10
    val chislo2 = likes%100
    val person = "человеку"
    val people = "людям"



    val text =
        if (chislo == 1 && chislo2 !==11 )
            "Понравилось $likes $person"
        else "Понравилось $likes $people"
    println(text)
}

