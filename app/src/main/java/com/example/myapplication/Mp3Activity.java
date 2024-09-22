package com.example.myapplication;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.io.IOException;

public class Mp3Activity extends AppCompatActivity {
    Button btnmp3offline, btnmp3online;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mp3);
        btnmp3offline=findViewById(R.id.btnmp3offline);
        btnmp3online=findViewById(R.id.btnmp3online);

        btnmp3offline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if (mediaPlayer!=null){
                    MediaPlayer mediaPlayer1 = mediaPlayer;
                    mediaPlayer1.release();
                }



                mediaPlayer=MediaPlayer.create(Mp3Activity.this,R.raw.tu_jane_na);
                MediaPlayer mediaPlayer1 = mediaPlayer;
                mediaPlayer1.start();

            }
        });


btnmp3online.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if (mediaPlayer!=null){
            MediaPlayer mediaPlayer1 = mediaPlayer;
            mediaPlayer1.release();
        }

      mediaPlayer =new MediaPlayer();
        try {
            mediaPlayer.setDataSource("https://file-examples.com/storage/fee0ddbaf066ed3199cfa16/2017/11/file_example_MP3_5MG.mp3");
            mediaPlayer.prepare();
            MediaPlayer mediaPlayer1 = mediaPlayer;
            mediaPlayer1.start();
        } catch (IOException e) {
            throw new RuntimeException(e);

        }


    }
});




    }
}