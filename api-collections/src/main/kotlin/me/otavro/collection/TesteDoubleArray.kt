package me.otavro.collection

fun main(){
    val salarios = DoubleArray(3)
    salarios[0] = 100.2
    salarios[1] = 300.5
    salarios[2] = 400.2

    salarios.forEach {
        println(it)
    }
    println("- Aumento -")

    salarios.forEachIndexed{index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach {
        println(it)
    }

    val salarios2 = doubleArrayOf(1500.0, 1250.0, 5000.0)
}