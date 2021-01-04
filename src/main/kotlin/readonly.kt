var rw : Int = 10 //변경 가능한 변수를 생성
    get(){
        println("rw의 getter 호출")
        return field  //원래의 값을 리턴
    }
    set(value : Int){
        println("rw의 setter 호출")
        field = value
    }

//val은 setter 가 없는 것입니다.
//getter를 재정의해서 원래 의 값과 다른 값 사용이 가능
var b : Boolean = true
val r : String = "Hello World"
    get(){
        if(b == true){
            return field.toUpperCase()
        }else{
            return field.toLowerCase()
        }
    }

//val 앞에 const를 추가하면 getter를 overriding 할 수 없음
//초기값만 사용해야 합니다.
const val constant : String = "Hi"



fun main(args:Array<String>){
    rw = 100 //rw의 setter를 호출
    println(rw) //rw의 getter를 호출

    //r에 값을 대입하는 것은 안됨
    //r = "Hi"

    //b값에 의해서 r의 값이 다른 내용을 출력
    b = false
    println(r)
    b = true
    println(r)
}