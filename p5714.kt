package lgtm

fun main(args: Array<String>) {
    val (m, h) = readLine()!!.split(" ").map { it.toDouble()}
    var bmi = m/h/h
    if (bmi < 18.5){println("Underweight")}
        else if(bmi < 24){println("Normal")}
            else bmi*1
    var bmis = "%.4f".format(bmi)
    var (v1 ,v2) = bmis.split(".").map { it.toString() }
    while (v2.length > 4) {
        v2 = v2.dropLast(1)
    }
    while (v2.lastOrNull() == '0') {
        v2 = v2.dropLast(1)
        if (v2.lastOrNull() == null) break
            else m*1
    }
    if (bmi >= 24 && v2.lastOrNull() !== null){println("$v1.$v2");println("Overweight")}
        else if (bmi >= 24 && v2.lastOrNull() == null){println("$v1");println("Overweight")}
            else m*1
}