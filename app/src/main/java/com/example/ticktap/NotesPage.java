package com.example.ticktap;

import android.os.Bundle;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.Button;
import androidx.activity.ComponentActivity;

public class NotesPage extends ComponentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notes_page);

        // Find UI elements
        ImageView homeIcon = findViewById(R.id.home_icon);
        Button addNotesButton = findViewById(R.id.add_notes_button);
        ImageView settingsIcon = findViewById(R.id.settings_icon);

        // Home icon click listener - go back to Dashboard
        homeIcon.setOnClickListener(view -> {
            Intent intent = new Intent(NotesPage.this, Dashboard.class);
            startActivity(intent);
        });

        // Add Notes button click listener - go to Add Note page
        addNotesButton.setOnClickListener(view -> {
            Intent intent = new Intent(NotesPage.this, AddNotePage.class);
            startActivity(intent);
        });

        // Settings icon click listener - go to SettingsPage
        settingsIcon.setOnClickListener(view -> {
            Intent intent = new Intent(NotesPage.this, SettingsPage.class);
            startActivity(intent);
        });
    }
}

