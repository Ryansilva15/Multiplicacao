package com.example.multiplicacao2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var numero1: EditText
    private lateinit var numero2: EditText
    private lateinit var btnCalcular: Button
    private lateinit var textResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numero1 = findViewById(R.id.editTextNumero1)
        numero2 = findViewById(R.id.editTextNumero2)
        btnCalcular = findViewById(R.id.btnCalcular)
        textResultado = findViewById(R.id.textViewResultado)

        btnCalcular.setOnClickListener {
            val num1 = numero1.text.toString().toDoubleOrNull() ?: 0.0
            val num2 = numero2.text.toString().toDoubleOrNull() ?: 0.0
            val resultado = (num1 * num2).toInt()
            textResultado.text = "Resultado: $resultado"
        }
    }
}
