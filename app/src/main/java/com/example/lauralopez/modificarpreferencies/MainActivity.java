package com.example.lauralopez.modificarpreferencies;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;



public class MainActivity extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt = findViewById(R.id.boto1);
        bt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                preferencies(view);
            }
        });
    }

    public void preferencies(View view) {
        Intent i = new Intent(this, ModificarPreferencies.class);
        startActivity(i);
    }

}