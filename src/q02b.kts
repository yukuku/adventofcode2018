import java.io.File

fun similar(a: String, b: String) = a.zip(b).count { (x, y) -> x != y } == 1

val lines = File("q02ainput.txt").readLines()
for (i in 0 until lines.size) {
    for (j in i + 1 until lines.size) {
        if (similar(lines[i], lines[j])) {
            println(lines[i].zip(lines[j]).filter { (x, y) -> x == y }.map { (x, _) -> x }.joinToString(""))
        }
    }
}
