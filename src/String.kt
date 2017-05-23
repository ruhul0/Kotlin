/**
 * Created by ruhul on 5/23/17.
 */
fun main(args: Array<String>) {
    var name: String?
    loop@ while (true) {
        println("Enter String")
        name = readLine()
        println("1 for uppercase 2 for lower case")
        var option: Int = readLine()!!.toInt()
        when (option) {
            1 -> {
                println(name!!.toUpperCase())
            }
            2 -> {
                println(name!!.toLowerCase())
            }
            else -> {
                break@loop

            }

        }

    }
}
