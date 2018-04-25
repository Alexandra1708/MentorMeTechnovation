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

        buttonSignIn= (Button)findViewById(R.id.buttonSignIn);
        buttonLogIn = (Button) findViewById(R.id.buttonLogIn);
        buttonSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentSignIn = new Intent(Mentor.this, SignIn.class);
                Mentor.this.startActivity(intentSignIn);
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
