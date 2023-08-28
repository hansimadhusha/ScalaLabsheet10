object q1 {

  def calculateAverage(tCelsius: List[Double]): Double = {
    // Convert Celsius to Fahrenheit using map
    val tFahrenheit = tCelsius.map(celsius => (celsius * 9 / 5) + 32)

    // Calculate the sum of Fahrenheit temperatures using reduce
    val sumFahrenheit = tFahrenheit.reduce((a, b) => a + b)

    // Calculate the average Fahrenheit temperature
    val averageFahrenheit = sumFahrenheit / tFahrenheit.length

    averageFahrenheit
  }

  def main(args: Array[String]): Unit = {

    println("Enter the list of Celsius temperatures separated by commas:")

    // Split the input string into a list of doubles
    val cTempuratureString = scala.io.StdIn.readLine()
    val cTemperatureList = cTempuratureString.split(",").map(_.toDouble).toList

    // Call the calculateAverage function
    val averageFahrenheit = calculateAverage(cTemperatureList)

    println("Average Fahrenheit temperature: " + averageFahrenheit )

  }
}
