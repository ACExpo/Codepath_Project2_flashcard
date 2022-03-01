package com.example.project2_flashcard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView flashcardQuestion = findViewById(R.id.flash_question);
        TextView flashcardAnswer1 = findViewById(R.id.button1);
        TextView flashcardAnswer1_2 = findViewById(R.id.button1_2);
        TextView flashcardAnswer2 = findViewById(R.id.button2);
        TextView flashcardAnswer2_2 = findViewById(R.id.button2_2);
        TextView flashcardrAnswer = findViewById(R.id.right_answer);
        TextView flashcardrAnswer_2 = findViewById(R.id.right_answer_2);

        findViewById(R.id.button1).setVisibility(View.VISIBLE);
        findViewById(R.id.button2).setVisibility(View.VISIBLE);
        findViewById(R.id.right_answer).setVisibility(View.VISIBLE);

        findViewById(R.id.button1_2).setVisibility(View.INVISIBLE);
        findViewById(R.id.button2_2).setVisibility(View.INVISIBLE);
        findViewById(R.id.right_answer_2).setVisibility(View.INVISIBLE);

        flashcardAnswer1.setOnClickListener(this::onClick);
        flashcardAnswer2.setOnClickListener(this::onClick2);
        flashcardrAnswer.setOnClickListener(this::onClick3);
        flashcardAnswer1_2.setOnClickListener(this::onClick);
        flashcardAnswer2_2.setOnClickListener(this::onClick2);
        flashcardrAnswer_2.setOnClickListener(this::onClick3);
    }

    private void onClick(View v) {
        findViewById(R.id.button1).setVisibility(View.INVISIBLE);
        findViewById(R.id.button1_2).setVisibility(View.VISIBLE);
        findViewById(R.id.right_answer_2).setVisibility(View.VISIBLE);
    }

    private void onClick2(View v) {
        findViewById(R.id.button2).setVisibility(View.INVISIBLE);
        findViewById(R.id.button2_2).setVisibility(View.VISIBLE);
        findViewById(R.id.right_answer_2).setVisibility(View.VISIBLE);
    }

    private void onClick3(View v) {
        findViewById(R.id.right_answer).setVisibility(View.INVISIBLE);
        findViewById(R.id.right_answer_2).setVisibility(View.VISIBLE);
    }

}
