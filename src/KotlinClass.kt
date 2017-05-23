/**
 * Created by ruhul on 5/23/17.
 */
class KotlinClass(Name: String, ID: Int) {
    init {
        println("Name: $Name\nID: $ID")
    }

}

fun main(args: Array<String>) {
    var student = KotlinClass("Ruhul", 306)
}