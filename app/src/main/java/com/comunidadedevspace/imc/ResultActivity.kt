package com.comunidadedevspace.imc

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

const val KEY_RESULT_IMC = "ResultActivity.KEY_IMC"

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)

        val result = intent.getFloatExtra(KEY_RESULT_IMC, 0f)

        val tvResult = findViewById<TextView>(R.id.tv_result)
        val tvClassificacao = findViewById<TextView>(R.id.tv_classificacao)
        tvResult.text = result.toString()

        val ( classificacao, cor) = when {
            result < 18.5f -> "MAGRO" to R.color.red
            result > 18.5f && result <= 24.9f -> "NORMAL" to R.color.green_400
            result > 25.0f && result <= 29.9f -> "SOBREPESO" to R.color.yellow
            result > 30f && result <= 39.9f -> "OBEDIDADE" to R.color.red
            else -> "OBESIDADE GRAVE" to R.color.red
        }

        tvClassificacao.text = classificacao
        tvClassificacao.setTextColor(ContextCompat.getColor(this, cor))

    }
}

