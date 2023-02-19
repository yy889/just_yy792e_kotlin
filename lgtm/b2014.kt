package lgtm

import kotlin.math.roundToInt
const val pai = 3.1415926535
fun main(){
    val r1 = readln().toFloat()
    var r = (10000.0 * r1).roundToInt() / 10000.0
    var d1 = 2*r
    var c1 = pai * d1
    var s1 = r*r*pai
    var d = (10000.0 * d1).roundToInt() / 10000.0
    var c = (10000.0 * c1).roundToInt() / 10000.0
    var s = (10000.0 * s1).roundToInt() / 10000.0
    println("$d $c $s")
}