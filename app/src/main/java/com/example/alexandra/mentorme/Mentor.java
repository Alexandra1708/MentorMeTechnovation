package com.example.alexandra.mentorme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mentor extends AppCompatActivity {

    Button buttonSignUp;
    Button buttonLogIn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mentor);

        buttonSignUp= (Button)findViewById(R.id.buttonSignUp);
        buttonLogIn = (Button) findViewById(R.id.buttonLogIn);
        buttonSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentSignUp = new Intent(Mentor.this, SignUp.class);
                Mentor.this.startActivity(intentSignUp);
            }
        });

        buttonLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLogIn = new Intent(Mentor.this, LogIn.class);
                Mentor.this.startActivity(intentLogIn);
            }
        });


    }
}
