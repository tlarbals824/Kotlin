package advanced

import java.util.Collections

val printHello: () -> Unit = { println("Hello") }

fun call(block: () -> Unit) {
    block()
}

fun printNo() {
    println("NO!")
}

val printMessage: (String) -> Unit = { message: String -> println(message) }
//val printMessage : (String) -> Unit = {message -> println(message) }
//val printMessage : (String) -> Unit = {println(it) }

val plus: (Int, Int) -> Int = { a, b -> a + b }

fun <T> forEachStr(collections: Collection<T>, action: (T) -> Unit) {
    for (item in collections) {
        action(item)
    }
}

//fun outerFunc() : () -> Unit {
//    return fun(){
//        println("이것은 익명함수")
//    }
//    return { println("이것은 익명함수") }
//}
fun outerFunc(): () -> Unit = { println("이것은 익명함수") }

val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }
val sum2 = { x: Int, y: Int -> x + y }

val callReference = ::printHello

fun main() {
    val list = mutableListOf(printHello)
    println(list[0])
    list[0]()

    call(printHello)

//    val list1 = mutableListOf(printNo) // 컴파일 오류

    printMessage("message")

    val result = plus(1, 3)
    println(result)

    val list1 = listOf("a", "b", "c")

    val printStr: (String) -> Unit = { println(it) }
    forEachStr(list1, printStr)
    println("================")
    forEachStr(list1){
        println(it)
    }

    outerFunc()()

    callReference()()

    val numberList = listOf("1", "2", "3")
    numberList.map{it.toInt()}.forEach{ println(it) }
    println("================")
    numberList.map(String::toInt).forEach(::println)
}
