import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var max = Int.MIN_VALUE
    var con = 0
    var conEncontro = 0

    while (scanner.hasNext()) {
        val num = scanner.nextInt()
        con++
        if (num > max) {
            max = num
            conEncontro = con
        }
    }
    print("$max $conEncontro")
}