package com.example.uts201804013

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_login: Button = findViewById(R.id.btn_login)
        val username: TextView = findViewById(R.id.user)

        btn_login.setOnClickListener{
            val Bundle = Bundle()
            Bundle.putString("uname", username.text.toString())
            val intent = Intent (this, Home::class.java)
            intent.putExtras(Bundle)
            startActivity(intent)
        }
    }

}