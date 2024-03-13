object Ejercicio10 extends   App {
  println("Ingresa un entero: ")
  val a = scala.io.StdIn.readInt()
  println("Ingresa otro entero: ")
  val b = scala.io.StdIn.readInt()

  println("La suma de " + a  + " y " + b + " es: " + (a + b))
  println("La resta de " + a  + " y " + b + " es: " + (a - b))
  println("El producto de " + a  + " y " + b + " es: " + (a * b))
  println("El cociente de " + a  + " y " + b + " es: " + (a / b))
  println("El residuo de " + a  + " y " + b + " es: " + (a % b))
  println("El Logaritmo de " + a  + " es: " + (math.log10(a)))
  println("La potencia de " + a  + " a la  " + b + " es: " + (math.pow(a,b)))

}
