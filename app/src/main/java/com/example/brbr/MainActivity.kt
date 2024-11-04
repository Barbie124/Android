package com.example.brbr

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etEmail: EditText = findViewById(R.id.etEmail)
        val etMessage: EditText = findViewById(R.id.etMessage)
        val btnSendMessage: Button = findViewById(R.id.btnSendMessage)

        btnSendMessage.setOnClickListener {
            val email = etEmail.text.toString()
            val message = etMessage.text.toString()

            if (validateInput(email, message)) {
                val intent = Intent(this, SecondActivity::class.java).apply {
                    putExtra("email", email)
                    putExtra("message", message)
                }
                startActivity(intent)
            }
        }
    }

    private fun validateInput(email: String, message: String): Boolean {
        return when {
            email.isEmpty() || !email.contains("@") -> {
                etEmail.error = "Invalid email address"
                false
            }
            message.isEmpty() || message.length > 250 -> {
                etMessage.error = "Message must be within 250 characters"
                false
            }
            else -> true
        }
    }
}
