package lgtm

import kotlin.math.roundToInt

fun main(){
    var cs = 0
    var e = 0
    val (x, a, y, b) = readln().split(' ').map(String::toInt)
    var g = (a*x-b*y)/(a-b)
    var d = (100.0 * g).roundToInt() / 100.0
    var dd = d.toString()
    var dc = dd.length
    while (cs < dc) {
        var ch  = dd[cs].toString()
        when(ch){
            "." -> {e = dc-cs;break}
            else -> cs++
        }
    }
    when(e){
        1 -> {println(dd+"0")}
        2 -> {println(dd)}
    }
}