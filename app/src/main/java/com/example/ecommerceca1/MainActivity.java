package com.example.ecommerceca1;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText email, pass;
    private Button confirmButt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.TextEmailAddress);
        pass = findViewById(R.id.TextPassword);

        confirmButt = findViewById(R.id.button);
        confirmButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });
    }


    public boolean containsDigit(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true; // Found a digit, so return true
            }
        }
        return false; // No digits found
    }

    private void login() {
        String enteredEmail = email.getText().toString();
        String enteredPassword = pass.getText().toString();

        if (enteredEmail.contains("@") && !enteredEmail.contains(" ")) {

            if (enteredPassword.length() > 6 && !enteredPassword.contains(" ") && containsDigit(enteredPassword)) {



            }else{

                Toast.makeText(this, "Invalid password! password must be greater than 6 characters have at least one digit and have no spaces", Toast.LENGTH_SHORT).show();

            }

        } else {

            Toast.makeText(this, "Invalid email! please use @ and do not include spaces", Toast.LENGTH_SHORT).show();

        }


    }
}

