object Ejercicio135{

  def main(args: Array[String]): Unit = {
    println("Enter the first string:")
    val str1 = scala.io.StdIn.readLine().toLowerCase()

    println("Enter the second string:")
    val str2 = scala.io.StdIn.readLine().toLowerCase()

    if (areAnagrams(str1, str2)) {
      println("The strings are anagrams.")
    } else {
      println("The strings are not anagrams.")
    }
  }

  def areAnagrams(str1: String, str2: String): Boolean = {
    if (str1.length != str2.length) {
      false
    } else {
      val sortedStr1 = str1.sorted
      val sortedStr2 = str2.sorted
      sortedStr1 == sortedStr2
    }
  }


}
