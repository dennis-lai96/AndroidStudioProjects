package com.hfad.beeradvisor

fun main(){
    println("Hello World from KOtlin fun main")
    println(sumretinfer(2,3))
    println(printSum(2,3))
    println(printSumRetOmit(2,3 ))
    variables()
    println(ifmaxOf(2,3))
    println(multipleifelse(40))
    println(maxOfExpress(2,3))
    arraylist()
    collection()
    iterateOver()
    forLoop()
    whileLoop()
    whenexpression(2,3,3)
    checkifnumberinrange()
    checkifnumberoutofrange()
    nonnull()
    nullval()
    nullcheck()
    nullsafeoperator()
}

fun printpractice(){
    //print prints its argument to standard output
    print("Hello")
    print("World")
    //println prints its arg and w/ line break

    println("Hello World")
    println(42)

}

//fun w/ 2 int parameters w/ int return type
fun sum(a: Int, b: Int): Int{
    return a + b
}
fun sumretinfer(a: Int, b: Int)= a+ b

fun printSum(a: Int, b: Int): Unit{
    println("sum of $a and $b is ${a + b}")
}

fun printSumRetOmit(a: Int, b: Int){
    println("sum of $a and $b is ${a+b}")
}

fun variables(){
    val a: Int = 1
    val b = 2
    val c: Int
    c = 3
    var x = 5
    println(x)
    x+=1
    println(x)
}

fun ifmaxOf(a:Int, b: Int):Int{
    if (a>b){
        return a
    } else{
        return b
    }
}

fun maxOfExpress(a:Int, b:Int)= if (a>b)a else b

fun multipleifelse(number:Int):String {
    val result = if (number<0){
        "less than 0"
    }else if (number in 0..9){
        "In between 0 and 9"
    } else if (number in 10..99){
        "In between 10 to 99"
    }else{
        "more than 100"
    }
    return result
}
fun arraylist(){
    val arrayList=ArrayList<String>(5)
    arrayList.add("Programming")
    arrayList.add("MObile")
    arrayList.add("Security")
    arrayList.add("Usable")
    arrayList.add("Learn")
    for (i in arrayList){
        println(i)
    }
}
fun collection(){
    val items=listOf("apple","banana","kiwifruit")
    for (item in items){
        println(item)
    }
    when{
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }
    val fruits = listOf("banana","avocado", "apple", "kiwifruit")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map{it.uppercase()}
        .forEach{println(it)}
}

fun iterateOver(){
    for (x in 1..5){
        print(x)
    }
    for (x in 1..10 step 2){
        print(x)
    }
    for (x in 9 downTo 0 step 3){
        print(x)
    }
}
fun forLoop(){
    val items = listOf("apple","banana","kiwifruit")
    for (item in items){
        println(item)
    }
    for (index in items.indices){
        println("item at $index is ${items[index]}")
    }

}
fun whileLoop(){
    val items=listOf("apple","banana","kiwifruit")
    var index = 0
    while (index< items.size){
        println("item at $index is ${items[index]}")
        index++
    }
}

fun whenexpression(a:Int, b:Int,condition:Int){
    val result = when (condition) {
        1 -> a + b
        2 -> a - b
        3 -> a * b
        4 -> a / b
        else -> "no operation"
    }
    println(result)
}

fun checkifnumberinrange(){
    val x = 10
    val y= 9
    if (x in 1..y+1){
        print("fits in range")
    }
}
fun checkifnumberoutofrange(){
    val list = listOf("a","b","c")
    if (-1 !in 0..list.lastIndex){
        println("-1 i s out of range")
    }
    if (list.size !in list.indices){
        println("list size is out of valid list indices range, too")
    }
}
fun nullval(){
    var apival: String="cs481"

    print("String length "+apival.length)

}
fun nonnull(){
    var apival:String?="cs481"
}

fun nullcheck(){
    var apival : String? = "cs481"
    if (apival!=null&&apival.length>0){
        println("String length : ${apival.length}")
    } else {
        println("Strign is empty")
    }

    apival = null
    println(apival)
    if (apival!=null){
        println("String length is: ${apival.length}")

    }else {
        println("String is empty")
    }
}

fun nullsafeoperator(){
    var apival: String? = "cs481"
    println(apival?.length)
    apival = null
    println(apival?.length)

}

fun sumlamda(a:Int,b:Int):Int{
    return a+b
}
val lamdafunct:(Int, Int)->Int={a,b->a+b}
fun sumwithlambda(a:Int,b:Int,myFunc:(Int,Int)->Int){
    var result = myFunc(a,b)
    println("Lambda output"+ result)
}
