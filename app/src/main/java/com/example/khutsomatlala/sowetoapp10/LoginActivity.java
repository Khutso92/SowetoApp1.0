package com.example.khutsomatlala.sowetoapp10;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {


    final String CORRECT_USERNAME = "c", CORRECT_PASSWORD = "63";


    String password, username;

    EditText usernameEditText, passwordEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__login);

        usernameEditText = (EditText) findViewById(R.id.usernameEditText);
        passwordEditText = (EditText) findViewById(R.id.passwordEditText);


    }


    public void signin(View view) {

        username = usernameEditText.getText().toString().trim();
        password = passwordEditText.getText().toString().trim();

        if (username.equals(CORRECT_USERNAME) && password.equals(CORRECT_PASSWORD)) {

            passwordEditText.setText("");
            usernameEditText.setText("");

            Intent intent = new Intent(LoginActivity.this,CRUD.class);
            startActivity(intent);

        } else {
            passwordEditText.setError("incorrect password");
        }
    }

}
