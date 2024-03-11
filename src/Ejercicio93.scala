import Ejercicio92.NextPrime

object Ejercicio93 extends App {
  println("Ingresa un número entero: ")
  val num = scala.io.StdIn.readInt()

  println("El número primo mayor al número que ingresaste es: " + NextPrime(num))

}
