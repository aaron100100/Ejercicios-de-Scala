object Ejercicio54 extends App {
  println("Ingresa la longitud de onda: ")
  var longitud_de_onda = scala.io.StdIn.readDouble()

  if (longitud_de_onda >= 380 && longitud_de_onda < 450){
    println("El color de la longitud de onda es Violeta")
  }
  else if (longitud_de_onda >= 450 && longitud_de_onda < 495){
    println("El color de la longitud de onda es Azul")
  }
  else if (longitud_de_onda >= 495 && longitud_de_onda < 570){
    println("El color de la longitud de onda es verde")
  }
  else if (longitud_de_onda >= 570 && longitud_de_onda < 590){
    println("El color de la longitud de onda es Amarillo")
  }
  else if (longitud_de_onda >= 590 && longitud_de_onda < 620){
    println("El color de la longitud de onda es naranja")
  }
  else if (longitud_de_onda >= 620 && longitud_de_onda <= 750){
    println("El color de la longitud de onda es Roja")
  }
  else{
    print("la longitud de onda ingresada por el usuario está fuera del espectro visible")
  }

}
