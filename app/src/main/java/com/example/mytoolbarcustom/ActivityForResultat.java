package com.example.mytoolbarcustom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityForResultat extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_resultat);

        configureToolbar();

        renderMainActivityValue();

    }

    private void renderMainActivityValue() {
        tv = findViewById(R.id.date_of_birth);
        Bundle bundle = getIntent().getExtras();
        int a = bundle.getInt("YEAR_OF_BIRTH");
        String str = String.valueOf(a);
        tv.setText("Year of birth is "+str);
    }

    private void configureToolbar() {
        // Get the toolbar view inside the activity layout
        Toolbar toolbar = findViewById(R.id.resultat_toolbar_custom);
        // Sets the Toolbar
        setSupportActionBar(toolbar);
        /*
        It works if you declare in the manifest in ActivityForResultat
        android:parentActivityName=".MainActivity
         */
       getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}