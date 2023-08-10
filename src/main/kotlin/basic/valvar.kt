package basic

fun main() {
    val a : Int = 1

    val b = 1 // 타입 추론

    val c : Int
    c = 3

//    val d
//    d = 123

    // val(value) 재할당 불가(immutable)
    // var(variable) 재할당 가능(mutable)

    var e : String = "Hello"
    e = "World"

    var f = 123 // Int 타입 고정
//    f = "hi" // 타입이 고정되면 타입 변경하지 못함
}