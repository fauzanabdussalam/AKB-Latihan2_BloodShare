package com.example.a10119901latihan2;

//Nama    : Fauzan Muhammad Abdussalam
//NIM     : 10119901
//Kelas   : IF-10K

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void toRegister(View v)
    {
        startActivity(new Intent(Login.this, Register.class));
    }
}