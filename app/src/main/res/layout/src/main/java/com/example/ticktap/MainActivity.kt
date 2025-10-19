package com.example.ticktap

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.content.Intent
import android.widget.Button

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome_page)
        val getStartedButton = findViewById<Button>(R.id.getstarted_button)

        // set a click listener
        getStartedButton.setOnClickListener {
            // when clicked, go to SignupActivity
            val intent = Intent(this, SignUpPage::class.java)
            startActivity(intent)
        }
    }
}
