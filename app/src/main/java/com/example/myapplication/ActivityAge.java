package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class ActivityAge extends AppCompatActivity {
    EditText edtage;
    Button btnage;
    TextView tvdage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);
        edtage=findViewById(R.id.edtage);
        btnage=findViewById(R.id.btnage);
        tvdage=findViewById(R.id.tvdage);


        btnage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int days = Integer.parseInt(edtage.getText().toString());

                int years = days/365;
                int mounts = days%365/30;
                int weeks= ((days-years*365)-30*mounts)/7;
                int day= ((days-years*365)-30*mounts)%7;

                tvdage.setText("Your age is :"+years+" Years \n"+mounts+" Mounts \n"+weeks+" Weeks \n"+ day+" Days");



            }
        });


    }
}