fun main() {
    val n = readLine()!!.toInt()
    val arreglo = IntArray(n)

    for (i in 0 until n) {
        arreglo[i] = readLine()!!.toInt()
    }

    val m = readLine()!!.toInt()

    print(if (m in arreglo) "YES" else "NO")
}