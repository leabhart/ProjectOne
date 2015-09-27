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
import android.widget.TextView;
import android.widget.Toast;

public class SearchScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_screen);

        applyTypeface();

        TextView resultPage0928 = (TextView) findViewById(R.id.date0928);
        resultPage0928.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast -- no result!
            }
        });

        TextView resultPage0929 = (TextView) findViewById(R.id.date0929);
        resultPage0929.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendToResult0929();
            }
        });

        TextView resultPage0930 = (TextView) findViewById(R.id.date0930);
        resultPage0930.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendToResult0930();
            }
        });

        TextView resultPage1001 = (TextView) findViewById(R.id.date1001);
        resultPage1001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast -- no result!
            }
        });

        TextView resultPage1002 = (TextView) findViewById(R.id.date1002);
        resultPage1002.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendToResult1002();
            }
        });

        TextView resultPage1003 = (TextView) findViewById(R.id.date1003);
        resultPage1003.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendToResult1003();
            }
        });

        TextView resultPage1004 = (TextView) findViewById(R.id.date1004);
        resultPage1004.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendToResult1004();
            }
        });

        ImageView resultCatCircus = (ImageView) findViewById(R.id.circusbutton);
        resultCatCircus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendToCatCircus();
            }
        });


        ImageView resultCatDance = (ImageView) findViewById(R.id.dancebutton);
        resultCatDance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendToCatDance();
            }
        });

        ImageView resultCatEd = (ImageView) findViewById(R.id.educationbutton);
        resultCatEd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendToCatEd();
            }
        });

        ImageView resultCatFilm = (ImageView) findViewById(R.id.filmbutton);
        resultCatFilm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendToCatFilm();
            }
        });

        ImageView resultCatLit = (ImageView) findViewById(R.id.literarybutton);
        resultCatLit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendToCatLit();
            }
        });

        ImageView resultCatMusic = (ImageView) findViewById(R.id.musicbutton);
        resultCatMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendToCatMusic();
            }
        });

        ImageView resultCatSocial = (ImageView) findViewById(R.id.socialbutton);
        resultCatSocial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendToCatSocial();
            }
        });

        ImageView resultCatTheater = (ImageView) findViewById(R.id.theaterbutton);
        resultCatTheater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendToCatTheater();
            }
        });

        ImageView resultCatVA = (ImageView) findViewById(R.id.visualartbutton);
        resultCatVA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendToCatVA();
            }
        });


        ImageView resultComedy = (ImageView) findViewById(R.id.comedybutton);
        resultComedy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendToCatComedy();
            }
        });

    }

    private void sendToResult0929()
    {
        Intent intent = new Intent(this, SearchResultScreen0929.class);
        startActivity(intent);
    }

    private void sendToResult0930()
    {
        Intent intent = new Intent(this, SearchResultScreen0930.class);
        startActivity(intent);
    }

    private void sendToResult1002()
    {
        Intent intent = new Intent(this, SearchResultScreen1002.class);
        startActivity(intent);
    }

    private void sendToResult1003()
    {
        Intent intent = new Intent(this, SearchResultScreen1003.class);
        startActivity(intent);
    }

    private void sendToResult1004()
    {
        Intent intent = new Intent(this, SearchResultScreen1004.class);
        startActivity(intent);
    }

    private void sendToCatCircus()
    {
        Intent intent = new Intent(this, SearchResultCircus.class);
        startActivity(intent);
    }


    private void sendToCatDance()
    {
        //Intent intent = new Intent(this, SearchResultDance.class);
        //startActivity(intent);
        Toast.makeText(getApplicationContext(), "No Results Found For 'Dance'", Toast.LENGTH_SHORT).show();
    }

    private void sendToCatEd()
    {
        //Intent intent = new Intent(this, SearchResultEd.class);
        //startActivity(intent);
        Toast.makeText(getApplicationContext(), "No Results Found For 'Education'", Toast.LENGTH_SHORT).show();
    }

    private void sendToCatFilm()
    {
        //Intent intent = new Intent(this, SearchResultFilm.class);
        //startActivity(intent);
        Toast.makeText(getApplicationContext(), "No Results Found For 'Film'", Toast.LENGTH_SHORT).show();
    }

    private void sendToCatLit()
    {
        //Intent intent = new Intent(this, SearchResultLit.class);
        //startActivity(intent);
        Toast.makeText(getApplicationContext(), "No Results Found For 'Literary'", Toast.LENGTH_SHORT).show();
    }

    private void sendToCatMusic()
    {
        Intent intent = new Intent(this, SearchResultMusic.class);
        startActivity(intent);
    }

    private void sendToCatSocial()
    {
        Intent intent = new Intent(this, SearchResultSocial.class);
        startActivity(intent);
    }

    private void sendToCatTheater()
    {
        //Intent intent = new Intent(this, SearchResultTheater.class);
        //startActivity(intent);
        Toast.makeText(getApplicationContext(), "No Results Found For 'Theater'", Toast.LENGTH_SHORT).show();
    }

    private void sendToCatVA()
    {
        //Intent intent = new Intent(this, SearchResultVA.class);
        //startActivity(intent);
        Toast.makeText(getApplicationContext(), "No Results Found For 'Visual Art'", Toast.LENGTH_SHORT).show();
    }

    private void sendToCatComedy()
    {
        Intent intent = new Intent(this, SearchResultComedy.class);
        startActivity(intent);
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
        TextView date928 = (TextView) findViewById(R.id.date0928);
        TextView date929 = (TextView) findViewById(R.id.date0929);
        TextView date930 = (TextView) findViewById(R.id.date0930);
        TextView date101 = (TextView) findViewById(R.id.date1001);
        TextView date102 = (TextView) findViewById(R.id.date1002);
        TextView date103 = (TextView) findViewById(R.id.date1003);
        TextView date104 = (TextView) findViewById(R.id.date1004);

        weekdaySU.setTypeface(robotoRegular);
        weekdayM.setTypeface(robotoRegular);
        weekdayT.setTypeface(robotoRegular);
        weekdayW.setTypeface(robotoRegular);
        weekdayTH.setTypeface(robotoRegular);
        weekdayF.setTypeface(robotoRegular);
        weekdayS.setTypeface(robotoRegular);
        date928.setTypeface(robotoRegular);
        date929.setTypeface(robotoRegular);
        date930.setTypeface(robotoRegular);
        date101.setTypeface(robotoRegular);
        date102.setTypeface(robotoRegular);
        date103.setTypeface(robotoRegular);
        date104.setTypeface(robotoRegular);

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
