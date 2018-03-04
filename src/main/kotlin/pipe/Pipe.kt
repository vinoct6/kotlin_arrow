package pipe

import arrow.syntax.function.pipe

//A pipe is similar to function composition, but instead of generating new functions, we can chain function invocations to produce new values, reducing nesting calls

//A pipe function takes a T value and invokes a (T) -> R function with it:
fun main(args: Array<String>) {

    val strong: (String) -> String = { body -> "<strong>$body</strong>" }

    "From a Pipe".pipe(strong).pipe(::println)
    "From a Pipe" pipe(strong) pipe(::println)

}
