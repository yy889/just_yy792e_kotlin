package lgtm

import kotlin.math.floor


fun main(){
    var v1 = (1.0/3.0).toDouble()
    val a1 = Math.pow(4456.873269333333,v1)
    val input1 = readln().toInt()
    when(input1){
        1 -> println("I love Luogu!")
        2 -> {println("6 4")}
        3 -> {println("3\n12\n2")}
        4 -> {println("166.667")}
        5 -> {println("15")}
        6 -> {println("%.4f".format((Math.sqrt(117.00))))}
        7 -> {println("110\n90\n0")}
        8 -> {println("%.4f".format(10*3.141593));println("%.4f".format(25*3.141593));println("%.3f".format(4*125*3.141593/3))}
        9 -> {println((((((1+1)*2)+1)*2)+1)*2)}
        10 -> {println("9")}
        11 -> {println("%.4f".format(100.0/3))}
        12 -> {println("13\nR")}
        13 -> {println((floor(a1)).toInt())}
        14 -> {println(50)}
    }

}