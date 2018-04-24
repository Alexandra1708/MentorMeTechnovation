package com.example.alexandra.mentorme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LogIn extends AppCompatActivity {

    EditText editTextEmailLogIn, editTextPasswordLogIn;
    Button buttonLogIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        editTextEmailLogIn = (EditText)findViewById(R.id.editTextEmailLogIn);
        editTextPasswordLogIn = (EditText)findViewById(R.id.editTextPasswordLogIn);
        buttonLogIn= (Button)findViewById(R.id.buttonLogIn);
    }
}
