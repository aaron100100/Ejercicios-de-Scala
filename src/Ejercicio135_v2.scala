object Ejercicio135_v2 {
  def main(args: Array[String]): Unit = {
    println("Ingresa la primer cadena: ")
    val s1 = scala.io.StdIn.readLine()
    println("Ingresa la segunda cadena: ")
    val s2 = scala.io.StdIn.readLine()

    if( conteoCaracteres_2(s1) == conteoCaracteres_2(s2)){
      println("Las cadenas son anagramas")
    }
    else{
      println("Las cadenas no son anagramas")
    }
  }
  def conteoCaracteres_2(cadena: String): Map[Char, Int] = {
    var counts = Map[Char, Int]()

    // Inicializar el mapa con todas las letras en 0
    for (i <- 0 until cadena.length) {
      val char = cadena(i)
      counts += (char -> 0)
    }

    // Contar la cantidad de cada letra
    for (i <- 0 until cadena.length) {
      val char = cadena(i)
      counts += (char -> (counts(char) + 1))
    }
    counts
  }
  //Función que usa métodos que no entendí mucho
  def conteoCaracteres_1(cadena: String): Map[Char, Int] = {
    cadena.groupBy(identity).mapValues(_.length)
  }


}
