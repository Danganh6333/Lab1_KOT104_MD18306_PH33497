package com.dangchph33497.fpoly.lab1_md18306.Bai4

fun main() {

    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers)   // 1
    println(authors === writers)  // 2
}

class EqualityChecksExamples {

}