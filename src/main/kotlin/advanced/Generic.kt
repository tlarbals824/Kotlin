package advanced//class MyGenerics<T>(val t : T){
//
//}

class MyGenerics<out T>(val t:T)

class Bag<T>{
    fun saveAll(
        to : MutableList<in T>,
        from: MutableList<T>,
    ){
        to.addAll(from)
    }
}

fun main(){
//    val generics = MyGenerics<String>("테스트")
    val generics = MyGenerics("테스트") // 타입추론

    val list1 :MutableList<String> = mutableListOf()
    val list2 = mutableListOf<String>()
    val list3 : List<*> = listOf<String>("테스트")

    // PECS : Producer-Extends, Consumer-Super
    // 공변성은 자바 제네릭의 extends 코틀린에선 out
    // 반공변성은 자바 제네릭의 super 코틀린에선 in

    val charGenerics : MyGenerics<CharSequence> = generics


    val bag = Bag<String>()

    bag.saveAll(mutableListOf<CharSequence>(""), mutableListOf<String>(""))
}