package com.capstone.samplactivities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SubmitDataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_submit_data)

        val submitButton = findViewById<Button>(R.id.submitBtn)
        submitButton.setOnClickListener {
            callActivity()
        }
    }

    private fun callActivity() {
        val firstNameField = findViewById<EditText>(R.id.firstName)
        val lastNameField = findViewById<EditText>(R.id.lastName)
        val passwordField = findViewById<EditText>(R.id.password)

        val firstName = firstNameField.text.toString()
        val lastName = lastNameField.text.toString()
        val password = passwordField.text.toString()

        val Intent = Intent(this,ReceiveDataActivity::class.java).also {
            it.putExtra("FIRSTNAME_DATA", firstName)
            it.putExtra("LASTNAME_DATA", lastName)
            it.putExtra("PASSWORD_DATA", password)

            startActivity(it)
        }
    }
}