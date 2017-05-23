/**
 * Created by ruhul on 5/23/17.
 */
class KotlinClass() {
    var Name: String? = null
    var ID: Int? = 0

    constructor(Name: String, ID: Int) : this() {
        fun getName(): String {
            var name: String = this.Name!!
            return name
        }

        fun getID(): Int {
            var id: Int = this.ID!!
            return id
        }
/*    init {
        println("Name: $Name\nID: $ID")
        this.Name=Name

        fun getName():String{
            var name:String= this.Name!!
            return name
        }
        fun getID():Int{
            var id:Int = this.ID!!
            return id
        }*/
    }

}

fun main(args: Array<String>) {
    var student = KotlinClass("Ruhul", 306)
    var name = student.Name
    var id = student.ID
    println("Name: $name\nID: $id")

}