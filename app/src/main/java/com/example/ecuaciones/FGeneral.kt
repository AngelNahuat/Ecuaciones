package com.example.ecuaciones

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class FGeneral : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fgeneral)

        var a: Double
        var b: Double
        var c: Double
        var x1: Double
        var x2: Double


        var txta = findViewById<EditText>(R.id.txta)
        var txtb = findViewById<EditText>(R.id.txtb)
        var txtc = findViewById<EditText>(R.id.txtc)
        var btnecu = findViewById<Button>(R.id.bResol)



        var txtresol = findViewById<TextView>(R.id.txtResol)
        btnecu.setOnClickListener {
            a = txta.text.toString().toDouble()
            b = txtb.text.toString().toDouble()
            c = txtc.text.toString().toDouble()
            var resul1 = ((b * b) - 4 * (a * c))
            if (resul1 < 0) {
                txtresol.setText("No se puede realizar porque los valores dan como resultado un numero negativo")
                txtresol.setTextColor(Color.parseColor("#ff0000"))
            } else if (resul1 === 0.0) {

                x1 = (-b) / (2 * a)
                x2 = x1
                var rounded=String.format("%.2f",x1)
                var rounded1=String.format("%.2f",x2)
                txtresol.setText("x1=$rounded \n x2=$rounded1")
                txtresol.setTextColor(Color.parseColor("#ff0000"))
            } else if (resul1 > 0.0) {
                x1 = (-b + Math.sqrt(resul1)) / (2 * a)
                x2 = (-b - Math.sqrt(resul1)) / (2 * a)
                var rounded=String.format("%.2f",x1)
                var rounded1=String.format("%.2f",x2)
                txtresol.setTextColor(Color.parseColor("#ff0000"))
                txtresol.setText("x1=$rounded \n x2=$rounded1")


            }
    }}
}