class Calculator {
  def add(x: Int, y: Int): Int = {
    return x + y
  }

  def subtract(x: Int, y: Int): Int = {
    return x - y
  }

  def divide(x: Double, y: Double): Double = {
    if y == 0 then
        throw new IllegalArgumentException
    else
        return x / y
  }

  def factorial(a: Int): Int = {
    if a == 0 then return 1

    var result = 1
    for i <- (1 to a) do
        result *= i

    return result
  }

  def operate(f: (total: Double, current: Double) => Double, x: Double*): Double = {
    if x.size < 2 then throw new IllegalArgumentException

    var result = x(0)

    for i <- (1 until x.size) do
      result = f(result, x(i))

    return result
  }
}
