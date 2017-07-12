package edu.knoldus
/**
  * Created by knoldus on 7/12/17.
  */

import org.scalatest.FunSuite

class CalculatorTest extends FunSuite{

  val res = new Calculator()

  test("Adding two numbers") {
    val sum = res.add(5.5, 6.5)
    assert(sum === 12.0)

  }

  test("Subtraction of two numbers"){
    val diff = res.subtract(5.5,4.5)
    assert(diff === 1.0)

  }

  test("Multiplication of two numbers")
  {
    val mul = res.multiply(2,1)
    assert(mul === 2.0)
  }

  test("Division of two numbers")
  {
    val div = res.divide(2,1)
    assert(div === 2.0)
  }

  test("Division of number with zero")
  {
    intercept[IllegalArgumentException]{
      val div = res.divide(2,0)
    }

  }

  test("power of number with positive power")
  {
    val pow = res.power(2,2)
    assert(pow === 4.0)
  }

  test("power of number with power=1")
  {
    val pow = res.power(2,1)
    assert(pow === 2.0)
  }

  test("power of number with zero"){

    val pow = res.power(2,0)
    assert(pow === 1.0)

  }

  test("power of number with negative power")
  {
    val pow = res.power(2,-1)
    assert(pow === 0.5)
  }

  test("Modulus of two numbers")
  {
    val mod = res.modulus(5,2)
    assert(mod === 1.0)

  }

  test("Modulus of number with zero")
  {
    intercept[IllegalArgumentException]{
      val mod = res.modulus(5,0)
    }

  }

  test("Absolute")
  {
    val abs = res.absolute(5.5)
    assert(abs === 5.5)

  }

  test("Absolute with negative number")
  {
    val abs = res.absolute(-5.5)
    assert(abs === 5.5)

  }

  test("Maximum of Two Numbers a<b")
  {
    val max = res.maxOfTwo(5.5,6.5)
    assert(max === 6.5)
  }


  test("Maximum of Two Numbers a>b")
  {
    val max = res.maxOfTwo(7.5,6.5)
    assert(max === 7.5)
  }

  test("Minimum of Two Numbers a<b")
  {
    val min = res.minOfTwo(5.5,6.5)
    assert(min === 5.5)

  }

  test("Minimum of Two Numbers a>b")
  {
    val min = res.minOfTwo(7.5,6.5)
    assert(min === 6.5)

  }

}
