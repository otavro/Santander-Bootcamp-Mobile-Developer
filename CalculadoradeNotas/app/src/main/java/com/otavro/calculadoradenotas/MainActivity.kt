package com.otavro.calculadoradenotas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular = bt_calcular
        val resultado = tv_resultado

        btCalcular.setOnClickListener{
            val nota1 = Integer.parseInt(tx_nota1.text.toString())
            val nota2 = Integer.parseInt(tx_nota2.text.toString())
            val media = (nota1 + nota2) / 2
            val faltas = Integer.parseInt(tx_faltas.text.toString())

            if(media >= 6 && faltas <= 10)
            {
                resultado.setText(("Aluno foi Aprovado!\nNota Final: "+ media+
                        "\nFaltas: " + faltas))
                resultado.setTextColor(Color.GREEN)
            }
            else{
                resultado.setText(("Aluno foi Reprovado!\nNota Final: "+ media+
                        "\nFaltas: " + faltas))
                resultado.setTextColor(Color.RED)
            }
        }
    }
}