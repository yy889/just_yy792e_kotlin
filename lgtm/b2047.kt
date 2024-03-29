package lgtm

import sts.da
import kotlin.math.roundToInt

fun log12(num: Double): Double = when {
    num < 5 -> 2.5 - num
    num >= 10-> num/2-1.5
    else -> 2 - 1.5*(num - 3)*(num - 3)
}
fun main(){
    var cs = 0
    var k = 0
    var e:Int =0
    val t = readln().toDouble()
    var c = log12(t)
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
        1 -> {println(dd+"000")}
        2 -> {println(dd+"00")}
        3 -> {println(dd+"0")}
        4 -> {println(dd)}
    }
    println("\n$d\n$e\n$c\n$t")

//    println("$dc \n$d")
}

/*  another way to solve B2047     Made by cong
fun main() {
    val input = readln().toFloat()
    if(input >= 0 && input < 5){
        println(String.format("%.3f", first(input)))
    }else if(input >= 5 && input < 10){
        println(String.format("%.3f", second(input)))
    }else if(input >= 10 && input < 20){
        println(String.format("%.3f", third(input)))
    }
}

fun first(input: Float):Float{
    return 2.5f - input
}

fun second(input: Float):Float{
    return 2f - 1.5f * ( input - 3f ) * ( input - 3f )
}

fun third(input: Float):Float{
    return input / 2f - 1.5f
}*/
