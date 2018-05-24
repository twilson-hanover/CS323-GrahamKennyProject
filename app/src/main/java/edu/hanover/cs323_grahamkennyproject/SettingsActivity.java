package edu.hanover.cs323_grahamkennyproject;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SettingsActivity extends Activity {

    private String[] titles;
    private ListView settingsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        titles = getResources().getStringArray(R.array.titles);
        settingsList = (ListView) findViewById(R.id.SettingsList);
        settingsList.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, titles));
    }
}
