package com.example.ticktap;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.activity.ComponentActivity;

public class Dashboard extends ComponentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Assuming your layout is R.layout.homepage
        setContentView(R.layout.homepage);

        // --- 1. Find Navigation Icons (Footer) ---
        // Home icon is implicit (current page)
        ImageView notesIcon = findViewById(R.id.notes_icon);
        ImageView addIcon = findViewById(R.id.add_icon);
        ImageView calendarIcon = findViewById(R.id.calendar_icon);
        ImageView settingsIcon = findViewById(R.id.settings_icon);

        // --- 2. Find Profile Icon (Header) ---
        // This ID was previously confirmed to exist in the XML
        ImageView profileIconHeader = findViewById(R.id.profile_icon);

        // --- 3. Set Footer and Header Navigation Listeners ---

        // Notes icon click listener - go to NotesPage
        notesIcon.setOnClickListener(view -> {
            Intent intent = new Intent(Dashboard.this, NotesPage.class);
            startActivity(intent);
        });

        // Add icon click listener - go to AddTaskPage
        addIcon.setOnClickListener(view -> {
            Intent intent = new Intent(Dashboard.this, AddTaskPage.class);
            startActivity(intent);
        });

        // Calendar icon click listener - go to CalendarPage (Deadlines)
        calendarIcon.setOnClickListener(view -> {
            Intent intent = new Intent(Dashboard.this, CalendarPage.class);
            startActivity(intent);
        });

        // Settings icon click listener - go to SettingsPage (Intentional Target)
        settingsIcon.setOnClickListener(view -> {
            Intent intent = new Intent(Dashboard.this, SettingsPage.class);
            startActivity(intent);
        });

        // Profile Icon click listener (Header) - go to ProfilePage (Intentional Target)
        if (profileIconHeader != null) {
            profileIconHeader.setOnClickListener(view -> {
                Intent intent = new Intent(Dashboard.this, ProfilePage.class);
                startActivity(intent);
            });
        }
    }
}
