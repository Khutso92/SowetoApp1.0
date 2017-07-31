package com.example.khutsomatlala.sowetoapp10;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.DatabaseReference;

import java.util.ArrayList;

/**
 * Created by Khutso Matlala on 7/28/2017.
 */

//Performs read and write from the database

public class FirebaseHelper {

    DatabaseReference db;
    Boolean saved = null;
    ArrayList<String> spaccecratfs = new ArrayList<>();

    public FirebaseHelper(DatabaseReference db) {
        this.db = db;
    }

    //saving the data into DB
    public Boolean save(PlaceInforActivity placeInforActivity) {
        if (placeInforActivity == null) {
            saved = false;

        } else {
            try {
                //Generate the PK (UID) of each value using then push method
                db.child("Place of interest").push().setValue(placeInforActivity);
                saved = true;

            } catch (DatabaseException e) {
                e.printStackTrace();
                saved = false;
            }
        }

        return saved;
    }

    //writing the data into DB

    public ArrayList<String> read() {
        db.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {

                fetchData(dataSnapshot);

            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        return spaccecratfs;
    }

    private void fetchData(DataSnapshot dataSnapshot) {
        spaccecratfs.clear();

        //looping the children using the - for each loop

        for (DataSnapshot ds : dataSnapshot.getChildren()) {
            //geting the name from
            String place_name = ds.getValue(PlaceInforActivity.class).getName();
            spaccecratfs.add(place_name);
        }
    }
}
