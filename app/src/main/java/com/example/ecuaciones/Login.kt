package com.example.ecuaciones

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var bcuadra=findViewById<Button>(R.id.bResol)
        var sistema=findViewById<Button>(R.id.bResol2)

        bcuadra.setOnClickListener{
            var intent= Intent(this, FGeneral::class.java)

            startActivity(intent)
        }
        sistema.setOnClickListener{
            var intent= Intent(this, Cuadratica::class.java)

            startActivity(intent)
        }

    }
}