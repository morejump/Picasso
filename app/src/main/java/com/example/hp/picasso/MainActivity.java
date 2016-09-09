package com.example.hp.picasso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private ImageView  imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init(){
        Log.d("bug", "init: ");
        button= (Button) findViewById(R.id.btn_getImage);
        imageView= (ImageView) findViewById(R.id.img_imageDownload);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Picasso.with(MainActivity.this).load("http://static.thanhnien.com.vn/uploaded/hoangnam/2015_08_24/2a_lyjm.jpg").into(imageView);
            }
        });
    }
}
