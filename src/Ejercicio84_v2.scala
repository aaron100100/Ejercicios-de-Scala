object Ejercicio84_v2 {
  def main(args: Array[String]): Unit = {
    println("Ingresa un número: ")
    val num1 = scala.io.StdIn.readDouble()

    println("Ingresa otro número: ")
    val num2 = scala.io.StdIn.readDouble()

    println("Ingresa un último número: ")
    val num3 = scala.io.StdIn.readDouble()

    println("La mediana de los números ingresados es: " + median(num1,num2, num3))

  }
  def median(a: Double, b: Double, c : Double): Double = {
    if ( (a < b  &&   b < c ) || ( a > b && b > c)){
      b
    }
    else if ( (b < a  &&   a < c ) || ( b > a && a > c) ){
      a
    }
    else{
      c
    }
  }

}
