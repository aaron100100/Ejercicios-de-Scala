import scala.math.BigDecimal
object Ejercicio69 extends App {

  println("Aproximación del número Pi")
  println("¿Cuántas aproximaciones desea hacer?")
  val iteraciones = scala.io.StdIn.readInt()
  println("Las aproximaciones son: ")
  aproximacion_pi(iteraciones)

  def aproximacion_pi(k:Int): Unit= {
    var aproximacion = BigDecimal(3.0)
    for (i <- 1 to k by 1) {
      aproximacion = aproximacion + math.pow(-1, i + 1) * (BigDecimal(4) / (BigDecimal(2 * i) * BigDecimal(2 * i + 1) * BigDecimal(2 * i + 2)))
      println("Aproximación " + i + ": " + aproximacion)
    }

  }








}
