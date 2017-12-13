package com.robin.functional

/**
  * Created with IntelliJ IDEA.
  * Description: 
  * User: bin
  * Date: 2017-12-13
  * description:
  */
object VariableParameter {
  def main(args: Array[String]): Unit = {
    printStrings("Hello", "Scala", "Functional")
  }

  def printStrings(args:String*) = {
    var i : Int = 0
    for (arg <- args){
      println("Arg Value[" + i + "] = " + arg)
      i = i + 1
    }
  }

}

/**
  * Scala 函数 - 可变参数
  * Scala 函数 Scala 函数
  * Scala 允许你指明函数的最后一个参数可以是重复的，即我们不需要指定函数参数的个数，
  * 可以向函数传入可变长度参数列表。
  * Scala 通过在参数的类型之后放一个星号来设置可变参数(可重复的参数)。
  */
