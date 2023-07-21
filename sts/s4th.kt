package sts

import java.io.File

/*
fun main() {

    val fileName = "F:/eidewj/r1a116513/src/myfile.csv"
    val myfile = File(fileName)

    myfile.printWriter().use { out ->

        out.println("270,08:00,Erqi Road,Sanyang Road,08:02")
        out.println("Second line")
    }

    println("Writed to file")
}*/

fun main(args: Array<String>) {

    val fileName = "F:/eidewj/r1a116513/src/myfile.csv"

    val myList = mutableListOf<String>()

    File(fileName).useLines { lines -> myList.addAll(lines) }

    myList.forEachIndexed { i, line -> println("${i}: " + line) }
}
