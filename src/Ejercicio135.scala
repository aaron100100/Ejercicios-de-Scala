object Ejercicio135{

  def main(args: Array[String]): Unit = {
    println("Ingresa la primer cadena:")
    val str1 = scala.io.StdIn.readLine().toLowerCase()

    println("Ingresa la segunda cadena:")
    val str2 = scala.io.StdIn.readLine().toLowerCase()

    if (areAnagrams(str1, str2)) {
      println("Las cadenas son anagramas.")
    } else {
      println("Las cadenas no son anagramas.")
    }
  }
  def areAnagrams(str1: String, str2: String): Boolean = {
    if (str1.length != str2.length) {
      false
    }
    else{
      val sortedStr1 = str1.sorted
      val sortedStr2 = str2.sorted
      sortedStr1 == sortedStr2
    }
  }


}
