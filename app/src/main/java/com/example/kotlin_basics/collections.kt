package com.example.kotlin_basics

fun main(){


    ///list
    //Immutable: Read only list
    val items1= listOf("apple","banana","orange")
    //Accessing Element
    for(items in items1){
        println(items)
    }

    //Mutable list: Support both read and write
    val items2 = mutableListOf("apple","banana","orange")
    println(items2)
    //add
    items2.add("kiwi")
    println(items2)
    //delete
    items2.removeAt(0)
    println(items2)
    items2.remove("kiwi")
    println(items2)
    //update
    items2[0] = "mango"
    println(items2)
    //same for arraylistof
    val items3 = arrayListOf("apple","banana","orange")
    println(items3)


    ///Sets (  ======================>>>>     No dulicate element)
    //immutable sets

    val items4 = setOf("apple","banana","orange")

    for (items in items4){
        println(items)
    }

    //mutable sets
    val items5 = mutableSetOf("apple","banana","orange")
    println(items5)
    //add
    items5.add("kiwi")
    println(items5)
    //remove
    items5.remove("apple")
    println(items5)

    ///Maps
    //Immutable map (key value pair)(keys are unique)(values can be duplicate)
    val items6 = mapOf("one" to 1,"two" to 2,"three" to 3)
    for (items in items6){
        println(items)
    }
    println(items6["one"])
    println(items6.keys)
    println(items6.values)

    //mutable map
    val items7 = mutableMapOf("one" to 1,"two" to 2,"three" to 3)
    println(items7)
    //add
    items7["four"] = 4
    println(items7)
    //update
    items7["one"] = 10
    println(items7)
    //remove
    items7.remove("one")
    println(items7)

    for ((a,b) in items7){
        println("$a = $b")
    }



    }



