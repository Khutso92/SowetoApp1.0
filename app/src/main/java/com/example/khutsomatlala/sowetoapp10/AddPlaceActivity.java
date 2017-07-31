package com.example.khutsomatlala.sowetoapp10;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

public class AddPlaceActivity extends AppCompatActivity {


    EditText PlaceNameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_place);


        PlaceNameEditText = (EditText) findViewById(R.id.PlaceNameEditText);

        
    }





}
