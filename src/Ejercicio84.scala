object Ejercicio84 extends App{

  println("Ingresa un número: ")
  val num1 = scala.io.StdIn.readInt()

  println("Ingresa otro número: ")
  val num2 = scala.io.StdIn.readInt()

  println("Ingresa un último número: ")
  val num3 = scala.io.StdIn.readInt()

  val numeros: Array[Int] = Array(num1, num2, num3)

  numeros.foreach(element => print(element + " \t"))
  bubbleSort(numeros)
  println("------------------")
  numeros.foreach(element => print(element + " \t"))
  println("------------------")

  println("La mediana de los números ingresados es: "  + mediana(numeros))


  // Algortimo de Ordenamiento

  def bubbleSort(array: Array[Int]): Array[Int] = {
    var didSwap = false

    for(i <- 0 until array.length - 1)
      if(array(i+1) < array(i)){
        val temp = array(i)
        array(i) = array(i+1)
        array(i+1) = temp
        didSwap = true
      }

    // Repeat until we don't have anymore swaps
    if(didSwap)
      bubbleSort(array)
    else
      array
  }

  def mediana(array: Array[Int]): Int = {
    var num = array(1)
    num
  }










}
