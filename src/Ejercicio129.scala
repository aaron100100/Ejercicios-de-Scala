import scala.util.Random

object Ejercicio129 extends App {
  var contador_2 = 0
  var contador_3 = 0
  var contador_4 = 0
  var contador_5 = 0
  var contador_6 = 0
  var contador_7 = 0
  var contador_8 = 0
  var contador_9 = 0
  var contador_10 = 0
  var contador_11 = 0
  var contador_12 = 0

  for(i <- 1 to 1000){
    var total_generado = lanzarDados()
    if( total_generado == 2){
      contador_2 += 1
    }
    else if(total_generado == 3){
      contador_3 += 1
    }
    else if(total_generado == 4){
      contador_4 += 1
    }
    else if(total_generado == 5){
      contador_5 += 1
    }
    else if(total_generado == 6){
      contador_6 += 1
    }
    else if(total_generado == 7){
      contador_7 += 1
    }
    else if(total_generado == 8){
      contador_8 += 1
    }
    else if(total_generado == 9){
      contador_9 += 1
    }
    else if(total_generado == 10){
      contador_10 += 1
    }
    else if(total_generado == 11){
      contador_11 += 1
    }
    else if(total_generado == 12){
      contador_12 += 1
    }
  }
  val listaContadores = List(contador_2,contador_3, contador_4, contador_5, contador_6,
    contador_7, contador_8, contador_9, contador_10, contador_11, contador_12)

  //Diccionario de probabilidades conocidas
  var expected = Map[Int,BigDecimal]()
  expected += (0 -> BigDecimal(1)/BigDecimal(36))
  expected += (1 -> BigDecimal(2)/BigDecimal(36))
  expected += (2 -> BigDecimal(3)/BigDecimal(36))
  expected += (3 -> BigDecimal(4)/BigDecimal(36))
  expected += (4 -> BigDecimal(5)/BigDecimal(36))
  expected += (5 -> BigDecimal(6)/BigDecimal(36))
  expected += (6 -> BigDecimal(5)/BigDecimal(36))
  expected += (7 -> BigDecimal(4)/BigDecimal(36))
  expected += (8 -> BigDecimal(3)/BigDecimal(36))
  expected += (9 -> BigDecimal(2)/BigDecimal(36))
  expected += (10 -> BigDecimal(1)/BigDecimal(36))


  print("Total\tSimulated Percent\tExpected Percent\n")
  for(i <- 0 to 10){
    println((i + 2)+ "\t\t\t" + (BigDecimal(listaContadores(i))/BigDecimal(1000))*BigDecimal(100) + "\t\t\t"
      + expected(i)*100)
  }
  def lanzarDados(): Int = {
    val random = new Random()
    val num1 = random.nextInt(6) + 1
    val num2 = random.nextInt(6) + 1
    num1 + num2
  }

}
