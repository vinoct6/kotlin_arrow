package currying

import arrow.syntax.function.curried
import arrow.syntax.function.uncurried


fun main(args: Array<String>) {
    val strong: (String, String, String) -> String = { body, id, style -> "<strong id=\"$id\" style=\"$style\">$body</strong>" }
    val curriedStrong: (String) -> (String) -> (String) -> String = strong.curried()
    val curriedStrongWithHello = curriedStrong("Hello")

    val originalFunction = curriedStrong.uncurried()
}