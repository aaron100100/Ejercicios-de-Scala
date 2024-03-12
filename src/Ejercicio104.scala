object Ejercicio104 extends App {

  val listaDeEnteros = leerEnteros()
  listaDeEnteros.foreach(element => println(element))
  println("---------")
  val listaOrdenada = listaDeEnteros.sorted
  listaOrdenada.foreach(element => println(element))


  def leerEnteros(): List[Int] = {
    println("Introduce enteros (introduce un valor no entero para terminar):")

    // Lista mutable para almacenar los enteros
    var enteros: List[Int] = List.empty[Int]

    // Bucle para leer enteros hasta que se introduce un valor no entero

    var num = 1
    while (num != 0 ){
      num = scala.io.StdIn.readInt()
      enteros = enteros :+ num

    }

    enteros.init // Devolver la lista de enteros sin el ultimo elemento
  }

}
