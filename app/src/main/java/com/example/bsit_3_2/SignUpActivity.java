package com.example.bsit_3_2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.jetbrains.annotations.TestOnly;

public class SignUpActivity extends AppCompatActivity {

    EditText email, username, password, confirm, age;
    Button signup;
    RadioButton male, female;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        email = findViewById(R.id.signEmail);
        username = findViewById(R.id.signUsername);
        password = findViewById(R.id.signPassword);
        confirm = findViewById(R.id.signConfirm);
        age = findViewById(R.id.signAge);
        signup = findViewById(R.id.btnSignUp);
        male = findViewById(R.id.Male);
        female = findViewById(R.id.Female);


        male.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    Toast.makeText(SignUpActivity.this, "Male", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(SignUpActivity.this, "Female", Toast.LENGTH_SHORT).show();
                }
            }
        });


        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = username.getText().toString();
                String em = email.getText().toString();
                String pass = password.getText().toString();
                String con = confirm.getText().toString();
                String ag = age.getText().toString();


                if(name.isEmpty() || em.isEmpty() || pass.isEmpty() || con.isEmpty() || ag.isEmpty()){
                    Toast.makeText(SignUpActivity.this, "Field is Required", Toast.LENGTH_SHORT).show();
                } else if (!pass.equals(con)) {
                    Toast.makeText(SignUpActivity.this, "Password Does Not Match", Toast.LENGTH_SHORT).show();
                } else if (pass.length() < 8) {
                    Toast.makeText(SignUpActivity.this, "Password Must Be At Least 8 Characters", Toast.LENGTH_SHORT).show();
                } else if (ag.length() < 2) {
                    Toast.makeText(SignUpActivity.this, "Age Must Be At Least 2 Characters", Toast.LENGTH_SHORT).show();
            } else {
                    Toast.makeText(SignUpActivity.this, "Sign Up Successful", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(SignUpActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }

            }
        });

    }
}