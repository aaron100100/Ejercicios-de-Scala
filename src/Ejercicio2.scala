/*
Programa que solicita al usuario su nombre y te regresa por pantalla
un saludo
 */

object Ejercicio2 extends App {
  println("Ingrese su nombre:")
  val nombre = scala.io.StdIn.readLine()
  println("Hola " + nombre + " mucho gusto!")

}
