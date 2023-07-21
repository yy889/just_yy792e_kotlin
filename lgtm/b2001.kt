package lgtm


fun main(){
    val a = readln()
    var cs = 0
    var e = 0
    var k = 0
    var t = ""
    var m = ""
    var ad = a.length
    while (cs < ad) {
        var ch = a[cs].toString()
        when(ch){
            " " -> break
            else -> cs++
        }
    }

    while (k < cs) {
        t += a[k].toString()
        k++
    }
    k =cs+1
    while (k <= ad-1) {
        m += a[k].toString()
        k++
    }
    var b = t.toLong()
    var c = m.toLong()
    println(b+c)
//    println("\n$t\n$m\n$e")

}
/* another way to solve B2001 or B2003
fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)
    println(a + b)
}*/

// For B2003 just let val(a, b) --> val(a, b, c)
// For B2008,save B2003's change and add  var d = a + b -> println(d * c)
