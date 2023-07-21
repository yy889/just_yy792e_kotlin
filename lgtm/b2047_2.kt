package lgtm

import kotlin.math.roundToInt
import kotlin.math.roundToLong


fun main(){
    var cs = 0
    var k = 0
    var e:Int =0
    val (a, b) = readln().split(' ').map(String::toLong)
//    var c:Double = a/b


    var d = (1000000000.0 * a/b).roundToLong() / 1000000000.0
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
        1 -> {println(dd+"000000000")}
        2 -> {println(dd+"00000000")}
        3 -> {println(dd+"0000000")}
        4 -> {println(dd+"000000")}
        5 -> {println(dd+"00000")}
        6 -> {println(dd+"0000")}
        7 -> {println(dd+"000")}
        8 -> {println(dd+"00")}
        9 -> {println(dd+"0")}
        10 -> {println(dd)}
    }
//    println("\n$d\n$e\n$c\n")

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
