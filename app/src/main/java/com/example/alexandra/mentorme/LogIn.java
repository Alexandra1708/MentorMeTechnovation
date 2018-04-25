package com.example.alexandra.mentorme;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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



            /*buttonLogIn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String email = editTextEmailLogIn.getText().toString();
                    String password = editTextPasswordLogIn.getText().toString();
                    if(db.checkUser( email, password)) {
                        Intent intentProfile = new Intent(LogIn.this, Profile.class);
                        LogIn.this.startActivity(intentProfile);
                    }
                    else {
                        AlertDialog.Builder alert = new AlertDialog.Builder(LogIn.this);
                        alert.setMessage("Your account does not exist!");
                        alert.setPositiveButton("OK", null);
                        alert.setCancelable(true);
                        alert.create().show();
                    }
                }
            });*/
        }
    }



