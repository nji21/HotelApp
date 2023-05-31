package com.mateuspanji192102109.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView _imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _imageView1 = (ImageView) findViewById(R.id.imageView1);

        String imageUrl = "https://i0.wp.com/theluxurytravelexpert.com/wp-content/uploads/2019/05/SHANGRI-LA-BOROCAY-RESORT-SPA-THE-PHILIPPINES.jpg?ssl=1";
        Picasso.with(this).load(imageUrl).into(_imageView1);
    }
}