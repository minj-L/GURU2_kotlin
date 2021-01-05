fun main() {
    var one : IntArray = intArrayOf(10,20,30)
    for (i in one.indices) { //one이라는 배열안에 있는 인덱스 값을 모두 출력하라
        println(one[i])
    }
    for(value in one){
        println(value)
    }

    var two : Array<String> = arrayOf("하나","둘","셋")
    for(i in 0..2 step 1){
        println(two[i])
    }
    var k : Int = 0
    while(k<two.size){
        println(two[k])
        k++
    }
}