object Main extends App {
  println("Please enter your string:")
  val input = scala.io.StdIn.readLine()
  val output = new Mumble().speak(input)
  println(s"Mumbling: '$output'")
}