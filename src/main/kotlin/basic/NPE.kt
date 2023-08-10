package basic

fun main() {
//    val a : String = null // 컴파일 오류

//    var b: String = "abc"
//    b = null // 컴파일 오류

    var a: String? = null // nullable
    println(a?.length)

    val b :Int = if(a!=null) a.length else 0
    println(b)

    // 엘비스 연산자
    val c = a?.length ?: 0
    println(c)

//    throw NullPointerException()

    val d: String? = null
    val e = d!!.length // NullPointerException 발생
}