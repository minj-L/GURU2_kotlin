fun main() {
    var count : Int = 85
    if(count>=90){
        println("A학점")
    }else if(count>=80){
        println("B학점")
    }else if(count>=70){
        println("C학점")
    }else if(count>=60){
        println("D학점")
    }else{
        println("F학점")
    }

    var jumsu : Int = (count/10)*10
    when(jumsu){
        in 90 .. 100 -> println("A학점")
        in 80 .. 89 -> println("B학점")
        in 70 .. 79 -> println("C학점")
        in 60 .. 69 -> println("D학점")
        else -> println("F학점")
    }
}