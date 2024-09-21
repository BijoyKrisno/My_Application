package com.example.myapplication;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ExitActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exit);
       button=findViewById(R.id.button);


       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               new AlertDialog.Builder(ExitActivity.this)
                       .setTitle("Do you want exit")
                       .setMessage("Hello")
                       .setCancelable(false)
                       .setNegativeButton("yes", new DialogInterface.OnClickListener() {
                           @Override
                           public void onClick(DialogInterface dialog, int which) {
                               button.setText("Dialog exit");

                           }
                       })
                       .setNeutralButton("Ok Fine", new DialogInterface.OnClickListener() {
                           @Override
                           public void onClick(DialogInterface dialog, int which) {
                               button.setText(" ");
                           }
                       })
                       .setPositiveButton("No", new DialogInterface.OnClickListener() {
                           @Override
                           public void onClick(DialogInterface dialog, int which) {
                               button.setText(" ");
                           }
                       })
                       .show();
           }
       });






    }
}