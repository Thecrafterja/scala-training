import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.BeforeAndAfterEach

class CalculatorTest extends AnyFunSuite with BeforeAndAfterEach:
    var calc = new Calculator()

    override protected def beforeEach(): Unit = {
        calc = new Calculator()
    }

    test("Calculator.add") {
        assert(calc.add(12, 5) == 17)
    }

    test("Calculator.add - negative numbers") {
        assert(calc.add(-3, -2) == -5)
    }

    test("Calculator.subtract") {
        assert(calc.subtract(3, 1) == 2)
    }

    test("Calculator.subtract - negative result") {
        assert(calc.subtract(12, 100) == -88)
    }

    test("Calculator.divide") {
        assert(calc.divide(15, 10) == 1.5d)
    }

    test("Calculator.divide - divide by zero") {
        assertThrows[IllegalArgumentException] {
            calc.divide(10, 0)
        }
    }

    test("Calculator.factorial") {
        assert(calc.factorial(5) == 120)
    }
    
    test("Calculator.factorial - 0") {
        assert(calc.factorial(0) == 1)
    }

    test("Calculator.factorial - 1") {
        assert(calc.factorial(1) == 1)
    }
