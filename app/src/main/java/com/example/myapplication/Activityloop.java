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

public class Activityloop extends AppCompatActivity {
    Button btn;
    TextView tvd1, tvd2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityloop);

        btn = findViewById(R.id.btn);

        tvd1 = findViewById(R.id.tvd1);
        tvd2 = findViewById(R.id.tvd2);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a =1;
                int b = 49;
                int sum = 0;



                for (int x=a; x<=b; x++) {


                    sum = sum+x;

                        tvd2.setText(" "+sum);




                }
            }
        });
















    }
}