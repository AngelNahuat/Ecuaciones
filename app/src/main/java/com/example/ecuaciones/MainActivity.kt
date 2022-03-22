package com.example.ecuaciones

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        var usu="usuario"
        var contra="contraseña"

        var txtusu=findViewById<EditText>(R.id.txtusu)
        var txtxpass=findViewById<EditText>(R.id.txtxcontra)

        var blogin=findViewById<Button>(R.id.blogin)

        blogin.setOnClickListener{

            if(txtusu.text.toString()==usu&&txtxpass.text.toString()==contra){
                var intent= Intent(this, Login::class.java)
                intent.putExtra("mensaje", "Sesión iniciada con éxito")
                startActivity(intent)
            }
            else{
                Toast.makeText(this,"Los datos son incorrectos",Toast.LENGTH_SHORT).show()
            }
        }
    }
}