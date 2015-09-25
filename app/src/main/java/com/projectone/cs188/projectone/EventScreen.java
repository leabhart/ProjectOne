package com.projectone.cs188.projectone;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

public class EventScreen extends AppCompatActivity {

    private void applyTypeface() {
        Typeface robotoLight = Typeface.createFromAsset(getAssets(), "fonts/robotolight.ttf");
        Typeface robotoRegular = Typeface.createFromAsset(getAssets(), "fonts/robotoregular.ttf");
        Typeface robotoMedium = Typeface.createFromAsset(getAssets(), "fonts/robotomedium.ttf");
        TextView Day1 = (TextView) findViewById(R.id.dayOne);
        TextView Day2 = (TextView) findViewById(R.id.dayTwo);
        TextView Day3 = (TextView) findViewById(R.id.dayThree);
        TextView Day4 = (TextView) findViewById(R.id.dayFour);
        TextView Day5 = (TextView) findViewById(R.id.dayFive);
        TextView Day6 = (TextView) findViewById(R.id.daySix);
        TextView Day7 = (TextView) findViewById(R.id.daySeven);

        TextView Date1 = (TextView) findViewById(R.id.dateOne);
        TextView Date2 = (TextView) findViewById(R.id.dateTwo);
        TextView Date3 = (TextView) findViewById(R.id.dateThree);
        TextView Date4 = (TextView) findViewById(R.id.dateFour);
        TextView Date5 = (TextView) findViewById(R.id.dateFive);
        TextView Date6 = (TextView) findViewById(R.id.dateSix);
        TextView Date7 = (TextView) findViewById(R.id.dateSeven);

        TextView Event2_1 = (TextView) findViewById(R.id.textView2_1);
        TextView Event2_2 = (TextView) findViewById(R.id.textView2_2);
        TextView Event3_1 = (TextView) findViewById(R.id.textView3_1);
        TextView Event5_1 = (TextView) findViewById(R.id.textView5_1);
        TextView Event5_2 = (TextView) findViewById(R.id.textView5_2);
        TextView Event5_3 = (TextView) findViewById(R.id.textView5_3);
        TextView Event6_1 = (TextView) findViewById(R.id.textView6_1);
        TextView Event7_1 = (TextView) findViewById(R.id.textView7_1);

        Day1.setTypeface(robotoLight);
        Day2.setTypeface(robotoLight);
        Day3.setTypeface(robotoLight);
        Day4.setTypeface(robotoLight);
        Day5.setTypeface(robotoLight);
        Day6.setTypeface(robotoLight);
        Day7.setTypeface(robotoLight);

        Date1.setTypeface(robotoMedium);
        Date2.setTypeface(robotoMedium);
        Date3.setTypeface(robotoMedium);
        Date4.setTypeface(robotoMedium);
        Date5.setTypeface(robotoMedium);
        Date6.setTypeface(robotoMedium);
        Date7.setTypeface(robotoMedium);

        Event2_1.setTypeface(robotoRegular);
        Event2_2.setTypeface(robotoRegular);
        Event3_1.setTypeface(robotoRegular);
        Event5_1.setTypeface(robotoRegular);
        Event5_2.setTypeface(robotoRegular);
        Event5_3.setTypeface(robotoRegular);
        Event6_1.setTypeface(robotoRegular);
        Event7_1.setTypeface(robotoMedium);
    }


    public void onClickRowOne(View v) {
        //when row is clicked show or hide additional info
        int RowOneClick = R.id.InfoTableRow1;

        TableRow RowOneVisibility = (TableRow) findViewById(RowOneClick);

        if (RowOneVisibility.getVisibility() == View.VISIBLE) {
            RowOneVisibility.setVisibility(View.GONE);
        } else {
            RowOneVisibility.setVisibility(View.VISIBLE);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_screen);

        ImageButton toSearchButton = (ImageButton) findViewById(R.id.imageButton);
        toSearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendToSearchScreen();
            }

        });

    }

    private void sendToSearchScreen()
    {
        Intent intent = new Intent(this, SearchScreen.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_event_screen, menu);
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
