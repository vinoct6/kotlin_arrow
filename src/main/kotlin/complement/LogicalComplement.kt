package complement

import arrow.core.Predicate
import arrow.syntax.function.complement


fun main(args: Array<String>) {
    val evenPredicate: (Int) -> Boolean = { it % 2 == 0 }
    println((1..10).filter (evenPredicate))

    // Odd numbers
    println((1..10).filter(evenPredicate.complement()))
}

