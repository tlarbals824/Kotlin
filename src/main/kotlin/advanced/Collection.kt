package advanced

import java.util.LinkedList
import java.util.stream.Collectors

fun main(){
    val currencyList = listOf("달려","유로","원")

    val mutableCurrencyList = mutableListOf<String>().apply {
        add("달려")
        add("유로")
        add("원")
    }

    val numberSet = setOf(1, 2, 3, 4)

    val mutableSet = mutableSetOf<Int>().apply {
        add(1)
        add(2)
        add(3)
        add(4)
    }

    val numberMap = mapOf("one" to 1, "two" to 2)

    val mutableNumberMap = mutableMapOf<String, Int>()
    mutableNumberMap["one"]= 1
    mutableNumberMap["two"]= 2
    mutableNumberMap["three"]= 3

    val numberList: List<Int> = buildList {
        add(1)
        add(2)
        add(3)
    }

    val linkedList = LinkedList<Int>().apply {
        add(1)
        add(2)
        add(3)
    }

    val iterator = currencyList.iterator()
    while(iterator.hasNext()){
        println(iterator.next())
    }

    println("===================")

    for (currency in currencyList) {
        println(currency)
    }

    println("===================")

    currencyList.forEach{ println(it) }

    println("===================")

    val lowerList = listOf("a", "b", "c", "d")
    val upperList = mutableListOf<String>()

    for (lowerCase in lowerList) {
        upperList.add(lowerCase.uppercase())
    }

    println(upperList)

    println("===================")

    val upperList2 = lowerList.map { it.uppercase() }
    println(upperList2)

    println("===================")

    val filteredList = upperList.filter { it == "A" || it == "C" }
    println(filteredList)

    println("===================")

    val filteredList2 = upperList.stream().filter { it == "A" || it == "C" }
    println(filteredList2)

    println("===================")

    val filteredList3 = upperList.stream()
        .filter { it == "A" || it == "C" }
        .collect(Collectors.toList())
    println(filteredList3)

    println("===================")

    val filteredList4 = upperList
        .asSequence()
        .filter { it == "A" || it == "C" }
    println(filteredList4)

    println("===================")

    val filteredList5 = upperList
        .asSequence()
        .filter { it == "A" || it == "C" }
        .toList()
    println(filteredList5)
}
