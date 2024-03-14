object Ejercicio49 extends App {

  println("Ingresa la magnitud del temblor: ")
  val magnitud = scala.io.StdIn.readDouble()

  if(magnitud < 2.0){
    println("El sismo tiene magnitud " + magnitud + " y es considerado de categoría Microtemblor")
  }
  else if ( magnitud >= 2.0 && magnitud < 3.0){
    println("El sismo tiene magnitud " + magnitud + " y es considerado de categoría muy menor")
  }
  else if ( magnitud >= 3.0 && magnitud < 4.0){
    println("El sismo tiene magnitud " + magnitud + " y es considerado de categoríA menor")
  }
  else if ( magnitud >= 4.0 && magnitud < 5.0){
    println("El sismo tiene magnitud " + magnitud + " y es considerado de categoría ligero")
  }
  else if ( magnitud >= 5.0 && magnitud < 6.0){
    println("El sismo tiene magnitud " + magnitud + " y es considerado de categoría moderado")
  }
  else if ( magnitud >= 6.0 && magnitud < 7.0){
    println("El sismo tiene magnitud " + magnitud + " y es considerado de categoría fuerte")
  }
  else if ( magnitud >= 7.0 && magnitud < 8.0){
    println("El sismo tiene magnitud " + magnitud + " y es considerado de categoría Importante")
  }
  else if ( magnitud >= 8.0 && magnitud < 10.0){
    println("El sismo tiene magnitud " + magnitud + " y es considerado de categoría gran")
  }
  else{
    println("El sismo tiene magnitud " + magnitud + " y es considerado de categoría meteórico")
  }



}
