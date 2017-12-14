package com.robin.collection

/**
  * Created with IntelliJ IDEA.
  * Description: 
  * User: bin
  * Date: 2017-12-14
  *
  */
object TupleTest {
  def main(args: Array[String]): Unit = {

    def test1():Unit = {
      /**
        * 们可以使用 t._1 访问第一个元素， t._2 访问第二个元素，如下所示
        */
      val t = (4, 3, 2, 1)

      val sum = t._1 + t._2 + t._3 + t._4

      println("元素之和为: " + sum)
    }

    def test2():Unit = {
      /**
        * 迭代元组
        * 你可以使用 Tuple.productIterator() 方法来迭代输出元组的所有元素
        */
      val t = (4,3,2,1)
      t.productIterator.foreach{i => println("Value = " + i)}

    }

    def test3():Unit ={
      /**
        * 元组转为字符串
        * 你可以使用 Tuple.toString() 方法将元组的所有元素组合成一个字符串，实例如下
        */
      val t = new Tuple3(1, "hello", Console)
      println("连接后的字符串为: " + t.toString())
    }

    def test4():Unit ={
      val t = new Tuple2("www.google.com", "www.runnob.com")
      println("交换后的元祖: " + t.swap)
    }



//    test1()
//    test2()
//    test3()
//    test4()
  }

}

/**
  * Scala 元组
  * Scala 集合 Scala 集合
  * 与列表一样，元组也是不可变的，但与列表不同的是元组可以包含不同类型的元素。
  * 元组的值是通过将单个的值包含在圆括号中构成的。例如：
  * val t = (1, 3.14, "Fred")
  * 以上实例在元组中定义了三个元素，对应的类型分别为[Int, Double, java.lang.String]。
  * 此外我们也可以使用以上方式来定义：
  * val t = new Tuple3(1, 3.14, "Fred")
  * 元组的实际类型取决于它的元素的类型，比如 (99, "runoob") 是 Tuple2[Int, String]。 ('u', 'r', "the", 1, 4, "me") 为 Tuple6[Char, Char, String, Int, Int, String]。
  * 目前 Scala 支持的元组最大长度为 22。对于更大长度你可以使用集合，或者扩展元组。
  * 访问元组的元素可以通过数字索引，如下一个元组：
  * val t = (4,3,2,1)
  * 我们可以使用 t._1 访问第一个元素， t._2 访问第二个元素，如下所示：
  * object Test {
  *    def main(args: Array[String]) {
  *       val t = (4,3,2,1)
  *
  *       val sum = t._1 + t._2 + t._3 + t._4
  *
  *       println( "元素之和为: "  + sum )
  *    }
  * }
  * 执行以上代码，输出结果为：
  * $ scalac Test.scala
  * $ scala Test
  * 元素之和为: 10
  * 迭代元组
  * 你可以使用 Tuple.productIterator() 方法来迭代输出元组的所有元素：
  * object Test {
  *    def main(args: Array[String]) {
  *       val t = (4,3,2,1)
  *
  *       t.productIterator.foreach{ i =>println("Value = " + i )}
  *    }
  * }
  * 执行以上代码，输出结果为：
  * $ scalac Test.scala
  * $ scala Test
  * Value = 4
  * Value = 3
  * Value = 2
  * Value = 1
  * 元组转为字符串
  * 你可以使用 Tuple.toString() 方法将元组的所有元素组合成一个字符串，实例如下：
  * object Test {
  *    def main(args: Array[String]) {
  *       val t = new Tuple3(1, "hello", Console)
  *
  *       println("连接后的字符串为: " + t.toString() )
  *    }
  * }
  * 执行以上代码，输出结果为：
  * $ scalac Test.scala
  * $ scala Test
  * 连接后的字符串为: (1,hello,scala.Console$@4dd8dc3)
  * 元素交换
  * 你可以使用 Tuple.swap 方法来交换元组的元素。如下实例：
  * object Test {
  *    def main(args: Array[String]) {
  *       val t = new Tuple2("www.google.com", "www.runoob.com")
  *
  *       println("交换后的元组: " + t.swap )
  *    }
  * }
  * 执行以上代码，输出结果为：
  * $ scalac Test.scala
  * $ scala Test
  * 交换后的元组: (www.runoob.com,www.google.com)
  */
