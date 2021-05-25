
class Mumble {
  def speak(word: String): String = {
    word.zipWithIndex
      .foldLeft(List[String]()) { (accu, foldTuple) =>
        var index = foldTuple._2
        var letter = foldTuple._1
        accu :+ (letter.toLower.toString * (index + 1)).capitalize
      }
      .mkString("-")
  }
}
