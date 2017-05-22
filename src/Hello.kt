import sun.security.jgss.GSSToken.readInt

/**
 * Created by ruhul on 5/22/17.
 */
fun main(args:Array<String>){
    var a:Int= readLine()!!.toInt()
    var b:Int= readLine()!!.toInt()
    var m:String?
    m= readLine()
    var c:Int = m!!.toInt();
    var d:Int?
    d=a+b
    if(d>c){
        print("$d is greater than $c ")
    }
    else
        print("$d is less than $c")


}
