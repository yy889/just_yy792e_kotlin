package lgtm


import kotlin.math.roundToLong

fun log112(num:Double):Double{
    return (num-32)/9
}
fun main(){
    var cs = 0
    var k = 0
    var e:Int =0
    val t = readln().toDouble()
    var c = log112(t)
    var d = (100000.0 * c*5).roundToLong() / 100000.0
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
        1 -> {println(dd+"00000")}
        2 -> {println(dd+"0000")}
        3 -> {println(dd+"000")}
        4 -> {println(dd+"00")}
        5 -> {println(dd+"0")}
        6 -> {println(dd)}
    }
//    println("\n$d\n$e\n$c\n$t")

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
