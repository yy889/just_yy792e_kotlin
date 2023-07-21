package lgtm

import kotlin.math.roundToLong
import kotlin.math.pow
const val pai = 3.14159
fun main(){
    val r1 = readln().toDouble()
    var s1 = r1.pow(2)
    var d = (10000.0 * 2*r1).roundToLong() / 10000.0
    var c = (10000.0 * 2*r1*pai).roundToLong() / 10000.0
    var s = (10000.0 * s1*pai).roundToLong() / 10000.0
    val fasc : (Double) -> String = {
        t ->
        var cs = 0
        var e = 0
        var k = 0
        var m = ""
        var dd = t.toString()
        var dc = dd.length
        while (cs < dc) {
            var ch  = dd[cs].toString()
            when(ch){
                "." -> {e = dc-cs;break}
                else -> cs++
            }
        }

        when(e){
            1 -> {dd+"0000"}
            2 -> {dd+"000"}
            3 -> {dd+"00"}
            4 -> {dd+"0"}
            5 -> {dd}
            else -> {cl(dd,cs)}
        }
    }
    println(fasc(d)+" "+fasc(c)+" "+fasc(s))
}
fun cl(wz:String,m:Int):String{
    var k = 0
    var n = ""
    while(k < m+5){
        n += wz[k].toString()
        k++
    }
    return(n)
}
/*
fun cut(d:Double):String{
    var cs = 0
    var e = 0
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
        1 -> {return(dd+"00000")}
        2 -> {return(dd+"0000")}
        3 -> {return(dd+"000")}
        4 -> {return(dd+"00")}
        5 -> {return(dd+"0")}
        6 -> {return(dd)}
    }
}*/
