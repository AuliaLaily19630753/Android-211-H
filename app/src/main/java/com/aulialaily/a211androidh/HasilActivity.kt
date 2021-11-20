package com.aulialaily.a211androidh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HasilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil)

        val nama = intent.getStringExtra("nama")
        val email = intent.getStringExtra("email")
        val NoHandphone = intent.getStringExtra("NoHandphone")
        val tanggallahir = intent.getStringExtra("tanggallahir")
        val jarak = intent.getIntExtra("jarak",0)

        val namaTextView = findViewById<TextView>(R.id.namaTextView)
        val emailTextView = findViewById<TextView>(R.id.emailTextView)
        val NoHandphoneTextView = findViewById<TextView>(R.id.handphoneTextView)
        val tanggallahirTextView = findViewById<TextView>(R.id.tanggalLahirTextView)
        val jarakTextView = findViewById<TextView>(R.id.jarakTextView)

        namaTextView.setText(nama)
        emailTextView.setText(email)
        NoHandphoneTextView.setText(NoHandphone)
        tanggallahirTextView.setText(tanggallahir)
        jarakTextView.setText(jarak.toString())
    }
}