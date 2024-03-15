object Ejercicio88 {
  def main(args: Array[String]): Unit = {
    println("Este Programa te dirá si puedes construir un triángulo o no a partir de los lados que ingrese el usuario")

    println("Ingresa el primer lado: ")
    val lado1 = scala.io.StdIn.readDouble()

    println("Ingresa el segundo lado: ")
    val lado2 = scala.io.StdIn.readDouble()

    println("Ingresa el tercer lado: ")
    val lado3 = scala.io.StdIn.readDouble()

    if(EsTriangulo(lado1,lado2,lado3)){
      println("El triángulo con las medidas ingresadas SI PUEDE SER CONSTRUIDO")
    }
    else{
      println("El triángulo con las medidad ingresadas NO PUEDE SER CONSTRUIDO")
    }

  }
  def EsTriangulo(a: Double, b: Double, c:Double): Boolean = {
    if( ( a < b + c ) && ( b < a + c ) && ( c < a + b ) ){
      true
    }
    else{
      false
    }
  }


}
