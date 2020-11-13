package com.example.uts201804013

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val Bundle = intent.extras
        val a: TextView =findViewById(R.id.View)
        a.setText(Bundle?.getString("uname"))

        val btn_profil: Button =findViewById(R.id.btn_profil)

        btn_profil.setOnClickListener{
            val intent = Intent (this, Profile::class.java)
            startActivity(intent)
        }
        val btn_rycleview: Button =findViewById(R.id.btn_rycleview)

        btn_rycleview.setOnClickListener{
            val intent = Intent (this, ProdukActivity::class.java)
            startActivity(intent)
        }
        val btn_web: Button =findViewById(R.id.btn_web)

        btn_web.setOnClickListener{
            val intent = Intent (this, Web::class.java)
            startActivity(intent)
        }
        val btn_intent: Button =findViewById(R.id.btn_intent)

        btn_intent.setOnClickListener{
            val intent = Intent (this, Intent_activity::class.java)
            startActivity(intent)
        }
    }
}