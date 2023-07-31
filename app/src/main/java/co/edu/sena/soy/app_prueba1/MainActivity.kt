package co.edu.sena.soy.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        R.id.text1
        //llamar datos
        val imprimir: TextView = findViewById(R.id.text1)
        imprimir.text = "hola tofee"

        //Suma
    }
    fun CalcularPlus(){
        val btnSuma: Button = findViewById(R.id.btnSuma)
        val num1: EditText = findViewById(R.id.TextNumber1)
        val texto=num1.text.toString()
        val int1=texto.toInt()
        val num2: EditText = findViewById(R.id.TextNumber2)
        val texto2=num2.text.toString()
        val int2=texto2.toInt()


        val result: TextView = findViewById(R.id.textResultado)
        result.text="La suma es ${int1+int2}"

        btnSuma.setOnClickListener{CalcularPlus()}
    }
}
