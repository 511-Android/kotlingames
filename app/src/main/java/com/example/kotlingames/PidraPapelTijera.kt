package com.example.kotlingames

/*
El programa solicita al jugador que ingrese un numero a su eleccion
1. piedra
2.papel
3. tijeras

E programa mostraraa la eleccion de la computadora

Las reglas
Piedra vence tijera
Tijera vence papel
Papel vence Piedra

se debe determinar al ganador del juego

el programa debe manejar entrada invalidas o numeros fuera del rango especificado

* */

fun main(){
    println("ingresa un valor del 1 al 3 (\n 1.Piedra \n 2.Tijera \n 3.Papel)")
    var choiceInput = readlnOrNull()?.toIntOrNull()
    var isValidInput = choiceInput != null && choiceInput in 1..3
  //  if(choiceInput != null && choiceInput in 1..3){
  //      isValidInput = true
   // }
    while (!isValidInput){
        println("Entrada no valida.Ingresa los numeros 1,2,3")
        choiceInput = readlnOrNull()?.toIntOrNull()
        isValidInput = choiceInput != null && choiceInput in 1..3
    }
    println("Juego se ejecuto")
    val computerChoice = (1..3).random()
    val computerChoiceString = when{
        computerChoice == 1 -> "Piedra"
        computerChoice == 2 -> "Tijera"
        computerChoice == 3 -> "Papel"
        else -> "Sin eleccion"
    }

    println("la computadora eligio $computerChoiceString")
    val winner = when{
        choiceInput == computerChoice -> "Empate"
        choiceInput == 1 && computerChoice == 2 -> "El jugador"
        choiceInput == 2 && computerChoice == 3 -> "El jugador"
        choiceInput == 3 && computerChoice == 1 -> "El jugador"
        else -> "la computadora"

    }
    println("El ganador es $winner")
}