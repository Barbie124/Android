package com.example.brbr

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val tvEmail: TextView = findViewById(R.id.tvEmail)
        val etMessageReceived: EditText = findViewById(R.id.etMessageReceived)
        val btnClear: Button = findViewById(R.id.btnClear)

        // Get email and message from intent
        val email = intent.getStringExtra("email")
        val message = intent.getStringExtra("message")

        tvEmail.text = email
        etMessageReceived.setText(message)

        // Clear button logic
        btnClear.setOnClickListener {
            tvEmail.text = ""
            etMessageReceived.setText("")
        }
    }
}
