package basic

fun ifelse() {
    val job = "Software Developer"

    if (job == "Software Developer") {
        println("개발자")
    } else {
        println("비개발자")
    }

    val age: Int = 10

    val str = if (age > 10) {
        "성인"
    } else {
        "아이"
    }


    val a = 1
    val b = 2
    val c = if (b > a) b else a

}

fun When(){
    val day = 2
    val result = when(day){
        1 -> "월요일"
        2 -> "화요일"
        3 -> "수요일"
        4 -> "목요일"
        5 -> "금요일"
        6 -> "토요일"
        7 -> "일요일"
        else -> "에러"
    }

    println(result);
}

fun forloop(){
    for(i in 0..3){
        println(i)
    }

    for(i in 0 until 3){
        println(i)
    }

    for(i in 0..6 step 2){
        println(i)
    }

    for(i in 3 downTo 1){
        println(i)
    }

    val number = arrayOf(1,2,3)
    for(i in number){
        println(i)
    }

}

fun whileloop(){
    var x = 5

    while(x > 0){
        println(x)
        x--
    }
}