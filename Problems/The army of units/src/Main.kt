fun main() {
    val num = readLine()!!.toInt()
    print(
        when {
            num < 1 -> "no army"
            num in 1..4 -> "few"
            num in 5..9 -> "several"
            num in 10..19 -> "pack"
            num in 20..49 -> "lots"
            num in 50..99 -> "horde"
            num in 100..249 -> "throng"
            num in 250..499 -> "swarm"
            num in 500..999 -> "zounds"
            else -> "legion"
        }
    )
}