package com.example.bsit_3_2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TermsActivity extends AppCompatActivity {

    Button proc;
    CheckBox agree;
    TextView cond;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms);

        proc = findViewById(R.id.btnProceed);
        agree = findViewById(R.id.Agree);
        cond = findViewById(R.id.txtCond);

        String terms =
                "You can add more content and format it as needed." +"Your terms and conditions text goes here. " +
                "You can add more content and format it as needed." +"Your terms and conditions text goes here. " +
                "You can add more content and format it as needed." +"Your terms and conditions text goes here. " +
                "You can add more content and format it as needed." +"Your terms and conditions text goes here. " +
                "You can add more content and format it as needed." +"Your terms and conditions text goes here. " +
                "You can add more content and format it as needed." +"Your terms and conditions text goes here. " +
                "You can add more content and format it as needed." +"Your terms and conditions text goes here. " +
                "You can add more content and format it as needed." +"Your terms and conditions text goes here. " +
                "You can add more content and format it as needed." +"Your terms and conditions text goes here. " +
                "You can add more content and format it as needed." +"Your terms and conditions text goes here. " +
                "You can add more content and format it as needed." +"Your terms and conditions text goes here. " +
                "You can add more content and format it as needed." +"Your terms and conditions text goes here. " +
                "You can add more content and format it as needed." +"Your terms and conditions text goes here. " +
                "You can add more content and format it as needed." +"Your terms and conditions text goes here. " +
                "You can add more content and format it as needed." +"Your terms and conditions text goes here. " +
                "You can add more content and format it as needed." +"Your terms and conditions text goes here. " +
                "You can add more content and format it as needed." +"Your terms and conditions text goes here. " +
                "You can add more content and format it as needed." +"Your terms and conditions text goes here. " +
                "You can add more content and format it as needed." +"Your terms and conditions text goes here. " +
                "You can add more content and format it as needed." +"Your terms and conditions text goes here. " +
                "You can add more content and format it as needed." +"Your terms and conditions text goes here. " +
                "You can add more content and format it as needed." +"Your terms and conditions text goes here. " +
                "You can add more content and format it as needed." +"Your terms and conditions text goes here. " +
                "You can add more content and format it as needed." +"Your terms and conditions text goes here. " +
                "You can add more content and format it as needed." +"Your terms and conditions text goes here. " +
                "You can add more content and format it as needed." +"Your terms and conditions text goes here. " +
                "You can add more content and format it as needed." +"Your terms and conditions text goes here. " +
                "You can add more content and format it as needed." +"Your terms and conditions text goes here. " +
                "You can add more content and format it as needed." +"Your terms and conditions text goes here. "
                ;

        cond.setText(terms);

        agree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(agree.isChecked()) {
                    proc.setEnabled(true);
                } else if (!agree.isChecked()) {
                    proc.setEnabled(false);
                }
            }
        });

        proc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TermsActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });


    }
}