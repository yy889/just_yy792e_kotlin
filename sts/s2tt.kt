package sts

fun main(){
    val s1 = readln().toLong()
    val s2 = readln().toLong()
    val s3 = readln().toLong()
    /*var a : Boolean = true
    println("123+ ${if (a) "1123" else "2901"}")*/
//    val er : () -> Int
//    er = {
//        val ed : Int = 11245
//        "$ed".toInt()
//    }
//    println(er())
    val fas : (Long, Long, Long) -> String = { n1, n2, n3 -> "n1=$n1,n2=$n2,n3=$n3"}
    println(fas(s1,s2,s3))
}
