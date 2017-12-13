package com.robin.functional

/**
  * Created with IntelliJ IDEA.
  * Description: 
  * User: bin
  * Date: 2017-12-13
  * description:
  */
object CallBy {

  def main(args: Array[String]): Unit = {
    delayed(time())
  }

  def time() = {
    println("获取时间,单位为纳秒")
    System.nanoTime
  }

  def delayed(t: => Long)={
    println("在 delayed 方法内")
    println("参数: " + t)
    t
  }
  // 以上实例中我们声明了 delayed 方法， 该方法在变量名和变量类型使用 => 符号来设置传名调用


}

/**
  * Scala也是一种函数式语言，所以函数是 Scala 语言的核心。以下一些函数概念有助于我们更好的理解 Scala 编程：
  * 函数概念解析接案例
  * 函数传名调用(Call-by-Name)
  * 指定函数参数名
  * 函数 - 可变参数
  * 递归函数
  * 默认参数值
  * 高阶函数
  * 内嵌函数
  * 匿名函数
  * 偏应用函数
  * 函数柯里化(Function Currying)
  */

/**
  * Scala 函数传名调用(call-by-name)
  * Scala 函数 Scala 函数
  * Scala的解释器在解析函数参数(function arguments)时有两种方式：
  * 传值调用（call-by-value）：先计算参数表达式的值，再应用到函数内部；
  * 传名调用（call-by-name）：将未计算的参数表达式直接应用到函数内部
  * 在进入函数内部前，传值调用方式就已经将参数表达式的值计算完毕，而传名调用是在函数内部进行参数表达式的值计算的。
  * 这就造成了一种现象，每次使用传名调用时，解释器都会计算一次表达式的值
  *
  */


