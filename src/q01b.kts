import java.io.File

var sum = 0
val seen = mutableSetOf<Int>()
out@ while (true) {
    for (line in File("q01ainput.txt").readLines()) {
        sum += line.toInt()
        if (sum in seen) {
            println(sum)
            break@out
        }
        seen.add(sum)
    }
}


