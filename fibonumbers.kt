package demo

fun main(args : Array<String>){

    var result = 0

    var last = 1
    var first = 0

    while (result < 200){

        result = last+first
        first = last
        last = result

        println("First: $first, Secound: $last, Result: $result")

    }


}
