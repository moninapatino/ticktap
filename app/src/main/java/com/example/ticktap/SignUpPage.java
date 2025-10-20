package com.example.ticktap;

import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import androidx.activity.ComponentActivity;


public class SignUpPage extends ComponentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_page);

        // Find the button by its ID in signup_page.xml
        Button registerButton = findViewById(R.id.register_button);

        // When clicked, go to LoginPage
        registerButton.setOnClickListener(view -> {
            Intent intent = new Intent(SignUpPage.this, LoginPage.class);
            startActivity(intent);
        });
    }
}