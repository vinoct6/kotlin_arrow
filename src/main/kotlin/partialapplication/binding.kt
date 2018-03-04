package partialapplication

import arrow.syntax.function.bind

//A special case of partial application is binding. With binding, you pass a T parameter to the (T) -> R
// function but without executing it, effectively returning an () -> R function


fun main(args: Array<String>) {
    val footer : (String) -> String = { content ->  "<footer>$content</footer>"}

    val fixFooter : () -> String = footer.bind("Fixed Footer")
    println(fixFooter())
}