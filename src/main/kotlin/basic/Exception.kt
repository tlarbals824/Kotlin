package basic

import kotlin.Exception

fun main() {
    Thread.sleep(1)

    try{
        Thread.sleep(1)
    }catch (e : Exception){
        println("에러 발생")
    }

    try{
        throw Exception();
    }catch (e : Exception){
        println("에러 발생")
    } finally {
        println("finally 실행")
    }

    val a = try{
        "1234".toInt();
    }catch (e : Exception){
        println("에러 발생")
    }
    println(a)

//    throw Exception("예외 발생!!")

//    failFast("에러발생!!")

    val b : String? = null
    val c: String = b ?: failFast("b is null")
}

fun failFast(message: String) :Nothing{
    throw IllegalArgumentException(message)
}