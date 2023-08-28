object q2 {

  def countLetterOccurrences(wordList: List[String]): Int = {

    val wordLengths = wordList.map(_.length)

    val letterCount = wordLengths.reduce((x, y) => x + y)

    letterCount
  }

  def main(args: Array[String]): Unit = {
    println("Enter the list of words separated by commas:")

    val inputString = scala.io.StdIn.readLine()
    val inputList = inputString.split(",").toList

    val totalLetterCount = countLetterOccurrences(inputList)

    println("Total count of letter occurrences: " + totalLetterCount)

  }
}
