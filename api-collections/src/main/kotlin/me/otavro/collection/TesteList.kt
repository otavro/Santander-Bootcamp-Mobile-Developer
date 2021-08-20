package me.otavro.collection

fun main() {
    val joao = Funcionario("Joao", 1000.0, "CLT")
    val maria = Funcionario("Maria", 500.0, "PJ")
    val pedro = Funcionario("Pedro", 2500.0, "CLT")

    val funcionarios = listOf(joao, maria, pedro)
    funcionarios.forEach{println(it)}

    println("------------")
    println(funcionarios.find{it.nome == "Maria"})

    println("------------")
    funcionarios
        .sortedBy { it.salario }
        .forEach{println(it)}

    println("------------")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach{println(it)}

}

data class Funcionario(
    val nome:String,
    val salario:Double,
    val tipoContratacao: String
){
    override fun toString(): String = """
        Nome: $nome
        Salario: $salario
    """.trimIndent()
}