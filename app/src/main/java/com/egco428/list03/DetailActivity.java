package com.egco428.list03;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.NumberFormat;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String courseTitle = getIntent().getStringExtra(MainActivity.Course_Title);
        TextView titleText = (TextView)findViewById(R.id.courseTitleText);
        titleText.setText(courseTitle);

        String courseDesc = getIntent().getStringExtra(MainActivity.Course_Desc);
        TextView descText = (TextView)findViewById(R.id.descriptionTxt);
        descText.setText(courseDesc);

        int courseNo = getIntent().getIntExtra(MainActivity.Course_Number,10101);
        TextView courseNoText = (TextView)findViewById(R.id.courseNoText);
        courseNoText.setText("Course No.: "+courseNo);

        double credits = getIntent().getDoubleExtra(MainActivity.Course_Credit,1);
        TextView creditsTxt = (TextView)findViewById(R.id.creditsText);
        NumberFormat formatter = NumberFormat.getInstance();
        formatter.setMinimumFractionDigits(1);
        creditsTxt.setText("Credits: "+formatter.format(credits));

        ImageView detailImage = (ImageView)findViewById(R.id.imageCourse);
        int res = getResources().getIdentifier("image"+courseNo,"drawable",getPackageName());
        detailImage.setImageResource(res);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_detail, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
         if(id == android.R.id.home){
            finish();
        }

        return super.onOptionsItemSelected(item);
    }



}
