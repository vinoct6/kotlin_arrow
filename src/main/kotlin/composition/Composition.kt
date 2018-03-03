package composition

import arrow.core.andThen
import arrow.core.compose


val p: (String) -> String = { body -> "<p>$body</p>" }

val span: (String) -> String = { body -> "<span>$body</span>" }

val div: (String) -> String = { body -> "<div>$body</div>" }

val strong: (String) -> String = { body -> "<strong>$body</strong>" }


fun main(args: Array<String>) {

    val divStrong = div compose  strong
    val strongDiv = div andThen   strong

    val spanP = span andThen p

    println(divStrong("Hello"))
    println(strongDiv("Hello"))

    println(spanP("Hello"))

}