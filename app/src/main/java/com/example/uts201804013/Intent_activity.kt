package com.example.uts201804013

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class Intent_activity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        val edit_nim: EditText = findViewById(R.id.edit_nim)
        val edit_nama: EditText = findViewById(R.id.edit_nama)
        val edit_nomor: EditText = findViewById(R.id.edit_nomor)
        val edit_email: EditText = findViewById(R.id.edit_email)
        val edit_hobi: EditText = findViewById(R.id.edit_hobi)
        val btn_send: Button = findViewById(R.id.btn_kirim)



        btn_send.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("nim",edit_nim.text.toString())
            bundle.putString("nama",edit_nama.text.toString())
            bundle.putString("nomor",edit_nomor.text.toString())
            bundle.putString("email",edit_email.text.toString())
            bundle.putString("hobi",edit_hobi.text.toString())
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }


    }
}