/*
Programa que lee un entero positivo n ingresado por el usuario
y muestra la suma de todos los enteros desde 1 hasta n
//Para hacerlo nos guiamos de la ecuación del libro
Se implementó en función que recibe como parametro a n y regresa la suma de todos los enteros anteriores positivos hasta
llegar a n
 */
object Ejercicio7 {
  def main(args: Array[String]): Unit = {
    // Se ingresa un número entero
    println("Ingresa un número: ")
    //se lee la entrada del usuario
    val n = scala.io.StdIn.readInt()
    //se muestra el resultado concatenando la llamada de la función
    println("La suma de todos los enteros desde 1 hasta " + n + " es: " + suma_hasta_n(n))

  }

  //Declaración de la función
  def suma_hasta_n(n: Int): Int = {
    var suma = 1
    suma = (n * (n + 1)) / 2
    suma
  }

}
