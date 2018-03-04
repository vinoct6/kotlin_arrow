package partialapplication

import arrow.syntax.function.partially3
import arrow.syntax.function.invoke


fun main(args: Array<String>) {
    val strong: (String, String, String) -> String = { body, id, style -> "<strong id=\"$id\" style=\"$style\">$body</strong>" }

    val redStrong = strong.partially3("font: red") // Explicit

    val blueStrong = strong(p3 = "font: blue") // Implicit

    println(redStrong("Red Sonja", "movie1"))
    println(blueStrong("Deep Blue Sea", "movie2"))
}