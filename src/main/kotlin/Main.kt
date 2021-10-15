//tailrec fun calculateFactorial (n : Int) : Int {
//    return if (n < 0) 0 else when (n) {
//        0, 1 -> 1
//        else -> n * calculateFactorial(n - 1)
//    }
//}
//val lambdaNum: (Int) -> Int = { i : Int -> i*2}
//
//val add: (Int) -> Int = {i: Int -> i + 2}
//val multiply: (Int) -> Int = {i: Int -> i*3}
//var sum : Int = 0
//
//fun main(){
//    println(totalLength(listOf("Hello", "World", "How", "Are", "You")))
////    val list = listOf("Hello", "World", "!")
//
//
////    println(calculateFactorial(5))
//
////    println(lambdaNum(4))
//
////      println(multiply(add(2)))
//    val list = listOf("A", "B", "C")
//
//    val string =
//    println(list.joinToString())
//
//}
//
//
//
//fun totalLength(strings : List<String>) : Int {return strings.sumOf { it.length }
////    fun totalLength(strings : List<String>) : Int {return strings.map{it.length}.reduce { acc, i -> acc+i }
//}
//*********************************************************************************************************************
//*********************************************************************************************************************

import  kotlinx.coroutines.*
//
//
//suspend fun main() = coroutineScope{
//    launch {
//        delay(1000L)
//        println("tock!")
//    }
//    print("tick, ")
//}

//
//suspend fun main() = coroutineScope {
//    val result = (1..10).map { i : Int -> async { addFive(i) } }
//    var total = result.map{  awaitAll(it) }
//    var sum  =  total.fold(0, Int::plus())
//
//    println(total)
//}

suspend fun addFive(n : Int) : Int {
    delay(5000)
    return n+5
}