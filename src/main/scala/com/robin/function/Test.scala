package com.robin.function

/**
  * Created with IntelliJ IDEA.
  * Description: 
  * User: bin
  * Date: 2017-12-13
  * description:
  */
object Test {
  //以下函数的功能是将两个传入的参数相加并求和
  def addInt(a:Int, b:Int): Int = {
    var sum : Int = 0
    sum = a + b
    return sum
  }

  //如果函数没有返回值，可以返回为 Unit，这个类似于 Java 的 void
  def printMe():Unit={
    println("Hello,Scala!")
  }

  def main(args: Array[String]): Unit = {
    println("Returned Value : " + addInt(5, 7))
  }


}


/**
  * Scala 函数
  * 函数是一组一起执行一个任务的语句。 您可以把代码划分到不同的函数中。
  * 如何划分代码到不同的函数中是由您来决定的，
  * 但在逻辑上，划分通常是根据每个函数执行一个特定的任务来进行的。
  * Scala 有函数和方法，二者在语义上的区别很小。
  * Scala 方法是类的一部分，而函数是一个对象可以赋值给一个变量。
  * 换句话来说在类中定义的函数即是方法。
  * 我们可以在任何地方定义函数，甚至可以在函数内定义函数（内嵌函数）。
  * 更重要的一点是 Scala 函数名可以有以下特殊字符：+, ++, ~, &,-, -- , \, /, : 等。
  */

/**
  * 函数声明
  * Scala 函数声明格式如下：
  * def functionName ([参数列表]) : [return type]
  * 如果你不写等于号和方法主体，那么方法会被隐式声明为"抽象(abstract)"，包含它的类型于是也是一个抽象类型。
  */


/**
  * 函数定义
  * 方法定义由一个def 关键字开始，紧接着是可选的参数列表，一个冒号"：" 和方法的返回类型，
  * 一个等于号"="，最后是方法的主体。
  * Scala 函数定义格式如下：
  * def functionName ([参数列表]) : [return type] = {
  *    function body
  *    return [expr]
  * }
  * 以上代码中 return type 可以是任意合法的 Scala 数据类型。参数列表中的参数可以使用逗号分隔
  *
  */

/**
  * 函数调用
  * Scala 提供了多种不同的函数调用方式：
  * 以下是调用方法的标准格式：
  * functionName( 参数列表 )
  * 如果函数使用了实例的对象来调用，我们可以使用类似java的格式 (使用 . 号)：
  * [instance.]functionName( 参数列表 )
  *
  */





