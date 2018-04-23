package com.example.alexandra.mentorme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Choice extends AppCompatActivity {


    Button buttonStudent;
    Button buttonMentor;
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
        Button buttonMentor = (Button) findViewById(R.id.buttonMentor);
        Button buttonStudent = (Button) findViewById(R.id.buttonStudent);
        View view =(View) findViewById(R.id.view);

        buttonMentor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Choice.this, Mentor.class);
                Choice.this.startActivity(intent1);
            }
        });
    }
}
