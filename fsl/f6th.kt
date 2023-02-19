fun main() {
	val a = readln().toLong()
	val b = readln().toLong()
	val c = readln().toString()
	when (c) {
		"+" -> {
			println(plus(a,b))
		}
		"-" -> {
			println(sub(a,b))
		}
		"*" -> {
			println(mutl(a,b))
		}
		"/" -> {
			println(devide(a,b))
		}
	}
}
fun plus(a:Long, b:Long):Long{
	return a+b
}
fun sub(a:Long, b:Long):Long{
	return a-b
}
fun mutl(a:Long, b:Long):Long{
	return a*b
}
fun devide(a:Long, b:Long):Long{
	return a/b
}
