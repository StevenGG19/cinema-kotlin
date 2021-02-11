fun main() {
    val firstH = readLine()!!.toInt()
    val firstM = readLine()!!.toInt()
    val firstS = readLine()!!.toInt()

    val secondH = readLine()!!.toInt()
    val secondM = readLine()!!.toInt()
    val secondS = readLine()!!.toInt()

    println(seconds(secondH, secondM, secondS) - seconds(firstH, firstM, firstS))
}

fun seconds(hour: Int, minute: Int, seconds: Int): Int {
    return hour * 3_600 + minute * 60 + seconds
}