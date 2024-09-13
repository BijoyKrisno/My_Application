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

public class Activity_Add extends AppCompatActivity {
    Button button;
    TextView tvdadd, tvdsub, tvdmul, tvddiv;
    EditText edt1, edt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        button = findViewById(R.id.button);
        tvdadd= findViewById(R.id.tvdadd);
        tvdsub= findViewById(R.id.tvdsub);
        tvdmul= findViewById(R.id.tvdmul);
        tvddiv= findViewById(R.id.tvddiv);
        edt1=findViewById(R.id.edt1);
        edt2=findViewById(R.id.edt2);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvdadd.setText("");
                tvdsub.setText("");
                tvdmul.setText("");
                tvddiv.setText("");

               if (edt1.length()<1) edt1.setError("Please Enter a Number");

               if (edt2.length()<1){
                   edt2.setError("Please Enter a Number");
               } else {
                   int num1 = Integer.parseInt(edt1.getText().toString());
                   int num2 = Integer.parseInt(edt2.getText().toString());
                   int add = num1 + num2;
                   int sub = num1 - num2;
                   int mul = num1 * num2;
                   float n1 = Float.parseFloat(edt1.getText().toString());
                   float n2 = Float.parseFloat(edt2.getText().toString());
                   float div = n1 / n2;

                   tvdadd.setText(""+add);
                   tvdsub.setText(""+sub);
                   tvdmul.setText(""+mul);
                   tvddiv.setText(""+div);

               }


            }
        });

    }
}