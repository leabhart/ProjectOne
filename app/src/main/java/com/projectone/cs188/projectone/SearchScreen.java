package com.projectone.cs188.projectone;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class SearchScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_screen);

        applyTypeface();

    }

    private void applyTypeface(){
        Typeface robotoLight = Typeface.createFromAsset(getAssets(), "fonts/robotolight.ttf");
        Typeface robotoRegular = Typeface.createFromAsset(getAssets(), "fonts/robotoregular.ttf");
        Typeface robotoMedium = Typeface.createFromAsset(getAssets(), "fonts/robotomedium.ttf");
        TextView weekdaySU = (TextView) findViewById(R.id.weekday1);
        TextView weekdayM = (TextView) findViewById(R.id.weekday2);
        TextView weekdayT = (TextView) findViewById(R.id.weekday3);
        TextView weekdayW = (TextView) findViewById(R.id.weekday4);
        TextView weekdayTH = (TextView) findViewById(R.id.weekday5);
        TextView weekdayF = (TextView) findViewById(R.id.weekday6);
        TextView weekdayS = (TextView) findViewById(R.id.weekday7);
        weekdaySU.setTypeface(robotoLight);
        weekdayM.setTypeface(robotoLight);
        weekdayT.setTypeface(robotoLight);
        weekdayW.setTypeface(robotoLight);
        weekdayTH.setTypeface(robotoLight);
        weekdayF.setTypeface(robotoLight);
        weekdayS.setTypeface(robotoLight);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_search_screen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
