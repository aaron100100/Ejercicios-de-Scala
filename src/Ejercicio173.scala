object Ejercicio173 {
  def main(args: Array[String]): Unit = {
    val encodedList = List("A", 12, "B", 4, "A", 6, "B", 1)
    println("Lista codificada por longitud de ejecución: " + encodedList)

    val decodedList = decode(encodedList)
    println("Lista decodificada: " + decodedList)
  }

  def decode(encodedList: List[Any]): List[String] = {
    encodedList match {
      case Nil => Nil
      case (value: String) :: (count: Int) :: tail =>
        List.fill(count)(value) ::: decode(tail)
      case _ => throw new IllegalArgumentException("Lista codificada no válida")
    }
  }

}
