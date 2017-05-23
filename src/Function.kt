/**
 * Created by ruhul on 5/23/17.
 */
var sum: Int = 0

fun sum(number1: Int, number2: Int): Int {
    sum = number1 + number2;
    return sum
}

fun display(sum: Int): Unit {
    println("Sum is: $sum")
}

fun sumOverload(number1: Int, number2: Int, number3: Int): Int {
    sum = number1 + number2 + number3
    return sum
}

fun main(args: Array<String>) {
    var n1: Int = readLine()!!.toInt()
    var n2: Int = readLine()!!.toInt()
    var addition = sum(n1, n2)
    display(addition)

}
