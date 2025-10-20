package com.example.ticktap;

import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import androidx.activity.ComponentActivity;

public class LoginPage extends ComponentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);

        // Find the login button by its ID in login_page.xml
        Button loginButton = findViewById(R.id.login_button);

        // When clicked, go to Dashboard
        loginButton.setOnClickListener(view -> {
            Intent intent = new Intent(LoginPage.this, Dashboard.class);
            startActivity(intent);
        });
    }
}