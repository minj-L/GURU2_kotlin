fun main() {
    var sum = 0
    var x = 11 // 누적하는 값

    while(x <= 10){
        sum += x
        x++
    }

    println("sum: $sum")

    sum = 0
    x =11
    do{
        sum += x
        x++
    } while(x <= 10) // 조건을 뒤에서 체크하기 때문에 반복문이 한번은 수행된다
    println("sum: $sum")
}