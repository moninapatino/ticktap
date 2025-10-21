package com.example.ticktap;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import androidx.activity.ComponentActivity;

// Activity for the Settings page, handling all navigation and main setting clicks.
public class SettingsPage extends ComponentActivity {

    private static final String TAG = "SettingsPage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Assuming your settings layout is named R.layout.settings_page
        // Note: If you still see "Cannot resolve symbol 'settings_page'", you need to confirm
        // that R.layout.settings_page is the correct name for your layout file.
        setContentView(R.layout.settings_page);

        // --- 1. Find Navigation Icons (Footer and Header) ---
        // Footer Icons
        ImageView homeIcon = findViewById(R.id.home_icon);
        ImageView notesIcon = findViewById(R.id.notes_icon);
        ImageView addIcon = findViewById(R.id.add_icon);
        ImageView calendarIcon = findViewById(R.id.calendar_icon);
        // The settings icon is not typically clickable on the Settings page itself.

        // --- 2. Removed Unnecessary UI Elements ---
        // The placeholders for specific settings controls and the non-clickable profile header
        // icon have been removed to resolve compilation errors.

        // --- 3. Set Footer Navigation Listeners ---

        // Home icon click listener -> Dashboard (Home Page)
        homeIcon.setOnClickListener(view -> {
            startActivity(new Intent(SettingsPage.this, Dashboard.class));
        });

        // Notes icon click listener -> Notes Page
        notesIcon.setOnClickListener(view -> {
            startActivity(new Intent(SettingsPage.this, NotesPage.class));
        });

        // Add icon click listener - go to AddTaskPage
        addIcon.setOnClickListener(view -> {
            startActivity(new Intent(SettingsPage.this, AddTaskPage.class));
        });

        // Calendar icon click listener -> Deadlines/Calendar Page
        calendarIcon.setOnClickListener(view -> {
            startActivity(new Intent(SettingsPage.this, CalendarPage.class));
        });


    }
}
