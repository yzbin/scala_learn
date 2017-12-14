package com.robin.functional

object HigherOrderFunction {
  def main(args: Array[String]): Unit = {
    println(apply(layout, 10))
  }

  // 函数 f 和 v 作为参数,而函数又调用了参数v
  def apply(f:Int => String, v:Int) = f(v)

  def layout[A](x:A)="[" + x.toString + "]"
}



/**
  * Scala 高阶函数
  * Scala 函数 Scala 函数
  * 高阶函数（Higher-Order Function）就是操作其他函数的函数。
  * Scala 中允许使用高阶函数, 高阶函数可以使用其他函数作为参数，或者使用函数作为输出结果。
  * 以下实例中，apply() 函数使用了另外一个函数 f 和 值 v 作为参数，而函数 f 又调用了参数 v
  */
