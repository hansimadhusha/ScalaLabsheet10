object q2 {

  def countLetterOccurrences(wordList: List[String]): Int = {
    val wordLengths = wordList.map(_.length)

    // Use foldLeft to calculate the total letter count
    val letterCount = wordLengths.reduce((x, y) => x + y)


    letterCount
  }

  def main(args: Array[String]): Unit = {
    println("Enter the list of words separated by commas:")

    // Split the input string into a list of strings
    val inputString = scala.io.StdIn.readLine()
    val inputList = inputString.split(",").toList

    // Call the countLetterOccurrences function
    val totalLetterCount = countLetterOccurrences(inputList)

    println("Total count of letter occurrences: " + totalLetterCount)
  }
}
