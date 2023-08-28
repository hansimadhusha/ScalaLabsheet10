object q1 {

  def calculateAverage(tCelsius: List[Double]): Double = {

    val tFahrenheit = tCelsius.map(celsius => (celsius * 9 / 5) + 32)

    val sumFahrenheit = tFahrenheit.reduce((a, b) => a + b)

    val averageFahrenheit = sumFahrenheit / tFahrenheit.length

    averageFahrenheit

  }

  def main(args: Array[String]): Unit = {

    println("Enter the list of Celsius temperatures separated by commas:")

    val cTempuratureString = scala.io.StdIn.readLine()
    val cTemperatureList = cTempuratureString.split(",").map(_.toDouble).toList

    val averageFahrenheit = calculateAverage(cTemperatureList)

    println("Average Fahrenheit temperature: " + averageFahrenheit )

  }
}
