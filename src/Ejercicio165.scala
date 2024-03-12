object Ejercicio165 {
  def main(args: Array[String]): Unit = {
    println("Ingrese dos números para encontrar su máximo común divisor:")
    val a = scala.io.StdIn.readInt()
    val b = scala.io.StdIn.readInt()

    val mcd = calcularMCD(a, b)
    println(s"El máximo común divisor de $a y $b es: $mcd")
  }

  def calcularMCD(a: Int, b: Int): Int = {
    if (b == 0)
      a
    else {
      val c = a % b
      calcularMCD(b, c)
    }
  }

}
