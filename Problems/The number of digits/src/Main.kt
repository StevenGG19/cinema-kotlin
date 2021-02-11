fun main() {
    val num = readLine()!!

    when {
        num.length == 1 -> print(1)
        num.length == 2 -> print(2)
        num.length == 3 -> print(3)
        num.length == 4 -> print(4)
    }
}