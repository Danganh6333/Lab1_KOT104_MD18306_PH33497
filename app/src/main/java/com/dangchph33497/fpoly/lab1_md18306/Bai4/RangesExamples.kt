package com.dangchph33497.fpoly.lab1_md18306.Bai4

fun main() {
    for(i in 0..3) {             // 0123
        print(i)
    }
    print(" ")

    for(i in 0 until 3) {        // 012
        print(i)
    }
    print(" ")

    for(i in 2..8 step 2) {      // 2468
        print(i)
    }
    print(" ")

    for (i in 3 downTo 0) {      // 3210
        print(i)
    }
    print(" ")
    for (c in 'a'..'d') {        // abcd
        print(c)
    }
    print(" ")

    for (c in 'z' downTo 's' step 2) { // zxvt
        print(c)
    }
    print(" ")
    val x = 2
    if (x in 1..5) {            // x is in range from 1 to 51
        print("x is in range from 1 to 5")
    }
    println()

    if (x !in 6..10) {          // x is not in range from 6 to 10
        print("x is not in range from 6 to 10")
    }
}
class RangesExamples {
}