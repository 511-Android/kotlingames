package com.example.kotlingames

//adivina un numero
//se debe seleccionar un numero dentro de un rango
// la computadora debe ser cacpaz de seleccionar ese numero
//el programa debe solicitar al usuario ingresar la suposisio
//debe asegurarse recibir numeros validos
//el juego termina cundo el jugador acierta el numero

fun main(){
    val range = 1..10
    val numberToGess = range.random()
    var attemps = 0

    println("Bienveniso al juego Adicin el numero")
    println("Estoy pensando en un numero entre 1 y 10, Adivina")




    do{

        println("Ingresa una suposicion")
        var guess = readlnOrNull()?.toIntOrNull()
        if(guess != null){
            //el numero que me pasaron es valido
            if (guess != null) {
                attemps++
                when{
                    guess < numberToGess -> println("el numero es mayor")
                    guess > numberToGess -> println("El numero es menor")
                    else -> println("felicidades le atinaste, lo adivinaste en $attemps intentos")
                }
            }
            }else{
            //no es numero
            println("Ingresa un numero valido")
        }

    }
    while(guess != numberToGess)

}