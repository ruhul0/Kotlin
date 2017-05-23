/**
 * Created by ruhul on 5/23/17.
 */
fun main(args: Array<String>) {
    var list = ArrayList<Int>()
    var id: Int = 1
    while (id != 0) {
        id = readLine()!!.toInt()
        list.add(id)
    }
    println("Print using object")
    for (item in list) {
        println(item)
    }
    println("Print using index")
    for (index in 0..list.size - 1) {
        println(list.get(index))
    }
}
