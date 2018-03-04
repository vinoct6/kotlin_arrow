package pipe

import arrow.syntax.function.pipe
import arrow.syntax.function.pipe11
import arrow.syntax.function.pipe2


fun list1to5(name: String): ArrayList<Int> = arrayListOf(1, 2, 3, 4, 5)
fun list6to10(): ArrayList<Int> = arrayListOf(6, 7, 8, 9, 10)
fun squareEach(x: ArrayList<Int>): List<Int> = x + arrayListOf(6, 8, 9)


fun give5(): Int = 5

fun square(x: Int): Int = x * x
fun returnx(x: Int): Int = x

fun add(x: Int, y: Int) = x + y

fun main(args: Array<String>) {

    squareEach(list1to5("x"))

    val arrayList = list1to5("X") pipe ::squareEach
    println(arrayList)

    returnx(6) pipe ::square

    //When pipe is applied to a multi-parameter function, using its variants pipe2 to pipe22, it behaves as partially1.
    val add7: (Int) -> Int = returnx(7) pipe2 ::add

    println(add7(9))

}