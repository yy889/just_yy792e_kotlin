package sts

import kotlin.math.pow
import kotlin.math.sqrt

fun main(){
    println("今日初始值: ")
    val ql = readln().toInt()
    val random1 =(0..100).random()
    val random2 =(0..100).random()
    val ysf2 =(0..4).random()
    var rg1 = sqrt(random1.toDouble())
    var rg2 = sqrt(random2.toDouble())
/*    val sql : (Int) -> String = {n1 -> sqrt(n1.toDouble()).toString() }*/


    /*when(ysf2){
        0 -> {var jg = plus(z1.toInt(), ql.toInt())}
        1 -> {var jg = sub(z1.toInt(), ql.toInt())}
        2 -> {var jg = mutl(z1.toInt(), ql.toInt())}
        3 -> {var jg = devide(z1.toInt(), ql.toInt())}
        4 -> {var jg = pow(z1.toInt(), ql.toInt())}
    }*/
    var jq = ysf1(ql,random2)
    var jq1 = ysf1(ql,random1)
    var jq2 = ysf1(jq,jq1)
    println("今日狱币->魔晶率为1->$jq2")
}
fun ysf1(rg1:Int,rg2:Int):Int{
    return when ((0..5).random()) {
        0 -> { return (plus(rg1.toInt(), rg2.toInt())) }
        1 -> { return (sub(rg1.toInt(), rg2.toInt())) }
        2 -> { return (mutl(rg1.toInt(), rg2.toInt())) }
        3 -> { return (devide(rg1.toInt(), rg2.toInt())) }
        4 -> { return (pow(rg1.toInt(), rg2.toInt()).toInt()) }
        5 -> { return (sql(rg1.toInt()).toInt()) }
        else -> {return("0").toInt()}
    }
}



fun plus(a: Int, b: Int): Int { return a+b }
fun sub(a: Int, b: Int): Int { return a-b }
fun mutl(a: Int, b:Int):Int{ return a*b }
fun devide(a: Int, b: Int): Int { return a/b }
fun pow(a: Int, b: Int): Double { return a.toDouble().pow(b.toDouble()) }
fun sql(a:Int):Double{return sqrt(a.toDouble())}