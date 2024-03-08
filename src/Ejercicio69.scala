import scala.math.BigDecimal
object Ejercicio69 extends App {

  println("Aproximación del número Pi")
  var aproximacion = BigDecimal(3.0)
  var i = 0

  for( i <- 1  to 40 by 1){
      aproximacion = aproximacion + math.pow(-1,i + 1)*(BigDecimal(4)/(BigDecimal(2*i)*BigDecimal(2*i+1)*BigDecimal(2*i + 2)))
      println("Aproximación " + i + ": " + aproximacion)
  }








}
