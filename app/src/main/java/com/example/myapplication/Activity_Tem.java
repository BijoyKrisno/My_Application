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

public class Activity_Tem extends AppCompatActivity {
    EditText edttem;
    Button btntem;
    TextView tvd1, tvd2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tem);

        edttem=findViewById(R.id.edttem);
        btntem=findViewById(R.id.btntem);
        tvd1=findViewById(R.id.tvdtem1);
        tvd2=findViewById(R.id.tvdtem2);


        btntem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (edttem.length()>0){
                    double cc=Double.parseDouble(edttem.getText().toString());
                    double kv=cc+273.15;
                    double fr=cc*9/5+32;
                    tvd1.setText(""+kv);
                    tvd2.setText(" "+fr);
                } else {
                    edttem.setError("Please Input a Number");
                }





            }
        });

    }
}