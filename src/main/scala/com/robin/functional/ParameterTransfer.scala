package com.robin.functional

/**
  * Created with IntelliJ IDEA.
  * Description: 
  * User: bin
  * Date: 2017-12-13
  * description:
  */
object ParameterTransfer {
  def main(args: Array[String]): Unit = {
    printInt(b=5, a=7)
  }


  def printInt (a:Int, b:Int)={
    println("Value of a :" + a)
    println("Value of b :" + b)
  }
}



/**
  * Scala 指定函数参数名
  * Scala 函数 Scala 函数
  * 一般情况下函数调用参数，就按照函数定义时的参数顺序一个个传递。
  * 但是我们也可以通过指定函数参数名，并且不需要按照顺序向函数传递参数，
  */


