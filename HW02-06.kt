/*fun main() {
    print("number1 = ")
    var num1 : Int=readLine()!!.toInt()
    print("number2 = ")
    val num2 : Int=readLine()!!.toInt()

    println("num1+num2 = ${num1+num2}")
    println("num1-num2 = ${num1-num2}")
    println("num1Xnum2 = ${num1*num2}")
}
*/

//fun sum(a:Int, b:Int) = a+b 내가 저번에 썼던 파일중에 sum 함수가 있어서 주석처리한거다 원래는 주석빼야함
fun sub(a:Int, b:Int) : Int = a-b
fun mul(a:Int, b:Int) : Int {
    return a*b
}

fun main() {
    var num1: Int
    var num2: Int

    print("number1 = ")
    num1 = readLine()!!.toInt()
    print("number2 = ")
    num2 = readLine()!!.toInt()

    println("num1+num2 = ${sum(num1,num2)}")
    println("num1-num2 = ${sub(num1,num2)}")
    println("num1Xnum2 = ${mul(num1,num2)}")
}