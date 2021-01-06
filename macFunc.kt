fun main(){
    val num1 = 10
    val num2 = 3
    val result: Int
    result = max(num1, num2)
    println(result)
}

fun max(a:Int, b:Int) = if(a>b) a else b //a를 리턴하고, b를 리턴하라 코틀린은 매개함수를 아래에 써도된다