fun main() {
    val arreglo = IntArray(readLine()!!.toInt())
    var con = 0

    for (i in 0..arreglo.lastIndex) {
        arreglo[i] = readLine()!!.toInt()
    }

    for (num in 0..arreglo.lastIndex - 2) {
        if (arreglo[num] + 1 == arreglo[num + 1] && arreglo[num] + 2 == arreglo[num + 2]) {
            con++
        }
    }

    print(con)
}