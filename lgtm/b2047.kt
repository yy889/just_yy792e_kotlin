package lgtm

import kotlin.math.roundToInt

fun log12(num: Double): Double = when {
    num < 5 -> 2.5 - num
    num >= 10 -> 2 - 1.5*(num - 3)*(num - 3)
    else -> (num/2)-1.5
}
fun main(){
    val t = readln().toDouble()
    var c = log12(t)
    var d = (1000.0 * c).roundToInt() / 1000.0
    println(d)
}