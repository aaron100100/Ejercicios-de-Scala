object Ejercicio75 {
  def main(args: Array[String]): Unit = {
    println("Programa que obtiene el mayor de los divisores comunes de dos enteros positivos\t" +
      "n y m ")
    println("Ingresa el primer entero positivo: ")
    val n = scala.io.StdIn.readInt()

    println("Ingresa el segundo entero positivo: ")
    val m = scala.io.StdIn.readInt()

    var d = scala.math.min(n,m)
    //println(d)

    while (m % d != 0 || n % d != 0 ){
      d = d - 1
      //println(d)
    }
    //println(d)
    println("El máximo común divisor de " + m  + " y " + n + " es:" + d)


  }


}
