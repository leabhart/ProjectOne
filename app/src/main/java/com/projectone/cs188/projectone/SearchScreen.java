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
        TextView date927 = (TextView) findViewById(R.id.date0927);
        TextView date928 = (TextView) findViewById(R.id.date0928);
        TextView date929 = (TextView) findViewById(R.id.date0929);
        TextView date930 = (TextView) findViewById(R.id.date0930);
        TextView date101 = (TextView) findViewById(R.id.date1001);
        TextView date102 = (TextView) findViewById(R.id.date1002);
        TextView date103 = (TextView) findViewById(R.id.date1003);
        TextView date104 = (TextView) findViewById(R.id.date1004);
        TextView date105 = (TextView) findViewById(R.id.date1005);
        TextView date106 = (TextView) findViewById(R.id.date1006);
        TextView date107 = (TextView) findViewById(R.id.date1007);
        TextView date108 = (TextView) findViewById(R.id.date1008);
        TextView date109 = (TextView) findViewById(R.id.date1009);
        TextView date1010 = (TextView) findViewById(R.id.date1010);
        weekdaySU.setTypeface(robotoRegular);
        weekdayM.setTypeface(robotoRegular);
        weekdayT.setTypeface(robotoRegular);
        weekdayW.setTypeface(robotoRegular);
        weekdayTH.setTypeface(robotoRegular);
        weekdayF.setTypeface(robotoRegular);
        weekdayS.setTypeface(robotoRegular);
        date927.setTypeface(robotoRegular);
        date928.setTypeface(robotoRegular);
        date929.setTypeface(robotoRegular);
        date930.setTypeface(robotoRegular);
        date101.setTypeface(robotoRegular);
        date102.setTypeface(robotoRegular);
        date103.setTypeface(robotoRegular);
        date104.setTypeface(robotoRegular);
        date105.setTypeface(robotoRegular);
        date106.setTypeface(robotoRegular);
        date107.setTypeface(robotoRegular);
        date108.setTypeface(robotoRegular);
        date109.setTypeface(robotoRegular);
        date1010.setTypeface(robotoRegular);

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
