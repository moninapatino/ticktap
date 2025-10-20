package com.example.ticktap;

import android.os.Bundle;
import android.content.Intent;
import android.widget.ImageView;
import androidx.activity.ComponentActivity;

public class Dashboard extends ComponentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

        // Find UI elements
        ImageView notesIcon = findViewById(R.id.notes_icon);
        ImageView addIcon = findViewById(R.id.add_icon);

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
    }
}