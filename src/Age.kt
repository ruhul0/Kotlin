import java.time.Year
import java.util.*

/**
 * Created by ruhul on 5/23/17.
 */
fun main(args:Array<String>){
    println("Enter your birth year")
    var year:Int = readLine()!!.toInt()
    var currentYear:Int = Calendar.getInstance().get(Calendar.YEAR)
    var age:Int = currentYear-year
    println("Your age is $age")
    when (age) {
        in 0..18 -> println("Not Adult")
        else -> println("Adult")
    }

}