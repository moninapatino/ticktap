package com.example.ticktap;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.activity.ComponentActivity;

public class ProfilePage extends ComponentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Assuming your profile layout is named R.layout.profile_page
        setContentView(R.layout.profile_page);

        // --- 1. Find Navigation Icons (Footer) ---
        ImageView homeIcon = findViewById(R.id.home_icon);
        ImageView notesIcon = findViewById(R.id.notes_icon);
        ImageView addIcon = findViewById(R.id.add_icon);
        ImageView calendarIcon = findViewById(R.id.calendar_icon);
        ImageView settingsIcon = findViewById(R.id.settings_icon);
        // The profile icon is the current screen, usually not linked to itself.

        // --- 2. Set Footer Navigation Listeners ---

        // Home icon click listener -> Dashboard (Home Page)
        homeIcon.setOnClickListener(view -> {
            Intent intent = new Intent(ProfilePage.this, Dashboard.class);
            startActivity(intent);
        });

        // Notes icon click listener -> Notes Page
        notesIcon.setOnClickListener(view -> {
            Intent intent = new Intent(ProfilePage.this, NotesPage.class);
            startActivity(intent);
        });

        // Add icon click listener - go to AddTaskPage
        addIcon.setOnClickListener(view -> {
            Intent intent = new Intent(ProfilePage.this, AddTaskPage.class);
            startActivity(intent);
        });

        // Calendar icon click listener -> Deadlines/Calendar Page
        calendarIcon.setOnClickListener(view -> {
            Intent intent = new Intent(ProfilePage.this, CalendarPage.class);
            startActivity(intent);
        });

        // Settings icon click listener -> Settings Page
        settingsIcon.setOnClickListener(view -> {
            Intent intent = new Intent(ProfilePage.this, SettingsPage.class);
            startActivity(intent);
        });

        // --- 4. Removed Profile Specific Listeners (Log Out) ---
        // Only navigation listeners remain.
    }
}
