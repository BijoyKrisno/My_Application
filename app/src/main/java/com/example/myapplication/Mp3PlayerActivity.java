package com.example.myapplication;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Mp3PlayerActivity extends AppCompatActivity {
    ImageView implay;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mp3_player);
        implay=findViewById(R.id.implay);


        implay.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SuspiciousIndentation")
            @Override
            public void onClick(View v) {

                if (implay.getTag()!=null && implay.getTag().toString().contains("Not Playing")){
                    if (mediaPlayer!=null){
                        mediaPlayer.release();
                    }

                    mediaPlayer=MediaPlayer.create(Mp3PlayerActivity.this,R.raw.tu_jane_na);
                    mediaPlayer.start();
                    implay.setImageResource(R.drawable.pause);
                    implay.setTag("playing");
                } else {
                 if (mediaPlayer!=null)mediaPlayer.release();
                    implay.setImageResource(R.drawable.play);
                    implay.setTag("Not Playing");
                }




            }
        });

    }
}