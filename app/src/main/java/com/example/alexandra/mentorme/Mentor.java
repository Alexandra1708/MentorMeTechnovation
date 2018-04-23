package com.example.alexandra.mentorme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mentor extends AppCompatActivity {

    Button buttonSignIn;
    Button buttonLogIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mentor);
        Button buttonSignIn = (Button) findViewById(R.id.buttonMentor);
        Button buttonLogIn = (Button) findViewById(R.id.buttonStudent);

        buttonSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Mentor.this, SignIn.class);
                Mentor.this.startActivity(intent2);
            }
        });
    }
}
