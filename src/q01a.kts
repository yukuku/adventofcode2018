import java.io.File

var sum = 0
for (line in File("q01ainput.txt").readLines()) {
    sum += line.toInt()
}
println(sum)

