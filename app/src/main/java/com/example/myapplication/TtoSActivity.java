package com.example.myapplication;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TtoSActivity extends AppCompatActivity {
    EditText edtttos;
    Button btnttos, btnwxit;
    TextToSpeech ttos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tto_sactivity);

        edtttos=findViewById(R.id.EdtTtoS);
        btnttos=findViewById(R.id.btnttos);

        ttos=new TextToSpeech(TtoSActivity.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {

            }
        });

        btnttos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int myNameIsRajatDas = ttos.speak("my name is rajat das", TextToSpeech.QUEUE_FLUSH, null, null);
            }
        });

















    }


}