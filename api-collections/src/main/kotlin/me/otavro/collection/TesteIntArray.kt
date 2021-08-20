package me.otavro.collection

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 5
    values[2] = 14
    values[3] = 3
    values[4] = 2

    for (valor in values){
        println(valor)
    }
    values.forEach {valor->
        println(valor)
    }
    // Index
    for(index in values.indices){
        println(values[index])
    }
    print("Array Ordenado")
    values.sort()
    for(valor in values){
        println(valor)
    }

}