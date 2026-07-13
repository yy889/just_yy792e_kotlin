package lgtm

fun main(args: Array<String>) {
    val a = readln().toLong()
    var v1 = a%2
    var p1 =0;var p2 = 0
    if (v1<=0) {p1 = 1}
        else {p1 = 0}
    if (a<= 4) {p2 = 0}
        else if (a<=12) {p2 = 1}
            else {p2 = 0}
    var a1 = 0;var a2 = 0 ;var a3 = 0;var a4 = 0
    if (p1+p2>=2) {a1=1}
        else a1 =0
    if (p1+p2>0) a2=1
        else a2 =0
    when (p1+p2) {
        1 -> {a3 = 1;a4 = 0}
        0 -> {a3 = 0;a4 = 1}
        else -> {a3*1;a4*1}
    }
    println("$a1 $a2 $a3 $a4")
}