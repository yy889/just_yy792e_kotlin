package sts

fun main(){
    var cs = 0
    val input = readln()
    var inputcd = input.length
    while (cs < inputcd) {
        var ch  = input[cs].toString()
        if (ch==" ") return println("空格在:${da(cs)}号位处")
        else println(ch)
        cs++
    }
   /* val str = "jbjb"
    val arr = str.toCharArray()
    println(arr)
    for (i in arr.indices)
    if i = " "*/
}
fun da(a:Int): Int {return a+1}