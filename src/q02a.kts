import java.io.File

fun hasCount(s: String, count: Int): Boolean {
    return s.groupBy { it }.any { (_, v) -> v.size == count }
}

var has2_count = 0
var has3_count = 0
for (line in File("q02ainput.txt").readLines()) {
    if (hasCount(line, 2)) has2_count++
    if (hasCount(line, 3)) has3_count++
}
println(has2_count * has3_count)
