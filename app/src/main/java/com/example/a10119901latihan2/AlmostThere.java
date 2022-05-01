package com.example.a10119901latihan2;

//Nama    : Fauzan Muhammad Abdussalam
//NIM     : 10119901
//Kelas   : IF-10K

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;

public class AlmostThere extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost_there);
    }

    public void toVerify(View v)
    {
        startActivity(new Intent(AlmostThere.this, Verify.class));
    }
}