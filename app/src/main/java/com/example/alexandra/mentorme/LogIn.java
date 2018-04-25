package com.example.alexandra.mentorme;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static com.example.alexandra.mentorme.R.id.view;

public class LogIn extends AppCompatActivity {

    EditText editTextEmailLogIn, editTextPasswordLogIn;
    Button buttonLogIn;
    Database db = new Database(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        editTextEmailLogIn = (EditText) findViewById(R.id.editTextEmailLogIn);
        editTextPasswordLogIn = (EditText) findViewById(R.id.editTextPasswordLogIn);
        buttonLogIn = (Button) findViewById(R.id.buttonLogIn);


    }




    public void onButtonClick(View view) {
        if (view.getId() == R.id.buttonLogIn) {
            EditText a = (EditText) findViewById(R.id.editTextEmailLogIn);
            String str = a.getText().toString();
            EditText b = (EditText) findViewById(R.id.editTextPasswordLogIn);
            String pass = b.getText().toString();

            String password = db.searchPass(str);


            buttonLogIn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intentProfile = new Intent(LogIn.this, Profile.class);
                    LogIn.this.startActivity(intentProfile);
                }
            });
        }
    }
}