package me.otavro.collection

fun main() {
    val joao = Funcionario("Joao", 1000.0, "CLT")
    val maria = Funcionario("Maria", 500.0, "PJ")
    val pedro = Funcionario("Pedro", 2500.0, "CLT")

    println("------LISTA------")
    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

    println("------------")
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }
    println("------------")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println("-----SET-----")
    val funcionariosSet = mutableSetOf(joao)
    funcionariosSet.forEach { println(it) }

    println("------------")
    funcionariosSet.add(pedro)
    funcionariosSet.add(maria)
    funcionariosSet.forEach { println(it) }

    println("------------")
    funcionariosSet.remove(maria)
    funcionariosSet.forEach { println(it) }

}