package com.projectone.cs188.projectone;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TableRow;
import android.widget.TextView;

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


    public void onClickRowTwo(View v) {
        //when row is clicked show or hide additional info
        int RowTwoClick1 = R.id.tableInfoRow2_1;
        int ImageClick1 = R.id.imageButton;

        TableRow RowTwoVisibility = (TableRow) findViewById(RowTwoClick1);
        TableRow ImageVisibility = (TableRow) findViewById(ImageClick1);

        if (RowTwoVisibility.getVisibility() == View.VISIBLE) {
            RowTwoVisibility.setVisibility(View.GONE);
        } else {
            RowTwoVisibility.setVisibility(View.VISIBLE);
            ImageVisibility.setVisibility(View.VISIBLE);
        }

        int RowTwoClick2 = R.id.tableInfoRow2_2;

        TableRow RowTwo2Visibility = (TableRow) findViewById(RowTwoClick2);

        if (RowTwo2Visibility.getVisibility() == View.VISIBLE) {
            RowTwo2Visibility.setVisibility(View.GONE);
        } else {
            RowTwo2Visibility.setVisibility(View.VISIBLE);
        }
    }

    public void onClickRowThree(View v) {
        //when row is clicked show or hide additional info
        int RowThreeClick1 = R.id.tableInfoRow3_1;

        TableRow RowThreeVisibility = (TableRow) findViewById(RowThreeClick1);

        if (RowThreeVisibility.getVisibility() == View.VISIBLE) {
            RowThreeVisibility.setVisibility(View.GONE);
        } else {
            RowThreeVisibility.setVisibility(View.VISIBLE);
        }
    }

    public void onClickRowFive(View v) {
        //when row is clicked show or hide additional info
        int RowFiveClick1 = R.id.tableInfoRow5_1;

        TableRow RowFiveVisibility = (TableRow) findViewById(RowFiveClick1);

        if (RowFiveVisibility.getVisibility() == View.VISIBLE) {
            RowFiveVisibility.setVisibility(View.GONE);
        } else {
            RowFiveVisibility.setVisibility(View.VISIBLE);
        }

        int RowFiveClick2 = R.id.tableInfoRow5_2;

        TableRow RowFive2Visibility = (TableRow) findViewById(RowFiveClick2);

        if (RowFive2Visibility.getVisibility() == View.VISIBLE) {
            RowFive2Visibility.setVisibility(View.GONE);
        } else {
            RowFive2Visibility.setVisibility(View.VISIBLE);
        }

        int RowFiveClick3 = R.id.tableInfoRow5_3;

        TableRow RowFive3Visibility = (TableRow) findViewById(RowFiveClick3);

        if (RowFive3Visibility.getVisibility() == View.VISIBLE) {
            RowFive3Visibility.setVisibility(View.GONE);
        } else {
            RowFive3Visibility.setVisibility(View.VISIBLE);
        }
    }

    public void onClickRowSix(View v) {
        //when row is clicked show or hide additional info
        int RowSixClick1 = R.id.tableInfoRow6_1;

        TableRow RowSixVisibility = (TableRow) findViewById(RowSixClick1);

        if (RowSixVisibility.getVisibility() == View.VISIBLE) {
            RowSixVisibility.setVisibility(View.GONE);
        } else {
            RowSixVisibility.setVisibility(View.VISIBLE);
        }
    }

    public void onClickRowSeven(View v) {
        //when row is clicked show or hide additional info
        int RowSevenClick1 = R.id.tableInfoRow7_1;

        TableRow RowSevenVisibility = (TableRow) findViewById(RowSevenClick1);

        if (RowSevenVisibility.getVisibility() == View.VISIBLE) {
            RowSevenVisibility.setVisibility(View.GONE);
        } else {
            RowSevenVisibility.setVisibility(View.VISIBLE);
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
