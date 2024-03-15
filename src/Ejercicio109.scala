object Ejercicio109 {
  def main(args: Array[String]): Unit = {
    println("Ingrese un número:")
    val num = scala.io.StdIn.readInt()
    val divisores = divisores_propios(num)
    println(s"Los divisores propios de $num son: $divisores")

  }

  //Creamos la función que va a regresar a los divisores propios de un número ingresado por el usuario
  def divisores_propios(num:Int): List[Int]={
    var divisores_propios : List[Int] = List.empty[Int]

    for(i <-1 until num){
      if ( num % i == 0 ){
        divisores_propios = divisores_propios :+ i
      }
    }
    divisores_propios
  }

}
