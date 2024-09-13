package com.example.myapplication;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.squareup.picasso.Picasso;

public class ActivityPicaso extends AppCompatActivity {
    ImageView ivpicaso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_picaso);
       ivpicaso=findViewById(R.id.ivpicaso);


        Picasso.with(ActivityPicaso.this)
                .load("https://proseobd.com/wp-content/uploads/2022/06/SEO-Expert.png")
                .into(ivpicaso);
















    }
}