package com.example.hospitalapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignUpActivity extends AppCompatActivity {
EditText e1,e2,e3,e4,e5,e6,e7;
Button bt1,bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up);
e1=(EditText)findViewById(R.id.name);
e2=(EditText)findViewById(R.id.address);
e3=(EditText)findViewById(R.id.pin);
e4=(EditText)findViewById(R.id.number);
e5=(EditText)findViewById(R.id.username);
e6=(EditText)findViewById(R.id.password1);
e7=(EditText)findViewById(R.id.password2);
bt1=(Button)findViewById(R.id.sign);
bt2=(Button)findViewById(R.id.backtologin);
bt2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);

    }
});
    }
}