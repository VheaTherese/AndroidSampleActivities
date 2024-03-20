package com.capstone.samplactivities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ReceiveDataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receive_data)

        val firstName = intent.getStringExtra("FIRSTNAME_DATA")
        val lastName = intent.getStringExtra("LASTNAME_DATA")
        val password = intent.getStringExtra("PASSWORD_DATA")

        val firstNameDisplay = findViewById<TextView>(R.id.firstNameDisplay).apply {
            text = "First Name: " + firstName
        }
        val lastNameDisplay = findViewById<TextView>(R.id.lastNameDisplay).apply {
            text = "Last Name: " + lastName
        }
        val passwordDisplay = findViewById<TextView>(R.id.passwordDisplay).apply {
            text = "Password Name: " +password
        }
    }
}

