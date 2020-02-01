package edu.knoldus.com

class fibonacci{

  def fib(n: Int): Int = {
    @scala.annotation.tailrec
    def tailRec(n: Int, a: Int, b: Int): Int = n match {
      case 0 => a
      case _ => tailRec(n - 1, b, a + b)
    }
    return tailRec(n,0,1)
  }
}

object fibonacci{
  def main(args: Array[String]): Unit = {
    val fib_series = new fibonacci()
    print(fib_series.fib(n =4))

  }
}