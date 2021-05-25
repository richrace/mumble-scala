class Mumble {
  def speak(word: String): String = {
    word.zipWithIndex
      .foldLeft(List[String]()) { case (accu, (letter, index)) =>
        accu :+ (letter.toLower.toString * (index + 1)).capitalize
      }
      .mkString("-")
  }
}
