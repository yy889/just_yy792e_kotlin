package lgtm

import kotlin.math.roundToInt

fun main(args: Array<String>) {
    val (a, b, m) = readln().split(' ').map(String::toInt)
    var e = a+b
    var d = e/m
    var cs = 0
    var n = ""
    var dd = d.toString()
    var dc = dd.length
    while (cs < dc) {
        var ch  = dd[cs].toString()
        when(ch){
            "." -> {break}
            else -> cs++
        }
    }
    var k = 0
    while (k < cs) {
        n += dd[k].toString()
        k++
    }
    n
    println(n)

}