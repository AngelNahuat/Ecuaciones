package com.example.ecuaciones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Cuadratica : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cuadratica)


        var bcal = findViewById<Button>(R.id.bcalcular)

        bcal.setOnClickListener {
            var a1 = findViewById<EditText>(R.id.a1).getText().toString().toDouble()
            var b1 = findViewById<EditText>(R.id.b1).getText().toString().toDouble()
            var c1 = findViewById<EditText>(R.id.c1).getText().toString().toDouble()
            var a2 = findViewById<EditText>(R.id.a2).getText().toString().toDouble()
            var b2= findViewById<EditText>(R.id.b2).getText().toString().toDouble()
            var c2 = findViewById<EditText>(R.id.c2).getText().toString().toDouble()


            var txX = findViewById<TextView>(R.id.txX)
            var txY = findViewById<TextView>(R.id.txY)

            var r = (a1*b2) - (a2*b1)
            var x1=c1/(a1-b1)

            var rx = (c1*b2) - (c2*b1)
            var x = rx/r

            var ry = (a1*c2) - (a2*c1)
            var y = ry/r
            x.toString()
            y.toString()
            if((x.toString().equals("NaN") || x.toString().equals("Infinity")) && (y.toString().equals("NaN") || y.toString().equals("Infinity"))){
                txX.setText("Sin Solución")
                txY.setText("Sin Solución")
            }else{
                txX.setText(x.toString())
                txY.setText(y.toString())
            }
        }
    }
}