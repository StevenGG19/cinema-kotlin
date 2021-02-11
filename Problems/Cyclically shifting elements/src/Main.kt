import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val cantidad = scanner.nextInt()
    val arreglo = IntArray(cantidad) { scanner.nextInt() }
    val arreglo2 = IntArray(cantidad)

    arreglo2[0] = arreglo.last()
    for (i in 1 until cantidad) {
        arreglo2[i] = arreglo[i - 1]
    }

    print(arreglo2.joinToString(" "))
}