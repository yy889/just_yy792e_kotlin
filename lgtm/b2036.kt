package lgtm

import kotlin.math.abs
import kotlin.math.roundToInt

/*fun main() {
    val a = readln().toFloat()
    val res = when (a){
        a in -10000..-1 -> println(-1*a)
        a in 1..10000 -> println(a)
        else -> 0
    }
    println(res)
}*/

fun xem(num: Float): Float = when {
    num < 0 -> -1*num
    num > 0 -> num + 0
    else -> {
        num * 0
    }
}
fun main(){
    val t = readln().toFloat()
    var c = xem(t)
    var d = (100.0 * c).roundToInt() / 100.0
    println(d)
}