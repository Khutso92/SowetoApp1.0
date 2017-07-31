package com.example.khutsomatlala.sowetoapp10;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class PlaceInforActivity extends AppCompatActivity {


    String name;

    //I must create a different class for my getters and setter if it crushes
    DatabaseReference db;
  public static   FirebaseHelper helper;
 public  static  RecyclerView rv;
    public static  MyAdapter adapter;





    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_infor);

        //Setup rv
        rv = (RecyclerView) findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(this));

        //setup FB
        db = FirebaseDatabase.getInstance().getReference();
        helper= new FirebaseHelper(db);

        //Adapter
        adapter = new MyAdapter(this,helper.read());
        rv.setAdapter(adapter);


    }



    //empty constr  required
    public PlaceInforActivity() {
    }

    //getting the name of the place
    public String getName() {
        return name;
    }

    //setting the name of the place
    public void setName(String name) {
        this.name = name;
    }




}


