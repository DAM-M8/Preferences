package com.example.lauralopez.modificarpreferencies;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class ModificarPreferencies extends PreferenceActivity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferencies);
    }
}

