@main def hello(): Unit =
  println("Calculator starting...")

  var calc = new Calculator()

  println(s"5 - 3 = ${calc.subtract(5, 3)}")
  println(s"4! = ${calc.factorial(4)}")

  val polynom = List(PolynomPart(-5, 3), PolynomPart(2, 1), PolynomPart(3, 0)) // -5 * (x^3) + 2 * x + 3
  println(s"Derivation for ${polynom.toPolynomString()} is ${calc.derive(polynom).toPolynomString()}")
