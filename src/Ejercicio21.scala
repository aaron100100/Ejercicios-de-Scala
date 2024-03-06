
object Ejercicio21 {
  def main(args: Array[String]): Unit = {
    println("Ingresa la altura del triangulo: ")
    var altura = scala.io.StdIn.readFloat()
    println("Ingresa la base del triangulo: ")
    var base = scala.io.StdIn.readFloat()
    println("El área deltriangulo es " + area_triangulo(base,altura))


  }
  def area_triangulo(b: Float, h: Float): Float = {
    var area = 0.0f
    area = (b * h)/2
    area
  }

}
