package edu.hanover.cs323_grahamkennyproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SignInActivity extends Activity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }

    //Get the text from the EditText box and add it to the TextView
    public void onClickSignIn (View view) {
        EditText et = (EditText) findViewById(R.id.SignIn);
        tv = (TextView) findViewById(R.id.Patrons);
        String origtv = tv.getText().toString();
        String newtv = origtv + et.getText().toString() + "\n";
        tv.setText(newtv);
        et.setText("");
    }

    //Clear the textview
    public void onClickClear (View view) {
        tv = (TextView) findViewById(R.id.Patrons);
        tv.setText("");
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
            case R.id.Settings:
                Intent intent = new Intent(this, SettingsActivity.class);
                startActivity(intent);
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
