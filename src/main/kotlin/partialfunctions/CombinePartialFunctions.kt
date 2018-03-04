package partialfunctions

import arrow.core.PartialFunction
import arrow.core.orElse


fun main(args: Array<String>) {

    val fizz = PartialFunction({ n: Int -> n % 2 != 0 }) { "FIZZ" }
    val bizz = PartialFunction({ n: Int -> n % 2 == 0 }) { "BIZZ" }

    val fizzBizz = PartialFunction( { n : Int -> n %5 ==0}) { "FIZZBIZZ"}


    (1..20).map(fizzBizz orElse fizz orElse bizz).forEach(::println)
}