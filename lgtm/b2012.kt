package lgtm

import kotlin.math.roundToInt
fun main(args: Array<String>){
    val a = readln().toInt()
    val b = readln().toInt()
    var c = b/a.toDouble()
    var d = (100000.0 * c).roundToInt() / 100000.0
    var e = 100*d
    println("$e%")
}