package com.example.varun.usicttimetable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.chrisbanes.photoview.PhotoView;

public class itsem3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itsem3);
        PhotoView photoView=findViewById(R.id.it3);
        photoView.setImageResource(R.drawable.it3);
    }
}
