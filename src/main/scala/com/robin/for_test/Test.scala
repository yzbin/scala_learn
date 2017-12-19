package com.robin.for_test

object Test {
  def main(args: Array[String]): Unit = {
    def test1():Unit={
      val list = List("Bob", "Alice", "Rose")
      for (
        s <- list // generator
      )println(s)
    }

    def test2():Unit={
      val list = List("Bob", "Alice", "Rose")
      for(
        s <- list
        if (s.length > 3)
      )println(s)
    }

    def test3():Unit={
      val list = List("Bob", "Alice", "rose")
      val for_result = for{
        s <- list
        s1 = s.toUpperCase()
        if ( s1 != " ")
      }yield s1

      for (
        s <- for_result
        if (s.length > 3)
      )println(s)
    }

//    test1()
//    test2()
    test3()
  }
}
