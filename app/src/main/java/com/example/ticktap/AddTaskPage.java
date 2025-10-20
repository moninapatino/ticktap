package com.example.ticktap;

import android.os.Bundle;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import androidx.activity.ComponentActivity;

public class AddTaskPage extends ComponentActivity {

    private String selectedPriority = "Medium";
    private final String[] priorities = {"Low", "Medium", "High"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_task_page);

        // Find UI elements
        ImageView backArrow = findViewById(R.id.back_arrow);
        ImageView homeIcon = findViewById(R.id.home_icon);
        ImageView notesIcon = findViewById(R.id.notes_icon);
        Button addTaskButton = findViewById(R.id.add_task_button);
        EditText titleInput = findViewById(R.id.title_input);
        EditText detailsInput = findViewById(R.id.details_input);
        TextView priorityText = findViewById(R.id.priority_text);
        View priorityDropdown = findViewById(R.id.priority_dropdown);

        // Back arrow click listener - go back to Dashboard
        backArrow.setOnClickListener(view -> {
            Intent intent = new Intent(AddTaskPage.this, Dashboard.class);
            startActivity(intent);
        });

        // Home icon click listener - go to Dashboard
        homeIcon.setOnClickListener(view -> {
            Intent intent = new Intent(AddTaskPage.this, Dashboard.class);
            startActivity(intent);
        });

        // Notes icon click listener - go to Notes page
        notesIcon.setOnClickListener(view -> {
            Intent intent = new Intent(AddTaskPage.this, NotesPage.class);
            startActivity(intent);
        });

        // Priority dropdown click listener - cycle through priorities
        priorityDropdown.setOnClickListener(view -> {
            int currentIndex = 0;
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i].equals(selectedPriority)) {
                    currentIndex = i;
                    break;
                }
            }
            
            // Move to next priority (cycle back to first if at end)
            int nextIndex = (currentIndex + 1) % priorities.length;
            selectedPriority = priorities[nextIndex];
            priorityText.setText(selectedPriority);
        });

        // Add Task button click listener
        addTaskButton.setOnClickListener(view -> {
            String title = titleInput.getText().toString().trim();
            String details = detailsInput.getText().toString().trim();

            if (title.isEmpty()) {
                Toast.makeText(this, "Please enter a task title", Toast.LENGTH_SHORT).show();
                return;
            }

            // Here you would typically save the task to a database
            // For now, just show a success message and go back to Dashboard
            Toast.makeText(this, "Task added successfully!", Toast.LENGTH_SHORT).show();
            
            // Clear the input fields
            titleInput.setText("");
            detailsInput.setText("");
            selectedPriority = "Medium";
            priorityText.setText(selectedPriority);
            
            // Go back to Dashboard
            Intent intent = new Intent(AddTaskPage.this, Dashboard.class);
            startActivity(intent);
        });
    }
}
