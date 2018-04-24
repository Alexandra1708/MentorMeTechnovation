package com.example.alexandra.mentorme;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.example.alexandra.mentorme.R.id.view;

public class Choice extends AppCompatActivity {


    Button buttonStudent;
    Button buttonMentor;
    //View view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
        buttonMentor = (Button) findViewById(R.id.buttonMentor);
        buttonStudent = (Button) findViewById(R.id.buttonStudent);
        //view =(View) findViewById(R.id.view);

        buttonMentor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMentor = new Intent(Choice.this, Mentor.class);
                Choice.this.startActivity(intentMentor);
            }
        });
    }
}

