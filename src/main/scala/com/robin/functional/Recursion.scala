package com.robin.functional

/**
  * Created with IntelliJ IDEA.
  * Description: 
  * User: bin
  * Date: 2017-12-13
  * description:
  */
object Recursion {
  def main(args: Array[String]): Unit = {
    for(a <- 1 to 10){
      println(facotrial(a))
    }
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
