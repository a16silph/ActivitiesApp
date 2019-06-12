package com.example.brom.activitiesapp;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class mountainDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mountaindetails);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        SharedPreferences pref = getApplicationContext().getSharedPreferences(getString(R.string.MyPrefsName), MODE_PRIVATE);
        String mountainName = pref.getString(getString(R.string.SavedMountainName), "Billingen");
        String mountainLocation = pref.getString(getString(R.string.SavedMountainLocation), "Skövde");
        int mountainHeight = pref.getInt(getString(R.string.SavedMountainHeight), 15);

        TextView mountainNameTextView = findViewById(R.id.mountainName);
        TextView mountainLocationTextView = findViewById(R.id.mountainLocation);
        TextView mountainHeightTextView = findViewById(R.id.mountainHeight);

        mountainNameTextView.setText(mountainName);
        mountainLocationTextView.setText("Location: " + mountainLocation);
        mountainHeightTextView.setText("Elevation: " + mountainHeight + " meters");

    }

}
