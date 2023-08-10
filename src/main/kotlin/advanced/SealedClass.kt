package advanced

sealed class AbstractDeveloper {
    abstract val name : String
    abstract fun code(language: String)
}

data class FrontEndDeveloper(override val name: String ) : AbstractDeveloper(){
    override fun code(language: String) {
        println("저는 프론트엔드 개발자입니다 ${language}를 사용합니다.")
    }
}

data class ServerDeveloper(override val name: String ) : AbstractDeveloper(){
    override fun code(language: String) {
        println("저는 서버 개발자입니다 ${language}를 사용합니다.")
    }
}

object OtherDeveloper : AbstractDeveloper() {
    override val name: String = "익명"

    override fun code(language: String) {
        TODO("Not yet implemented")
    }

}

data class AndroidDeveloper(override val name: String) : AbstractDeveloper(){
    override fun code(language: String) {
        println("저는 안드로이드 개발자입니다 ${language}를 사용합니다.")
    }
}

object DeveloperPool{
    val pool = mutableMapOf<String, AbstractDeveloper>()

    fun add(developer: AbstractDeveloper) = when(developer){
        is FrontEndDeveloper -> pool[developer.name] = developer
        is ServerDeveloper -> pool[developer.name] = developer
        is AndroidDeveloper -> pool[developer.name] = developer
        is OtherDeveloper -> println("지원하지 않은 개발자입니다.")
    }

    fun get(name : String) = pool[name]
}

fun main(){
    val serverDeveloper = ServerDeveloper(name = "sim")
    DeveloperPool.add(serverDeveloper)

    val frontEndDeveloper = FrontEndDeveloper(name = "kyumin")
    DeveloperPool.add(frontEndDeveloper)

    val androidDeveloper = AndroidDeveloper(name = "android")
    DeveloperPool.add(androidDeveloper)

    println(DeveloperPool.get("sim"))
    println(DeveloperPool.get("kyumin"))
    println(DeveloperPool.get("android"))
}

