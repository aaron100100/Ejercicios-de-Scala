object Ejercicio34 extends App{
  print("Ingresa un número entero : ")
  val n = scala.io.StdIn.readInt()
  print("El número que ingresaste " + Even_or_Odd(n))


  def Even_or_Odd(num:Int): String = {
    if(num % 2 == 0) {
      "Es par"
    }
    else{
      "Es impar"
    }

  }

}
