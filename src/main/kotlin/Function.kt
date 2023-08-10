fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int): Int = a + b;

fun sum3(a: Int, b: Int) = a + b

fun sum4(a: Int, b: Int) { // type 명시하지 않으면 컴파일 에러
//    return a + b;
}

fun printSum(a: Int, b: Int): Unit {
    println("$a + $b = ${a + b}")
}

fun greeting(message: String = "안녕하세요") {
    println(message);
}

//fun main(){
//    greeting()
//    greeting("hi")
//}

fun log(level : String ="INFO", message: String){
    println("[$level]$message")
}

fun main(){
   log(message = "인포 로그")
   log(level = "DEBUG", "디버그 로그")
   log("WARN","워닝 로그")
   log(level = "ERROR", message = "에러 로그")
}

