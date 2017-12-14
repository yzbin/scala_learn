package com.robin.functional

/**
  * Created with IntelliJ IDEA.
  * Description: 
  * User: bin
  * Date: 2017-12-14
  *
  */
object AnonymousFunction {
  def main(args: Array[String]): Unit = {
    def test1():Unit={
      var userDir = () => { System.getProperty("user.dir") }
      println(userDir)
    }

    def test2():Unit={
      var factor = 3
      val multiplier =(i:Int) => i * factor
      println("multiplier(1) value = " + multiplier(1))
      println("multiplier(2) value = " + multiplier(2))
    }


    //test1()
    test2()
  }

}

/**
  * Scala 匿名函数
  * Scala 中定义匿名函数的语法很简单，箭头左边是参数列表，右边是函数体。
  * 使用匿名函数后，我们的代码变得更简洁了。
  * 下面的表达式就定义了一个接受一个Int类型输入参数的匿名函数:
  * var inc = (x:Int) => x+1
  * 上述定义的匿名函数，其实是下面这种写法的简写：
  * def add2 = new Function1[Int,Int]{
  *     def apply(x:Int):Int = x+1;
  * }
  *
  * 以上实例的 inc 现在可作为一个函数，使用方式如下：
  * var x = inc(7)-1
  *
  *
  * 同样我们可以在匿名函数中定义多个参数：
  * var mul = (x: Int, y: Int) => x*y
  *
  * mul 现在可作为一个函数，使用方式如下
  * println(mul(3, 4))
  *
  *
  * 我们也可以不给匿名函数设置参数，如下所示
  * var userDir = () => { System.getProperty("user.dir") }
  *
  * userDir 现在可作为一个函数，使用方式如下：
  *
  * println( userDir() )
  *
  */







