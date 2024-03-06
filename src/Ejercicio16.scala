import scala.math.{Pi}

object Ejercicio16 {
  def main(args: Array[String]): Unit = {
    println("Ingresa el radio de un círculo: ")
    var radio = scala.io.StdIn.readFloat()

    println("El área del círculo es : " + area_circle(radio))
    println("El volumen de la esfera es : " + volume_circle(radio))


  }

  def area_circle(r: Float): Double = {
    var area = 0.0
    area = Pi * (r * r)
    area
  }
  def volume_circle(r: Float): Double = {
    var volume = 0.0
    volume = (Pi * (r * r * r)) * (4/3)
    volume
  }

}
