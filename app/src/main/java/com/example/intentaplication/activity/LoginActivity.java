package com.example.intentaplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.intentaplication.R;

public class LoginActivity extends AppCompatActivity {
    Button login;
    EditText username,password;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.login_relative);

        login = (Button) findViewById(R.id.btnLogin);
        username = (EditText) findViewById(R.id.etUsername);
        password = (EditText) findViewById(R.id.etPassword);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                if (password.getText().toString().toUpperCase().equals("TEST1")){
                    login_sukses();
                }else{
                    Toast.makeText(getApplicationContext(), "salah password",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    private void login_sukses() {
        String user_login = username.getText().toString();
        Intent i = new Intent(this,IntentAppActivity.class);
        //kirimkan usernamenya ke tampilan utama
        i.putExtra("USERNAME", user_login);
        startActivity(i);
    }
}
