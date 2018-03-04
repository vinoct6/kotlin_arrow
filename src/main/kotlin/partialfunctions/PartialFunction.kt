package partialfunctions

import arrow.core.PartialFunction
import arrow.core.invokeOrElse
import arrow.core.orElse

/**
A partial function (not to be confused with partial applied function) is a function that is not defined for every possible value of its parameter type. In contrast, a total function is a function that is defined for every possible value.
 */

/*
* A partial function is a function that does not provide an answer for every possible input value it can be given. It provides an answer only for a subset of possible data, and defines the data it can handle.
*
* https://alvinalexander.com/scala/how-to-define-use-partial-functions-in-scala-syntax-examples
* */

fun main(args: Array<String>) {
    val upper: (String?) -> String = { s: String? -> s!!.toUpperCase() } //Partial function, it can't transform null

    //The upper cannot process null value despite it being a valid value
//    listOf("one", "two", null, "four").map(upper).forEach(::println) //NPE

    val partialUpper: PartialFunction<String?, String> = PartialFunction(definetAt = { s -> s != null }, f = upper)

    println(partialUpper.isDefinedAt(null))

//    listOf("one", "two", null, "four").map(partialUpper).forEach(::println)

    // invokeOrElse function that returns a default value in case the value s isn't defined for this function:
    listOf("one", "two", null, "four").map { s -> partialUpper.invokeOrElse(s, "NULL") }.forEach(::println)


    //Isn't this becoming like a case statement now ?
    val upperForNull: PartialFunction<String?, String> = PartialFunction({ s -> s == null }) { "NULL" }
    val totalUpper: PartialFunction<String?, String> = partialUpper orElse upperForNull
    listOf("one", "two", null, "four").map(totalUpper).forEach(::println)


}