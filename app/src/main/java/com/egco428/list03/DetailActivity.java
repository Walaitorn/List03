package com.egco428.list03;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

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

        String courseNum = getIntent().getStringExtra(MainActivity.Course_number);
        TextView courseNumText = (TextView)findViewById(R.id.number);
        courseNumText.setText("Course Number: " + courseNum);
        mapPic(courseNum);

        String courseCredit = getIntent().getStringExtra(MainActivity.Course_credit);
        TextView courseCreditText = (TextView)findViewById(R.id.credit);
        courseCreditText.setText("Course Credit: " + courseCredit);



        // courseImg = getIntent().getStringExtra(MainActivity.Course_number);
        //
        //String name = "p"+courseImg;
        //Img.setImageDrawable(R.drawable);
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

    public void mapPic (String courseNum){
        Map<String,Integer> map = new HashMap<String, Integer>();
        map.put("10101",R.drawable.p10101);
        map.put("10102",R.drawable.p10102);
        map.put("10103",R.drawable.p10103);
        map.put("10104",R.drawable.p10104);
        map.put("10105",R.drawable.p10105);
        map.put("10106",R.drawable.p10106);
        map.put("10107",R.drawable.p10107);
        map.put("10108",R.drawable.p10108);

        ImageView Img = (ImageView) findViewById(R.id.imageView2);
        Img.setImageResource(map.get(courseNum));
    }

}
