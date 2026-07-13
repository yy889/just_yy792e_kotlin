package lgtm

fun main(args: Array<String>) {
    val (a,b,p,q,m) = readln().split(' ').map(String::toDouble)
    println((a*p+b*q).toLong())
    println((m-(a*p+b*q)).toLong())
}