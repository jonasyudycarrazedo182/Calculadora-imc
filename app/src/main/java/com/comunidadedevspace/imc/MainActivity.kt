package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

// recuperar os componentes EdiText
// criar uma variavel e associar(associar) o componente de UI<TextInputEditText>
// recuperar o botao da tela
// Colocar acao no botao SetOnClinkListerner
// Recuperar o texto digitado no edt peso


    val edtpeso = findViewById<TextInputEditText>(R.id.edt_peso)
    val edtAltura = findViewById<TextInputEditText>(R.id.edt_altura)

    val btnCalcular = findViewById<Button>(R.id.btn_calcular)


    btnCalcular.setOnClickListener {
        val peso: Float = edtpeso.text.toString().toFloat()
        val altura = edtAltura.text.toString().toFloat()

        val alturaQ2 = altura * altura
        val resultado = peso /alturaQ2

        println("Roque acao do botao " + resultado)



    }

    }
}














