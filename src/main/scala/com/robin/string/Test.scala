package com.robin.string

/**
  * Created with IntelliJ IDEA.
  * Description: 
  * User: bin
  * Date: 2017-12-14
  *
  */
object Test {
  def main(args: Array[String]): Unit = {
    /**
      * 我们前面提到过 String 对象是不可变的，如果你需要创建一个可以修改的字符串，可以使用 String Builder 类
      */
    val buf = new StringBuilder
    buf += 'a'
    buf ++= "bcdef"
    println("buf is : " + buf.toString)
  }

}

/**
  * Scala 字符串
  * 以下实例将字符串赋值给一个常量：
  * object Test {
  *    val greeting: String = "Hello,World!"
  *
  *    def main(args: Array[String]) {
  *       println( greeting )
  *    }
  * }
  * 以上实例定义了变量 greeting，为字符串常量，它的类型为 String (java.lang.String)。
  * 在 Scala 中，字符串的类型实际上是 Java String，它本身没有 String 类。
  * 在 Scala 中，String 是一个不可变的对象，所以该对象不可被修改。这就意味着你如果修改字符串就会产生一个新的字符串对象。
  * 但其他对象，如数组就是可变的对象。接下来我们会为大家介绍常用的 java.lang.String 方法。
  */

/**
  * 创建字符串
  * 创建字符串实例如下：
  * var greeting = "Hello World!"
  * 或
  * var greeting:String = "Hello World!"
  *
  * 你不一定为字符串指定 String 类型，因为 Scala 编译器会自动推断出字符串的类型为 String。
  * 当然我们也可以直接显示的声明字符串为 String 类型，如下实例：
  * object Test {
  *    val greeting: String = "Hello, World!"
  *
  *    def main(args: Array[String]) {
  *       println( greeting )
  *    }
  * }
  *
  */


/**
  * 我们前面提到过 String 对象是不可变的，如果你需要创建一个可以修改的字符串，可以使用 String Builder 类，如下实例:
  * object Test {
  *    def main(args: Array[String]) {
  *       val buf = new StringBuilder;
  *       buf += 'a'
  *       buf ++= "bcdef"
  *       println( "buf is : " + buf.toString );
  *    }
  * }
  */
