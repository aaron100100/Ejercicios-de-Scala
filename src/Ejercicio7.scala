object Ejercicio7 {
  def main(args: Array[String]): Unit = {
    print(suma_hasta_n(4))

  }
  def suma_hasta_n(n : Int): Float = {
    var suma = 0
    suma = ( n*(n + 1)) / 2
    suma
  }

}
