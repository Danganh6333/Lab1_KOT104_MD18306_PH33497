package com.dangchph33497.fpoly.lab1_md18306

fun main() {
    cases("Hello")
    cases(1)
    cases(0L)
    cases(testKt1())
    cases("hello")
}

fun cases(obj: Any) {
    when (obj) {
        1 -> println("One")
        "Hello" -> println("Greeting")
        is Long -> println("Long")
        !is String -> println("Not a string")
        else -> println("Unknown")
    }
}

class testKt1 {
}