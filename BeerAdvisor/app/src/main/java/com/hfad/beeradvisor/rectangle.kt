package com.hfad.beeradvisor

class rectangle (var height:Double, var length: Double){
    var perimeter = (height + length)*2
}
fun main(){
    println("Perimeter is ${rectangle(5.0,2.0).perimeter}")
}