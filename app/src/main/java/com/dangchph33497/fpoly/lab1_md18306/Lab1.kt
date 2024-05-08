package com.dangchph33497.fpoly.lab1_md18306

fun main(){
    println("Hello Kotlin - bai1")
    println("----------------------")

    val a = 1
    val b = 2
    var c = a + b

    val mess : String = "Tổng 2 số $a và $b là : $c"
    println(mess)

    val soA = 1
    val soB = 3f
    val kq = phepChia(soA,soB)
    println(kq)

    //Khai báo và sử dụng mảng
    var arrX = intArrayOf(1,2,3,4)
    var arrY = arrayOf(1.5f,"A",1)

    println("""Giá trị đầu tiên của mảng X:${arrX[0]}
        |Giá trị đầu tiên của mảng Y : ${arrY[0]}
    """.trimMargin())
}

fun phepChia(soA : Int,soB: Float):String {
    if (soB == 0f){
        return "$soB không được bằng 0!"
    }
    val thuong = soA / soB
    return "Thương 2 số $soA và $soB là $thuong"
}

class Lab1 {

}