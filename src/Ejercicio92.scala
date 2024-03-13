object Ejercicio92 extends App {
  println("Hola, ingrese un número: ")
  val num = scala.io.StdIn.readInt()

  if(Es_Primo(num)){
    println("El número " + num + " es primo")
  }
  else {
    println("El número " + num + " no es primo")
  }


  def Es_Primo(num: Int): Boolean = {
    var bandera = true
    if (num <= 1){
      bandera = false
    }
    else{
      var i = 2
      while(bandera && i <= num/2){
        if(num % i == 0){
          bandera = false
        }
        i = i + 1
      }
    }
    bandera
  }

  def NextPrime(num:Int): Int = {
    var i = num
    var encontrado = false
    while (!encontrado){
      if (Es_Primo(i + 1)){
        encontrado = true
      }
      i = i + 1
    }
    i
  }


  }

