package com.example.kotlingames

fun main(){
    var numberInput: Int? = null

    while (true) {
        numberInput = null

        while (numberInput == null) {
            println("Ingresa un número: ")
            numberInput = readlnOrNull()?.toIntOrNull()

            if (numberInput == null) {
                println("Entrada no válida. Ingresa un número entero.")
            }
        }

        var primo = true

        if (numberInput < 2) {
            primo = false
        } else {
            for (i in 2..(numberInput - 1)) {
                if (numberInput % i == 0) {
                    primo = false
                    break
                }
            }
        }

        if (primo) {
            println("El número $numberInput es primo. ¡Programa finalizado!")
            break // Termina el programa si el número es primo
        } else {
            println("El número $numberInput no es primo. Intenta de nuevo.")
        }
    }
}

