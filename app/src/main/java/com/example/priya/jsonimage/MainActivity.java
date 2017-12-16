package com.example.priya.jsonimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Loader image - will be shown before loading image
int loader = R.mipmap.ic_launcher;

// Imageview to show
ImageView image = (ImageView) findViewById(R.id.image);

// Image url
String image_url = "https://api.androidhive.info/images/sample.jpg";

// ImageLoader class instance
ImageLoader imgLoader = new ImageLoader(getApplicationContext());

// whenever you want to load an image from url
// call DisplayImage function
// url - image url to load
// loader - loader image, will be displayed before getting image
// image - ImageView
imgLoader.DisplayImage(image_url, loader, image);
}
}
