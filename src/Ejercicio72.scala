object Ejercicio72 extends App {
  val cadena_test1 = "civic"
  val cadena_test2 = "hannah"
  val cadena_test3 = "popo"
  val cadena_test4 = "Ola"
  val cadena_test5 = "tigres"

  if( Es_palindromo(cadena_test1)){
    println("La palabra " + cadena_test1 +" es palindromo ")
  }
  else{
    println("La palabra " + cadena_test1 +" no es palindromo ")
  }

  if( Es_palindromo(cadena_test2)){
    println("La palabra " + cadena_test2 +" es palindromo ")
  }
  else{
    println("La palabra " + cadena_test2 +" no es palindromo ")
  }

  if( Es_palindromo(cadena_test3)){
    println("La palabra " + cadena_test3 +" es palindromo ")
  }
  else{
    println("La palabra " + cadena_test3 +" no es palindromo ")
  }

  if( Es_palindromo(cadena_test4)){
    println("La palabra " + cadena_test4 +" es palindromo ")
  }
  else{
    println("La palabra " + cadena_test4 +" no es palindromo ")
  }

  if( Es_palindromo(cadena_test5)){
    println("La palabra " + cadena_test5 +" es palindromo ")
  }
  else{
    println("La palabra " + cadena_test5 +" no es palindromo ")
  }
  //Creamos una función
  def Es_palindromo(cadena :  String): Boolean = {
    var bandera = true
    var i = 0 // variable iteradora
    //Caso para cadena de longitud par
    if (cadena.length % 2 == 0){
      while(bandera && i < cadena.length / 2){
        if( cadena.charAt(i) != cadena.charAt((cadena.length - i) - 1)){
          bandera = false
        }
        i = i + 1
      }
    }
    //Caso para cadenas de longitud impar
    else{
      while(bandera && i < (cadena.length - 1 ) / 2){
        if( cadena.charAt(i) != cadena.charAt((cadena.length - i) - 1)){
          bandera = false
        }
        i = i + 1
      }
    }
    bandera
  }


}
