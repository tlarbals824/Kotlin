package advanced

// f((1,3)) = 1 + 3 = 4
// f(1,3) = 1 + 3 = 4
fun plus(a:Int, b:Int) = a+b
fun plus(tuple: Tuple) = tuple.a + tuple.b
fun plus(pair : Pair<Int, Int>) = pair.first + pair.second
data class Tuple(val a: Int, val b: Int)

fun main(){
    println(plus(1,3))

    val plus1 = plus(Tuple(1, 3))
    println(plus1)

    val pair = Pair("A", 1)
//    pair.first = "B" // pair는 불변임

    val newPair = Pair("A", 1).copy(first = "B")
    println(newPair)

    val second = newPair.component2()
    println(second)

    val list = newPair.toList() // 불변 List
    println(list)

    val triple = Triple("A", "B", "C")
    println(triple)

    val newTriple = triple.copy(third = "D")
    println(newTriple)

//    val (a,b,c) = newTriple
    val (a:String, b:String, c:String) = newTriple
    println("$a, $b, $c")

    val list3 = newTriple.toList()
    val (a1,a2,a3) = list3
    println("$a1, $a2, $a3")

    val map = mutableMapOf("심규민" to "학생")
    for((key, value) in map){
        println("${key}의 직업은 ${value}")
    }

}