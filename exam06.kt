class Car{
    var color : String = ""
    var speed : Int = 0

    //생성자는 변수쓰고 그 다음에 쓰는것이 일반적이다
    constructor(color: String, speed: Int){
        this.color = color
        this.speed = speed
    }//생성자

    constructor(speed: Int){
        this.speed = speed
    }//생성자 오버로딩

    constructor(color: String){
        this.color = color
    }//생성자 오버로딩

    constructor(){

    } //생성자 오버로딩 생성자의 효율성을 높일 수 있다.

    fun upSpeed(value: Int){
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

fun main() {
    var myCar1 : Car = Car("빨강",0)
    //myCar1.color="빨강"
    //myCar1.speed=0

    var myCar2 : Car = Car("파랑",0)

    var myCar3 : Car = Car("초록",0)

    myCar1.upSpeed(50)
    println("자동차1의 색상은 " + myCar1.color + "이며, 속도는 "+myCar1.speed + "km입니다.")

    myCar2.upSpeed(20)
    println("자동차2의 색상은 " + myCar2.color + "이며, 속도는 "+myCar2.speed + "km입니다.")

    myCar3.upSpeed(250)
    println("자동차3의 색상은 " + myCar3.color + "이며, 속도는 "+myCar3.speed + "km입니다.")
}