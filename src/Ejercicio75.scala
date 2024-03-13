object Ejercicio75 {
  def main(args: Array[String]): Unit = {
    println("Programa que obtiene el mayor de los divisores comunes de dos enteros positivos\t" +
      "n y m ")
    println("Ingresa el primer entero positivo: ")
    val n = scala.io.StdIn.readInt()

    println("Ingresa el segundo entero positivo: ")
    val m = scala.io.StdIn.readInt()

    var d = smaller(n,m)
    //println(d)

    while (d % m == 0 && d % n == 0 ){
      d = d - 1
    }
    println(d)
    println("El máximo común divisor de " + m  + " y " + n + " es:" + d)


  }

  def smaller(num1: Int, num2:Int): Int = {
    var retorno = 0
    if (num1 < num2){
      retorno = num1
    }
    else if( num2 < num1){
      retorno = num2
    }
    else{
      retorno = num1
    }
    retorno
  }

}
