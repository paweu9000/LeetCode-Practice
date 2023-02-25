import scala.collection.mutable.ListBuffer

object Solution {
    def fizzBuzz(n: Int): List[String] = {
        var list = new ListBuffer[String]()
        def go(start: Int, end: Int): List[String] = {
            if(start % 3 == 0 && start % 5 == 0) list += "FizzBuzz"
            else if(start % 3 == 0) list += "Fizz"
            else if(start % 5 == 0) list += "Buzz"
            else list += start.toString
            if(start == end) list.toList
            else go(start+1, end)
        }
        go(1, n)
    }
}