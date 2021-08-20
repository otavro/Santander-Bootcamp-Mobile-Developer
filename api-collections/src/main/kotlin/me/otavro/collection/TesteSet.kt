package me.otavro.collection

fun main() {
    val joao = Funcionario("Joao", 1000.0, "CLT")
    val maria = Funcionario("Maria", 500.0, "PJ")
    val pedro = Funcionario("Pedro", 2500.0, "CLT")

    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach{println(it)}

    println("------------------")
    val funcionarios3 = setOf(maria)
    val resultSub = funcionarios1.subtract(funcionarios2)
    resultSub.forEach{println(it)}

    println("------------------")
    val resultIntersect = funcionarios1.intersect(funcionarios2)
    resultSub.forEach{println(it)}


}