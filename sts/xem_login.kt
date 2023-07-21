package sts

import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.URL

fun main() {
    val url = URL("https://reqres.in/api/users?page=1")
    val connection = url.openConnection()
    BufferedReader(InputStreamReader(connection.getInputStream())).use { inp ->
        var line: String?
        while (inp.readLine().also { line = it } != null) {
            println(line)
        }
    }
}
