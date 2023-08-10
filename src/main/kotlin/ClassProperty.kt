class ClassProperty(val name: String) {

}

class Coffee1(
    val name: String,
    val price: Int,
    val brand: String,
) {

}

class Coffee2(
    var name: String = "",
    var price: Int = 0,
    ) {
    val brand : String
        get() = "스타벅스" // 커스텀 getter

    var quantity : Int = 0
        set(value) {
            if(value > 0){
                field = value
//                quantity = value // 무한 재귀 상태가 됨
            }
        }
}

class EmptyClass


fun main(){
    val coffee2 = Coffee2()
    coffee2.name = "아이스 아메리카노"
    coffee2.price = 2000

    coffee2.quantity = 1

    println("${coffee2.brand} ${coffee2.name} 가격은 ${coffee2.price} 수량은 ${coffee2.quantity}")
}
