package com.example.a10119901latihan2;

//Nama    : Fauzan Muhammad Abdussalam
//NIM     : 10119901
//Kelas   : IF-10K

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void toLogin(View v)
    {
        startActivity(new Intent(Register.this, Login.class));
    }

    public void toAlmostThere(View v)
    {
        startActivity(new Intent(Register.this, AlmostThere.class));
    }
}