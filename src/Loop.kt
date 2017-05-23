import java.util.*

/**
 * Created by ruhul on 5/23/17.
 */
fun main(args: Array<String>) {
    var number: Int?
    externalLoop@ while (true) {
        println("Enter 1 for calculator and 2 for age calculator 0 to exit")
        number = readLine()!!.toInt()
        when (number) {
            0 -> {
                println("Exiting External Loop")
                break@externalLoop
            }
            2 -> {
                println("Enter your birth year")
                var year: Int = readLine()!!.toInt()
                var currentYear: Int = Calendar.getInstance().get(Calendar.YEAR)
                var age: Int = currentYear - year
                println("Your age is $age")
                if (year == 0) {
                    println("Exiting Internal Loop")
                    break@externalLoop
                }
            }
            else -> {
                internalLoop@ while (true) {
                    println("Enter 1 for addition and 2 for substraction")
                    number = readLine()!!.toInt()
                    when (number) {
                        0 -> {
                            println("Exiting Internal Loop")
                            break@internalLoop
                        }
                        1 -> {
                            println("Enter 2 number")
                            var number1: Int = readLine()!!.toInt()
                            var number2: Int = readLine()!!.toInt()
                            var number3: Int?
                            when (number) {
                                1 -> {
                                    number3 = number1 + number2
                                    println("Addition is $number3")
                                }
                                2 -> {
                                    if (number1 > number2) {
                                        number3 = number1 - number2

                                    } else
                                        number3 = number2 - number1
                                    println("Substraction is $number3")
                                }
                                else ->
                                    println("Enter between 1 or 2")
                            }

                        }
                    }
                }

            }

        }

    }
}
