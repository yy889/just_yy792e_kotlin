package lgtm

import kotlin.math.ceil

fun main(){
    var (a,b,c) = readLine()!!.split(" ").map { it.toDouble()}
    var v1 = 0
    if (b<=0) v1=a.toInt()
        else v1= ceil((c/b.toInt())).toInt()
    var v2 = (a-v1).toInt()
    if (v2>=0) println(v2)
        else println(0)
}