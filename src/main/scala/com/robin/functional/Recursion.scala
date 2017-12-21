package com.robin.functional

/**
  * Created with IntelliJ IDEA.
  * Description: 
  * User: bin
  * Date: 2017-12-13
  * description:
  */
object Recursion {
  /**
    * 递归函数(Recursive Function)在函数式编程中实现循环的一种技术。
    * @param args
    */
  def main(args: Array[String]): Unit = {
    def test1():Unit={
      for(a <- 1 to 10){
        println(facotrial(a))
      }
    }

    def test2():Unit={
      /**
        * 尾递归函数(Tail Recurrsive Function) 中所有递归形式的调用都出现在函数的末尾
        *
        * 当编译器检测到一个函数调用是尾递归的时候，它就覆盖当前的活动记录而不是在栈中去创建一个新的
        */
      @annotation.tailrec
      def factorial(n:Int, m:Int):Int = {
        if (n <= 0) m
        else factorial(n-1, m * n)
      }
      factorial(5,1)

    }

//   test1()
    test2()
  }

  def facotrial(n:BigInt):BigInt={
    if(n<1){
      1
    }else{
      n * facotrial(n-1)
    }
  }

}




/**
  * Scala 递归函数
  * Scala 函数 Scala 函数
  * 递归函数在函数式编程的语言中起着重要的作用。
  * Scala 同样支持递归函数。
  * 递归函数意味着函数可以调用它本身
  */
