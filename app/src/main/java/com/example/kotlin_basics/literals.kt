package com.example.kotlin_basics

fun main(){
    ///Lambda Expressions(concise way to write anonymous function)
    //Basic lambda expression: {parameters -> body}

    //with parameter and return type
    val add1: (Int,Int) -> Int = { a,b -> a+b}
    val result = add1(2,3)
    println(result)

    //with parameter no return value
    val add2: (Int,Int) -> Unit = { a,b -> println(a+b)}
    add2(2,3)

    //no parameter but with return value
    val add3: ()->String = {"Hello"}
    val result2 = add3()
    println(result2)

    //no parameter no return value
    val add4: ()->Unit = { println("hello") }
    add4()

    //Direct use of lambda expression
    println({a:Int,b:Int -> a*b}(3,5))


    ///Anonymous Function: A function without a name

    val number = listOf(1,2,3,4,5)
    //anonymous function to square a number

    val square = fun(a:Int):Int { return a*a }

    val squaredNumber = number.map(square)
    println(squaredNumber)
//
//    fun hi(a:Int,b:Int):Int {
//        return a+b
//    }

    //types of anonymous function
    //parameter and return value
    val multiply = fun(a:Int,b:Int):Int {return a*b}
    println(multiply(5,6))
    //parameter no return value
    val multiply2 = fun(a:Int,b:Int){ println(a*b) }
    multiply2(5,6)
    //no parameter but return value
    val multiply3 = fun():Int { return 5*6 }
    println(multiply3())
    //no parameter no return value
    val multiply4 = fun(){ println(5*6) }
    multiply4()

    val addresult = operateOnNumber(5,6){a,b->a+b}
    println(addresult)
    val multiplyresult = operateOnNumber(5,6){a,b->a*b}
    println(multiplyresult)

    //it keyword
    //for single parameter
    val squaredNumber2 = number.map{it*it}
    println(squaredNumber2)

}


//Higher order function: A function that takes another function as an argument or returns a function
fun operateOnNumber(a:Int,b:Int,operation:(Int,Int)->Int):Int{
    return operation(a,b)
}