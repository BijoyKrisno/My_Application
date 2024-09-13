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

public class Activitymetter extends AppCompatActivity {
    EditText edtmeter;
    Button btnmetter;
    TextView tvdmeter1, tvdmeter2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitymetter);

        edtmeter=findViewById(R.id.edtmeter);
        btnmetter=findViewById(R.id.btnmeter);
        tvdmeter1=findViewById(R.id.tvdmeter1);
        tvdmeter2=findViewById(R.id.tvdmeter2);

        btnmetter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double cm=Double.parseDouble(edtmeter.getText().toString());
                double m=cm/100;
                double klm=cm/1000;
                tvdmeter1.setText(" "+m);
                tvdmeter2.setText(" "+klm);

            }
        });









    }
}