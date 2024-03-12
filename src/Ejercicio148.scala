object Ejercicio148 {
  def main(args: Array[String]): Unit = {
    println("Ingrese números para sumar. Deje la línea en blanco para terminar.")

    var suma: Double = 0.0
    var entrada = scala.io.StdIn.readLine()

    while (entrada != "") {
      try {
        val numero = entrada.toDouble
        suma += numero
        println(s"Suma parcial: $suma")
      } catch {
        case _: NumberFormatException => println("Entrada no válida. Por favor, ingrese un número válido.")
      }

      entrada = scala.io.StdIn.readLine()
    }

    println(s"La suma total es: $suma")
  }

}
