package me.otavro.collection

fun main(){
    val nomes = Array(3){""}
    nomes[0] = "Maria"
    nomes[1] = "Zeca"
    nomes[2] = "João"
    for(nome in nomes){
        println(nome)
    }
    println("- Sort - ")
    nomes.sort()
    nomes.forEach {
        println(it)
    }

    val nomes2 = arrayOf("Maria", "Zeze", "Pedro")
    println("- Nomes 2 - ")
    nomes2.sort()
    nomes2.forEach {
        println(it)
    }
}