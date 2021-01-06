open class Car{
    var color : String = ""
    var speed : Int = 0

    companion object{
        var carCount : Int =0
        const val MAXSPEED : Int = 200
        const val MINSPEED : Int = 0
        fun currentCarCount() : Int {
            return carCount
        }
    } // 정적 필드
    constructor(color: String, speed: Int){
        this.color = color
        this.speed = speed
        carCount ++
    }//생성자

    constructor(speed: Int){
        this.speed = speed
    }//생성자 오버로딩

    constructor(color: String){
        this.color = color
    }//생성자 오버로딩

    constructor(){

    } //생성자 오버로딩 생성자의 효율성을 높일 수 있다.

    open fun upSpeed(value: Int){
        if(speed+value >= 200)
            speed = 200
        else
            speed = speed + value
    }

    fun downSpeed(value: Int){
        if(speed - value <=0)
            speed = 0
        else
            speed = speed - value
    }
}

class Automobile : Car { //Car을 상속받는다
    var seatNumber : Int = 0

    constructor(){

    }
    fun countseatNum() : Int{
        return seatNumber
    }

    override fun upSpeed(value: Int) {
        if(speed+value >= 300) // 200이었던게 300으로 재정의되었다.
            speed = 300
        else
            speed = speed+value
    }
}

fun main() {
    var auto : Automobile = Automobile()
    auto.upSpeed(250)
    println("승용차의 속도는 " + auto.speed + "km입니다.")
}