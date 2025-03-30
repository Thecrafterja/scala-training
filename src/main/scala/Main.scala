def benchmark[A](f: => A, identifier: String): A = {
  val start = System.nanoTime()
  val result = f
  val end = System.nanoTime()

  println(
    s"Execution time ($identifier): " + BigDecimal(
      end / 1000000000d - start / 1000000000d
    ).setScale(2, BigDecimal.RoundingMode.HALF_UP) + "s"
  )

  return result
}

@main def hello(): Unit =
  println("Calculator starting...")

  var calc = new Calculator()

  println(s"5 - 3 = ${calc.subtract(5, 3)}")
  println(s"4! = ${calc.factorial(4)}")

  val gcDResult = benchmark(calc.gcD(310841, 24710), "gcD")
  println(s"gcD(310841, 24710) = $gcDResult")
