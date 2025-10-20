package com.example.ticktap;

import android.os.Bundle;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.activity.ComponentActivity;

public class AddNotePage extends ComponentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_note_page);

        // Find UI elements
        ImageView backArrow = findViewById(R.id.back_arrow);
        ImageView homeIcon = findViewById(R.id.home_icon);
        ImageView notesIcon = findViewById(R.id.notes_icon);
        Button addNoteButton = findViewById(R.id.add_note_button);
        EditText titleInput = findViewById(R.id.title_input);
        EditText contentInput = findViewById(R.id.content_input);

        // Back arrow click listener - go back to Notes page
        backArrow.setOnClickListener(view -> {
            Intent intent = new Intent(AddNotePage.this, NotesPage.class);
            startActivity(intent);
        });

        // Home icon click listener - go to Dashboard
        homeIcon.setOnClickListener(view -> {
            Intent intent = new Intent(AddNotePage.this, Dashboard.class);
            startActivity(intent);
        });

        // Notes icon click listener - go to Notes page
        notesIcon.setOnClickListener(view -> {
            Intent intent = new Intent(AddNotePage.this, NotesPage.class);
            startActivity(intent);
        });

        // Add Note button click listener
        addNoteButton.setOnClickListener(view -> {
            String title = titleInput.getText().toString().trim();
            String content = contentInput.getText().toString().trim();

            if (title.isEmpty()) {
                Toast.makeText(this, "Please enter a title", Toast.LENGTH_SHORT).show();
                return;
            }

            if (content.isEmpty()) {
                Toast.makeText(this, "Please enter some content", Toast.LENGTH_SHORT).show();
                return;
            }

            // Here you would typically save the note to a database
            // For now, just show a success message and go back to Notes page
            Toast.makeText(this, "Note added successfully!", Toast.LENGTH_SHORT).show();
            
            // Clear the input fields
            titleInput.setText("");
            contentInput.setText("");
            
            // Go back to Notes page
            Intent intent = new Intent(AddNotePage.this, NotesPage.class);
            startActivity(intent);
        });
    }
}
