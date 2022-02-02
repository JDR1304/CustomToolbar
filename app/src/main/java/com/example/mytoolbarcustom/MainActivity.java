package com.example.mytoolbarcustom;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private String str = "YEAR_OF_BIRTH";
    private final int YEAR_OF_BIRTH = 1978;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        this.configureToolbar();

        goToNextActivity();
    }

    private void goToNextActivity() {
        btn.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), ActivityForResultat.class);
            intent.putExtra(str, YEAR_OF_BIRTH);
            startActivity(intent);
        });
    }


    private void configureToolbar() {
        // Get the toolbar view inside the activity layout
        Toolbar toolbar = findViewById(R.id.main_toolbar_custom);
        // Sets the Toolbar
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //2 - Inflate the menu and add it to the Toolbar
        getMenuInflater().inflate(R.menu.menu_toolbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {

            case R.id.item1: {
                Toast.makeText(getApplicationContext(), "je selectionne item 1", Toast.LENGTH_SHORT).show();
                return true;
            }
            case R.id.item2: {
                Toast.makeText(getApplicationContext(), "je selectionne item 2", Toast.LENGTH_SHORT).show();
                return true;
            }
            case R.id.item3: {
                Toast.makeText(getApplicationContext(), "je selectionne item 3", Toast.LENGTH_SHORT).show();
                return true;
            }
            case R.id.item4: {
                Toast.makeText(getApplicationContext(), "je selectionne item 4", Toast.LENGTH_SHORT).show();
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }
}