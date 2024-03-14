import scala.math.sqrt
object Ejercicio50 extends App {
  println("Este programa obtiene las raices de una función cuadrática")
  println("ax^2 + bx + c = 0")
  println("Ingresa el valor de a: ")
  val a = scala.io.StdIn.readDouble()

  println("Ingresa el valor de b: ")
  val b = scala.io.StdIn.readDouble()

  println("Ingresa el valor de c: ")
  val c = scala.io.StdIn.readDouble()
  println("La función cuadrática ingresada es: " + a + "x^2 + "  + b  + "x + " + c)

  var  discriminante = b*b - 4*a*c
  if( a == 0){
    println("La función es lineal")
  }
  else{
    if( discriminante == 0){
      val raiz = -b/(2*a)
      println("La función cuadrática tiene solo una raíz y es: " + raiz)
    }
    else if( discriminante > 0){
      val raiz_1 = -(b + sqrt(b*b - 4*a*c))/(2*a)
      val raiz_2 = -(b - sqrt(b*b - 4*a*c))/(2*a)
      println("La función cuadrática tiene dos raices que son : " + raiz_1 + " y " + raiz_2)
    }
    else{
      println("La función cuadratica no tiene raices reales por que su discriminante es negativo")
    }
  }




}
