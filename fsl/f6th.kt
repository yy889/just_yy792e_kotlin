import kotlin.math.pow

fun main() {
	val a = readln().toLong()
	val c = readln().toString()
	val b = readln().toLong()

	when (c) {
		"+" -> { println(plus(a,b)) }  //加法部分
		"-" -> { println(sub(a,b))}     /*减法部分*/
		"*" -> { println(mutl(a,b))}/*乘法部分*/
		"/" -> { println(devide(a,b))}/*除法部分*/
		"^" -> { println(power(a,b))}/*n次方部分*/
	}
}
fun plus(a:Long, b:Long):Long{ return a+b }
fun sub(a:Long, b:Long):Long{ return a-b }
fun mutl(a:Long, b:Long):Long{ return a*b }
fun devide(a:Long, b:Long):Long{ return a/b }
fun power(a:Long, b:Long): Double { return a.toDouble().pow(b.toDouble()) }