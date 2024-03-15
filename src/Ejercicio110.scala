import Ejercicio109.divisores_propios

object Ejercicio110 {
  def main(args: Array[String]): Unit = {
    println("Ingresa un número: ")
    val numero1 = scala.io.StdIn.readInt()
    if(EsNumeroPerfecto(numero1)){
      println("El número " + numero1 + " es perfecto")
    }
    else{
      println("El número "+ numero1 + " no es perfecto")
    }
  }

  def EsNumeroPerfecto(num: Int): Boolean = {
    val lista_propios = divisores_propios(num)

    if( lista_propios.sum == num){
      true
    }
    else{
      false
    }
  }

}
