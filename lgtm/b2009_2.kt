package lgtm

import kotlin.math.roundToInt

fun main(args: Array<String>) {
    val (a, b) = readln().split(' ').map(String::toInt)
    var d = a/b
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


    var ml = n.toLong()
    var mk = a - ml*b
    println("$n $mk")
}