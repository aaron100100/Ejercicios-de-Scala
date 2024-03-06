object Ejercicio31 extends App {
  println("Ingresa un entero de 4 dígitos: ")
  var num : Integer = scala.io.StdIn.readInt()
  if (num >= 1000 && num <= 9999) {

    val digito1 = num / 1000
    //println(digito1)

    val digito2 = (num % 1000) / 100
    //println(digito2)

    val digito3 = (num % 100) / 10
    //println(digito3)

    val digito4 = (num % 10) / 1
    //println(digito4)

    val suma = digito1 + digito2 + digito3 + digito4
    print("La suma de los 4 digitos del entero ingresado es: " + suma)
  }
  else {
    print("Ingresaste un número que no contiene 4 dígitos")
  }
}
