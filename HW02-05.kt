fun main() {
    var sum = 0
    var i = 0 //while문에서 홀수인지 확인 후 누적해야 함

    while(i<=100){
        if(i%2==1)
            sum += i
        i++
    }//1~100까지의 누적 합
    println("sum = $sum")

    sum = 0
    i=0

    for(i in 1..100 step 2){
        //if(i%2==1)
        sum += i
    }
    println("sum = $sum")
}