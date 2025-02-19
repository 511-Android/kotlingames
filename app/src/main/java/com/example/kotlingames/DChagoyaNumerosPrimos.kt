package com.example.kotlingames

fun main(){
    var numberInput: Int? = null

    while (true) {
        numberInput = null

        while (numberInput == null) {
            println("Ingresa un numero: ")
            numberInput = readlnOrNull()?.toIntOrNull()

            if (numberInput == null) {
                println("Entrada no valida. Ingresa un numero.")
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
            println("El numero $numberInput es primo.")
            break
        } else {
            println("El numero $numberInput no es primo. Intenta de nuevo.")
        }
    }
}

