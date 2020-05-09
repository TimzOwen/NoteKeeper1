package com.owen.note_keeper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.EditText;

public class AddNote extends AppCompatActivity {

    Toolbar toolbar;
    EditText et_noteTitle, et_noteDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);

        toolbar = findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

        et_noteTitle = findViewById(R.id.note_title);
        et_noteDesc = findViewById(R.id.note_detail);
    }
}