package cinema

var ticket = 0
var currentIncome = 0

fun main(args: Array<String>) {
    println("Enter the number of rows:")
    val rows = readLine()!!.toInt()
    println("Enter the number of seats in each row:")
    val seats = readLine()!!.toInt()

    var arreglo = Array(rows + 1) { CharArray(seats) { 'S' } }

    do {
        println("1. Show the seats")
        println("2. Buy a ticket")
        println("3. Statistics")
        println("0. Exit")
        val num = readLine()!!.toInt()
        when (num) {
            1 -> printRoom(arreglo)
            2 -> arreglo = price(rows, seats, arreglo)
            3 -> statistics(rows, seats)
        }
    } while (num != 0)
}

fun statistics(rows: Int, seats: Int) {
    val calculo = (100.0 / (rows * seats)) * ticket
    val totalIncome = if (seats * rows <= 60) rows * seats * 10 else {
        ((rows / 2) * seats) * 10 + ((rows - (rows / 2)) * seats) * 8
    }

    println("Number of purchased tickets : $ticket")
    println(println("Percentage: ${String.format("%.2f", calculo)}%"))
    println("Current income : $$currentIncome")
    println("Total income : $$totalIncome")
}

fun price(rows: Int, seats: Int, arreglo: Array<CharArray>): Array<CharArray> {
    var available = true
    while (available) {
        println("Enter a row number:")
        val rowNumber = readLine()!!.toInt()
        println("Enter a seat number in that row:")
        val seatNumber = readLine()!!.toInt()

        if (rowNumber > rows || seatNumber > seats) {
            println("Wrong input!")
        } else if (arreglo[rowNumber][seatNumber - 1] != 'B') {
            if (rows * seats <= 60) {
                println("Ticket price: $10")
                currentIncome += 10
            } else {
                println(
                    if (rowNumber in 1..rows / 2) {
                        currentIncome += 10
                        "Ticket price: $10"
                    } else {
                        currentIncome += 8
                        "Ticket price: $8"
                    }
                )
            }
            ticket++
            arreglo[rowNumber][seatNumber - 1] = 'B'
            available = false
        } else {
            println("That ticket has already been purchased!")
        }
    }
    return arreglo
}

fun printRoom(arreglo: Array<CharArray>) {
    println("Cinema:")
    for (i in 0..arreglo.lastIndex) {
        print(if (i != 0) " $i" else "  ")
        for (j in arreglo[i].indices) {
            print(if (i != 0) " ${arreglo[i][j]}" else " ${j + 1}")
        }
        println()
    }
}