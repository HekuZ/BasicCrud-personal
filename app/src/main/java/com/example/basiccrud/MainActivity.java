package com.example.basiccrud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.basiccrud.dal.SerieDAL;

public class MainActivity extends AppCompatActivity {

    private SerieDAL serieDal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Tasting
        this.serieDal = new SerieDAL(getApplicationContext());
    }
}
