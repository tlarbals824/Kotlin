package advanced

class HelloBot{
//    var greeting : String? = null
    val greeting : String by lazy(LazyThreadSafetyMode.NONE) {
        println("초기화 로직 수행")
        getHello()
    }
    fun sayHello() = println(greeting)
}

fun getHello() = "안녕하세요"

fun main(){
    val helloBot = HelloBot()

//    helloBot.greeting = getHello()
    helloBot.sayHello()
    helloBot.sayHello()
    helloBot.sayHello()
    /**
     * 초기화 로직 수행
     * 안녕하세요
     * 안녕하세요
     * 안녕하세요
     */
}