@main def hello(): Unit =
  println("Calculator starting...")

  var calc = new Calculator()

  println(s"5 - 3 = ${calc.subtract(5, 3)}")
  println(s"4! = ${calc.factorial(4)}")
