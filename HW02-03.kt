fun main() {
    var two = Array<IntArray>(3, {IntArray(3)})
    //var three = arrayOf(arrayOf(100,110,120), arrayOf(130,140,150), arrayOf(160,170,180))

    var value : Int = 100
    for(i in 0..2){
        for(j in 0..2){
            two[i][j] = value
            value = value + 10
            println("two[$i][$j]: ${two[i][j]}")
        }
    }
}