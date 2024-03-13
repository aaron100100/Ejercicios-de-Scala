object Ejercicio76 {
  def main(args: Array[String]): Unit = {
    println("Ingresa un entero(2 o mayor): ")
    val num = scala.io.StdIn.readInt()
    if (num < 2){
      println("Ingresaste un número incorrecto")
    }
    else{
      println("Los factores primos de " + num + " son:")
      factorizacion_primos(num)
    }

  }

  def factorizacion_primos(num:Int): Unit = {
    var factor = 2
    var n = num
    while(factor <= n){
      if( n % factor == 0){
        println(factor)
        n = n / factor
      }
      else{
        factor = factor + 1
      }
    }
  }

}
