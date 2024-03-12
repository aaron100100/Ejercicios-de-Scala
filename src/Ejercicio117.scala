object Ejercicio117 extends App {
  println("¿Cuántos puntos desea ingresar?")
  val k = scala.io.StdIn.readInt()
  val valores = contruir_recta(k)
  println(valores._1)
  println(valores._2)
  println("La ecuación de la recta con los puntos proporcionados es: \n" +
    "y = " + valores._1 + "x + " + valores._2)

  def contruir_recta(n:Int): (Double,Double) = {
    var suma_x = 0.0
    var suma_y = 0.0
    var suma_x_cuadrada = 0.0
    var suma_x_y = 0.0
    var i = 0
    for(i <- 1 to n){
      println("Ingresa la coordena x del punto " + i  + ": ")
      var x = scala.io.StdIn.readDouble()

      println("Ingresa la coordena y del punto " + i  + ": ")
      var y = scala.io.StdIn.readDouble()

      suma_x = suma_x + x
      suma_y = suma_y + y
      suma_x_cuadrada = suma_x_cuadrada + x*x
      suma_x_y = suma_x_y + x*y
    }

    val m = (suma_x_y - (suma_x*suma_y)/n )/( suma_x_cuadrada - (suma_x*suma_x)/n)
    val b = suma_y/n - m*(suma_x/n)
    val elementos: (Double, Double) = (m,b)
    elementos
  }




}
