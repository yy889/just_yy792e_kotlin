package lgtm

fun main(args : Array<String>) {
    val input = readln().toLong()
    var v1 = input%4
    var v2 = input%100
    var v3 = input%400
    if (v1<=0 && v2<=0 && v3<=0) {print(1)}
    else if (v1<=0 && v2>0 && v3>0) {print(1)}
    else print(0)
}