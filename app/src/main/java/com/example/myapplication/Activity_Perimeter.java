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

public class Activity_Perimeter extends AppCompatActivity {
    EditText edtpera1, edtpera2;
    Button btnpera;
    TextView tvdpera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perimeter);
        edtpera1=findViewById(R.id.edtpera1);
        edtpera2=findViewById(R.id.edtpera2);
        btnpera=findViewById(R.id.btnpera);
        tvdpera=findViewById(R.id.tvdpera);


        btnpera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            float num1, num2;
            num1=Float.parseFloat(edtpera1.getText().toString());
            num2=Float.parseFloat(edtpera2.getText().toString());
            float sum=2*(num1+num2);
            tvdpera.setText(""+sum);

            }
        });

    }
}


















