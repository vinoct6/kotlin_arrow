package composition


fun mul(x: Int, y: Int): Int {
    return x * y
}

fun add(x: Int, y: Int): Int {
    return x + y
}

fun sub(x: Int, y: Int): Int {
    return x - y
}


fun square(x: Int): Int = x * x

fun cube(x: Int): Int = x * x * x

fun main(args: Array<String>) {

       val x: (x: Int, y: Int) -> Int =  ::add andThen1 ::square

        val res = x(5,4)
        println(res)

}


infix fun <A, B, C> ((B) -> C).compose(f: (A) -> B): (A) -> C = { a: A -> this(f(a)) }


infix fun <A, B, C, D> ((A, B) -> C).andThen1(f: (C) -> D): (A, B) -> D = { a: A, b: B -> f(this(a, b)) }

