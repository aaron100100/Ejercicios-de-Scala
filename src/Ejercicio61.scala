/* In this exercise you will create a program that computes the average of a collection
 of values entered by the user. The user will enter 0 as a sentinel value to indicate
 that no further values will be provided. Your program should display an appropriate
 error message if the first value entered by the user is 0. */

object Ejercicio61 extends App {
  //Declaración de variables
  var suma = 0.0
  var bandera = true
  var contador = 0
  var num = 0.0
  //Comeinza el ciclo While
  while (bandera){
    println("Ingresa un número: ")
    num = scala.io.StdIn.readDouble()
    if (num == 0){
      bandera = false
    }
    else{
      suma = suma + num
      contador = contador + 1

    }

}
  var promedio = suma /contador
  println("El promedio de los valores ingresados por el usuario es: " + promedio)

}
