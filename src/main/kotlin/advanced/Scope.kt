package advanced

class DatabaseClient {
    var url: String? = null
    var username: String? = null
    var password: String? = null

    // DB Boolean
    fun connect(): Boolean {
        println("DB 접속중 ...")
        Thread.sleep(1000)
        println("DB 접속 완료")
        return true
    }
}

class User(val name:String, val password:String){
    fun validate(){
        if(name.isNotEmpty() && password.isNotEmpty()){
            println("검증 성공!")
        }else{
            println("검증 실패")
        }
    }
}


fun main() {

    // let
//    val str : String? = null
    val str: String? = "안녕"

    val result = str?.let {
        println(it)

        1234
    }
    println(result)

    // run
    val connected: Boolean = DatabaseClient().run {
        url = "localhost:3306"
        username = "mysql"
        password = "1234"
        connect()
    }
    println(connected)

    // with
    val str1 = "안녕하세요"
    with(str1) {
        println("length = $length")
    }

    // apply
    val client: DatabaseClient = DatabaseClient().apply {
        url = "localhost:3306"
        username = "mysql"
        password = "1234"
        connect()
    }
    println(client)

    // also
    User(name = "sim", password = "test").also {
        it.validate()
    }
}