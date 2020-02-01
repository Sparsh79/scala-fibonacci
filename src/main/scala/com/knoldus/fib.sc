

class fibonacci extends App {

  def fib(n: Int): Int = {
    @scala.annotation.tailrec
    def tailRec(n: Int, a: Int, b: Int): Int = n match {
      case 0 => a
      case _ => tailRec(n - 1, b, a + b)
    }
    return tailRec(0,n,1)
    print(for)

  }
}


