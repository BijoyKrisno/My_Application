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

public class Activitypower extends AppCompatActivity {
    EditText edtpower1, edtpower2, edtsqure1, edti;
    Button btnpower, btnsqure, btni;
    TextView tvdpower, tvdsqure, tvdi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitypower);

        edtpower1=findViewById(R.id.edtpower1);
        edtpower2=findViewById(R.id.edtpower2);
        btnpower=findViewById(R.id.btnpower);
        tvdpower=findViewById(R.id.tvdpower);
        edtsqure1=findViewById(R.id.edtsqure1);
        btnsqure=findViewById(R.id.btnsqure);
        tvdsqure=findViewById(R.id.tvdsqure);
        edti=findViewById(R.id.edti);
        btni=findViewById(R.id.btni);
        tvdi=findViewById(R.id.tvdi);


       btnpower.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
           int base, power, calc;
           base=Integer.parseInt(edtpower1.getText().toString());
           power=Integer.parseInt(edtpower2.getText().toString());
           calc= (int) Math.pow(base,power);
           tvdpower.setText(""+calc);

           }
       });
//=====================Power Close Here===============//



        //==============Squre Start Here=============//

        btnsqure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1;
                num1=Float.parseFloat(edtsqure1.getText().toString());
                float sum;
                sum= (float) Math.pow(num1,.5);
                tvdsqure.setText(""+sum);
            }
        });










        btni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvdi.setText("");


                int star = Integer.parseInt(edti.getText().toString());


                for (int x=1; x<=star; x++){

                    for (int y=1; y<=x; y++){
                        tvdi.append(" * ");
                    }
                    tvdi.append("\n");
                }

            }
        });























    }
}