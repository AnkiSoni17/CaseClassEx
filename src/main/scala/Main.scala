// Scala program to illustrate the implementation of Case Class

object Main {
  def main(args: Array[String]): Unit = {
    println("Hello world!")
    val covidPL = CovidCountryStats("PL", 776, 15366)
    covidPL match {
      case CovidCountryStats("PL", x, y) => println("Death rate for Country PL is " + x.toFloat / y.toFloat)
      case _ => println("Unknown country")
    }
    }
  }
case class CovidCountryStats(countryCode: String, deaths: Int, confirmedCases: Int)




