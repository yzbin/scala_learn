package com.robin.functional

object NestedFunction {
  def main(args: Array[String]): Unit = {
    println(factorial(0))
    println(factorial(1))
    println(factorial(2))
    println(factorial(3))
  }

  def factorial(i: Int):Int = {
    def fact(i:Int, accumulator:Int):Int = {
      if(i <= 1){
        accumulator
      }else{
        fact(i-1, i * accumulator)
      }
    }
    fact(i, 1)
  }
}


/**
  * Scala 函数嵌套
  * Scala 函数 Scala 函数
  * 我们可以在 Scala 函数内定义函数，定义在函数内的函数称之为局部函数
  */
