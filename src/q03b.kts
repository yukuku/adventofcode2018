import java.io.File
import kotlin.test.fail

val map = Array(1000) { IntArray(1000) }
var overlap = 0

for (line in File("q03ainput.txt").readLines()) {
    val cols = line.split(Regex("[#@,:x ]+"))
    val c = cols[2].toInt()
    val r = cols[3].toInt()
    val w = cols[4].toInt()
    val h = cols[5].toInt()

    for (x in c until c+w) {
        for (y in r until r+h) {
            if (map[x][y] == 0) {
                map[x][y] = 1
            } else if (map[x][y] == 1) {
                map[x][y] = 2
                overlap++
            }
        }
    }
}

for (line in File("q03ainput.txt").readLines()) {
    var fail = false
    val cols = line.split(Regex("[#@,:x ]+"))
    val id = cols[1]
    val c = cols[2].toInt()
    val r = cols[3].toInt()
    val w = cols[4].toInt()
    val h = cols[5].toInt()

    for (x in c until c+w) {
        for (y in r until r+h) {
            if (map[x][y] == 2) {
                fail = true
            }
        }
    }

    if (!fail) {
        println(id)
    }
}

