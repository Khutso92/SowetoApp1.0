package com.example.khutsomatlala.sowetoapp10;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class CRUD extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crud);
    }


    public void add(View view)
    {
        Intent  intent = new Intent(CRUD.this,AddPlaceActivity.class);
        startActivity(intent);
    }

    public void delete(View view)
    {
        Toast.makeText(this, " operation not active", Toast.LENGTH_SHORT).show();
    }

    public void update(View view)
    {
        Toast.makeText(this, " operation not active", Toast.LENGTH_SHORT).show();
    }




}
