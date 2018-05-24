package edu.hanover.cs323_grahamkennyproject;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

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

        settingsList.setOnItemClickListener(new ItemClickListener());
    }

    private class ItemClickListener implements ListView.OnItemClickListener{
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Toast toast = Toast.makeText(SettingsActivity.this, "Not yet implemented", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    //Populates the ActionBar with icons as needed
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    //Used to move to Settings through the Action Bar
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.signinIcon:
                Intent intent2 = new Intent(this, SignInActivity.class);
                startActivity(intent2);
                return true;
            case R.id.homeButton:
                Intent intent3 = new Intent( this, MainActivity.class);
                startActivity(intent3);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
