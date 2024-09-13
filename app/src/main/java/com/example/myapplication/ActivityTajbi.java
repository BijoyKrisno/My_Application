package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityTajbi extends AppCompatActivity {
    Button buttonadd, buttonsub, buttonreset;
    TextView tvd;
int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tajbi);
        buttonadd=findViewById(R.id.btnAdd);
         buttonsub=findViewById(R.id.btnSub);
         buttonreset=findViewById(R.id.btnReset);
         tvd=findViewById(R.id.tvd);



         buttonadd.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

              //tvd ++//
                 count++;
               tvd.setText(""+count);

             }
         });


         buttonsub.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 count--;
                 tvd.setText(""+count);


             }
         });

        buttonreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count=0;
                tvd.setText(""+count);


            }
        });







    }

}