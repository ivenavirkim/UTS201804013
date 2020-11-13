package com.example.uts201804013


import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val t_nim: TextView = findViewById(R.id.tampil_nim)
        val t_nama: TextView = findViewById(R.id.tampil_nama)
        val t_nomor: TextView = findViewById(R.id.tampil_nomor)
        val t_email: TextView = findViewById(R.id.tampil_email)
        val t_hobi: TextView = findViewById(R.id.tampil_hobi)
        val btn_klik: Button = findViewById(R.id.btn_klik)

        val bundle = intent.extras
        t_nim.setText(bundle?.getString("nim"))
        t_nama.setText(bundle?.getString("nama"))
        t_nomor.setText(bundle?.getString("nomor"))
        t_email.setText(bundle?.getString("email"))
        t_hobi.setText(bundle?.getString("hobi"))


        btn_klik.setOnClickListener {
            val panggil_nomor = t_nomor.text.toString()
            val Dial = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$panggil_nomor"))
            startActivity(Dial)
        }
    }
}