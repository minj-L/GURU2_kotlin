var myVar : Int = 100

fun main() {
    var myVar : Int = 0
    println("main() : $myVar")

    var sum : Int = addFunction(10,20)
    println(sum)
}

fun addFunction(num1:Int, num2:Int) : Int{
    var hap : Int
    println("addFunc() myvar: $myVar")
    hap = num1 + num2 + myVar
    return hap
}