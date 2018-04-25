package com.example.alexandra.mentorme;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUp extends AppCompatActivity {

    EditText editTextUsername, editTextEmail, editTextPassword, editTextConfirmPassword, editTextSubject, editTextName;
    Button buttonRegister;
    Database db= new Database(this);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        editTextUsername = (EditText)findViewById(R.id.editTextUsername);
        editTextEmail = (EditText)findViewById(R.id.editTextEmail);
        editTextPassword = (EditText)findViewById(R.id.editTextPassword);
        editTextConfirmPassword = (EditText)findViewById(R.id.editTextConfirmPassword);
        editTextSubject = (EditText)findViewById(R.id.editTextSubject);
        buttonRegister =(Button)findViewById(R.id.buttonRegister);
        editTextName = (EditText) findViewById(R.id.editTextName);



     buttonRegister.setOnClickListener(new View.OnClickListener() {

         @Override
         public void onClick(View view) {

             String usernameText = editTextUsername.getText().toString();
             String passwordText = editTextPassword.getText().toString();
             String passwordConfirmationText = editTextConfirmPassword.getText().toString();
             String subject = editTextSubject.getText().toString();
             String email = editTextEmail.getText().toString();
             String name = editTextName.getText().toString();






             Log.d("registrationStrings", "username = " + usernameText + " passwordText = " + passwordText + " passwordConfirmationText = " + passwordConfirmationText + " name = " + name + " subject = " + subject + " email = " + email);

             if (usernameText.length() >= 5 && passwordText.length() >= 4 && passwordText.equals(passwordConfirmationText)) {
                 User c = new User();
                 c.setName(name);
                 c.setEmail(email);
                 c.setPass(passwordText);
                 c.setCpass(passwordConfirmationText);
                 c.setSubject(subject);

                 AlertDialog.Builder alert = new AlertDialog.Builder(SignUp.this);
                 alert.setMessage("The registration was successful!");
                 alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                     public void onClick(DialogInterface dialog, int ok) {
                         Intent intentProfile = new Intent(SignUp.this, Profile.class);
                         SignUp.this.startActivity(intentProfile);
                     }
                 });
                 //alert.setPositiveButton("OK", );
                 alert.setCancelable(true);
                 alert.create().show();
                 //Intent intentProfile = new Intent(SignUp.this, Profile.class);
                 //SignUp.this.startActivity(intentProfile);


             }

             if (passwordConfirmationText.contentEquals(passwordText) == false) {
                 AlertDialog.Builder alert = new AlertDialog.Builder(SignUp.this);
                 alert.setMessage("Your password confirmation is different!");
                 alert.setPositiveButton("OK", null);
                 alert.setCancelable(true);
                 alert.create().show();
             }
             if (usernameText.length() < 5) {
                 AlertDialog.Builder alert = new AlertDialog.Builder(SignUp.this);
                 alert.setMessage("Your username must have at least 5 characters!");
                 alert.setPositiveButton("OK", null);
                 alert.setCancelable(true);
                 alert.create().show();
             }
             if (passwordText.length() < 4 && passwordConfirmationText.length() < 4) {
                 AlertDialog.Builder alert = new AlertDialog.Builder(SignUp.this);
                 alert.setMessage("Your password must have at least 4 characters!");
                 alert.setPositiveButton("OK", null);
                 alert.setCancelable(true);
                 alert.create().show();
             }
             if( passwordText.isEmpty() || passwordConfirmationText.isEmpty() || usernameText.isEmpty() || email.isEmpty() || subject.isEmpty() || name.isEmpty())
             {
                 AlertDialog.Builder alert = new AlertDialog.Builder(SignUp.this);
                 alert.setMessage("You must complete all empty fields!");
                 alert.setPositiveButton("OK", null);
                 alert.setCancelable(true);
                 alert.create().show();
             }
         }
     });
    }
}

