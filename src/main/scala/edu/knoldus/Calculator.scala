package edu.knoldus

/**
  * Created by knoldus on 7/12/17.
  */
class Calculator {

  def add(a: Double, b: Double): Double = a + b

  def subtract(a: Double, b: Double): Double = a-b

  def multiply(a: Double, b: Double): Double = a*b

  def divide(a: Double, b: Double): Double ={
    require (b != 0.0)
    a / b
  }

  def power(a: Int, b: Int): Double ={
    def compute(acc: Double, n: Int,p: Int): Double={
      if(p==0) {
        acc
      }
      else
      {
        compute(acc * n,n, p - 1)
      }
    }
    if(b>=0)
    {
      compute(1,a,b)
    }
    else
    {
      1/compute(1,a,-b)
    }
  }


  def modulus(a: Double, b: Double): Double ={
    require(b!= 0.0)
    a%b
  }

  def absolute(x: Double): Double ={
    if(x<0) {
      -x
    }
    else {
      x
    }

  }

  def maxOfTwo(a: Double, b: Double) : Double = {
    if (a > b) {
      a

    }
    else {
      b
    }
  }

  def minOfTwo(a: Double, b: Double) : Double = {
    if(a>b) {
      b
    }
    else{
      a
    }
  }


}
