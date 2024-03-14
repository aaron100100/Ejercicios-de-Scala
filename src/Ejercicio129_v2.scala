import scala.util.Random
object Ejercicio129_v2  {
  def main(args: Array[String]): Unit = {
    //Diccionario de probabilidades
    var expected = Map[Int, BigDecimal]()
    expected += (2 -> BigDecimal(1) / BigDecimal(36))
    expected += (3 -> BigDecimal(2) / BigDecimal(36))
    expected += (4 -> BigDecimal(3) / BigDecimal(36))
    expected += (5 -> BigDecimal(4) / BigDecimal(36))
    expected += (6 -> BigDecimal(5) / BigDecimal(36))
    expected += (7 -> BigDecimal(6) / BigDecimal(36))
    expected += (8 -> BigDecimal(5) / BigDecimal(36))
    expected += (9 -> BigDecimal(4) / BigDecimal(36))
    expected += (10 -> BigDecimal(3) / BigDecimal(36))
    expected += (11 -> BigDecimal(2) / BigDecimal(36))
    expected += (12 -> BigDecimal(1) / BigDecimal(36))
    // Diccionario donde voy a ir aumentando el valor de cada clave de acuerdo al total que obtenga del experimento

    var conteos = Map[Int,Int](2 -> 0, 3 -> 0, 4 -> 0, 5 -> 0,
      6 -> 0, 7 -> 0, 8 -> 0, 9 -> 0, 10 -> 0, 11 -> 0, 12 -> 0)

    for (i <- 1 to 1000 by 1){
      var t = lanzarDados()
      conteos += (t -> (conteos(t) + 1))
    }
    //conteos.foreach(element => println(element))
    //Aquí vamos a empezar haciendo el tablero de información
    print("Total\tSimulated Percent\tExpected Percent\n")
    for(clave <- conteos.keys){
      println(clave+ "\t\t\t" + (BigDecimal(conteos(clave))/BigDecimal(1000))*BigDecimal(100) + "\t\t\t" + expected(clave)*100)
    }
  }

    // Experimento de lanzar dos dados
    // te regresa la suma de las dos caras de los datos
    def lanzarDados(): Int = {
      val random = new Random()
      val num1 = random.nextInt(6) + 1
      val num2 = random.nextInt(6) + 1
      num1 + num2
    }

  }

