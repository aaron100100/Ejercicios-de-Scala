
/*
Exercise 71:Square Root
 Write a program that implements Newton’s method to compute and display the square
 root of a number entered by the user. The algorithm for Newton’s method follows:
 */

import scala.math.abs
import scala.math.pow
object Ejercicio71 {
  def main(args: Array[String]): Unit = {
    println("Ingresa un número x: ")
    val x = scala.io.StdIn.readDouble()
    var guess = x/2

    while(abs(guess*guess - x) > pow(10, -12)){
      guess = (guess + x/guess)/2
    }

    print("La aproximación de la rapiz cuadrada de " + x + " es: " +guess)


  }

}
