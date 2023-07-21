package sts

fun main(){
    val a = readln().toInt()  //输入值a
    var b = a/2  //将a/2    奇数返回a/2-0.5
    var c = b*2  //将b*2    奇数返回a-1
    var d = a-c  //计算a-c
    when(d){
        0 -> {println("偶数")}
        1 -> {println("奇数")}
        -1 -> {println("奇数")}
    }
}