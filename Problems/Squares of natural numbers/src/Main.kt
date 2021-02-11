fun main() {
    val num = readLine()!!.toInt()
    var con = 1

    while (con * con <= num) {
        println(con * con)
        con++
    }
}