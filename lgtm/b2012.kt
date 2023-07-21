package lgtm

import kotlin.math.roundToInt
fun main(args: Array<String>){
    val a = readln().toInt()
    val b = readln().toInt()
    var cs = 0
    var e = 0
    var c1 = b/a.toDouble()
    var c = c1*100
    var d = (1000.0 * c).roundToInt() / 1000.0
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
        1 -> {println(dd+"000%")}
        2 -> {println(dd+"00%")}
        3 -> {println(dd+"0%")}
        4 -> {println(dd+"%")}
    }
}