package advanced

import java.io.FileWriter

fun getStr() : Nothing = throw Exception("예외 발생 기본 값으로 초기화")

fun main(){
    FileWriter("test.txt")
        .use{it.write("Hello Kotlin")}

    val result = try{
        getStr()
    }catch (e : Exception){
        println(e.message)
        "기본값"
    }
    println(result)

    val result2 = runCatching { getStr() }
        .getOrElse {
            println(it.message)
            "기본값"
        }
    println(result2)

    val result3 = runCatching { getStr() }
        .getOrNull()
    println(result3)

    val result4 : Throwable? = runCatching { getStr() }
        .exceptionOrNull()
    result4?.let {
        println(it.message)
//        throw it
    }

    val result5: String = runCatching { getStr() }
        .getOrDefault("기본 값")
    println(result5)

    val result6 = runCatching { getStr() }
        .getOrElse {
            println(it.message)
            "기본값"
        }
    println(result6)

//    val result7 = runCatching { getStr() }
//        .getOrThrow()
//    println(result7)

//    val result8 = runCatching { "안녕" }
//        .map {
//            getStr()
//        }.getOrDefault("기본값")
//
//    println(result8)

    val result8 = runCatching { "안녕" }
        .mapCatching {
            getStr()
        }.getOrDefault("기본값")

    println(result8)

    val result9 = runCatching { "정상" }
        .recover {
            "복구"
        }.getOrNull()
    println(result9)

    val result10 = runCatching { getStr() }
        .recover {
            "복구"
        }.getOrNull()
    println(result10)

    val result11 = runCatching { getStr() }
        .recoverCatching {
            getStr()
        }.getOrDefault("복구")
    println(result11)


}