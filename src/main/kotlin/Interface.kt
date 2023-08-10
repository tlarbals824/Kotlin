class Product(val name : String, val price : Int)

interface Wheel {
    fun roll()
}

interface Cart : Wheel{

    var coin: Int
    val weight: String
        get() = "20KG"

    fun add(product: Product)

    fun rent(){
        if(coin > 0)
            println("카트를 대여합니다.")
    }

    fun printId() = println("1234")

    override fun roll() {
        println("카트가 굴러갑니다.")
    }
}

interface Order{
    fun add(product: Product){
        println("${product.name} 주문이 완료되었습니다.")
    }

    fun printId() = println("5678")
}

class MyCart(override var coin: Int) : Cart, Order{
    override fun add(product: Product) {
        if(coin <=0) println("코인을 넣어주세요")
        else println("${product.name}이(가) 카트에 추가됐습니다.")

        super.add(product)
    }

    override fun printId() {
        super<Order>.printId();
    }
}

fun main(){
    val cart = MyCart(coin = 100)
    cart.rent()
    cart.printId()
    cart.roll()
    cart.add(Product(name = "장난감", price = 1000))

    val cart2 = MyCart(coin = 0)
    cart2.rent()
    cart2.add(Product(name = "장난감", price = 1000))
}