package partialapplication

import arrow.syntax.function.invoke
import arrow.syntax.function.reverse

//Reverse takes any function and returns it with its parameter in the reverse order (in other languages, this function is known as flip)
//Not really useful since we have named parameters ?

fun main(args: Array<String>) {

    val strong: (String, String, String) -> String = { body, id, style -> "<strong id=\"$id\" style=\"$style\">$body</strong>" }

    val redStrong = strong(p3 = "font: red")

    println(redStrong("Red Sonja", "movie1"))

    println(redStrong.reverse()("movie1", "Red Sonja"))
}