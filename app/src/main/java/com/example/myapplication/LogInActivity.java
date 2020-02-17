package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LogInActivity extends AppCompatActivity {
    private EditText et_Id, et_password;
    private String my_id,my_password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        et_Id = findViewById(R.id.et_Id);
        et_password = findViewById(R.id.et_password);
        Button button_signin = findViewById(R.id.button_signin);
        my_id = "Sanggeun";
        my_password = "Park";

        button_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = et_Id.getText().toString();
                String password = et_password.getText().toString();
                if(id.equals(my_id) && password.equals(my_password)){

                }
            }
        });

    }
}
