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

public class ActivityCalc extends AppCompatActivity {
    EditText edt1, edt2, edtbmi1, edtbmi2, edtbmi3;
    Button btnbs, btnhm, btnbmi;
    TextView tvdbs, tvdbmi1, tvdbmi2, tvdbmi3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        edt1=findViewById(R.id.edtbuy);
        edt2=findViewById(R.id.edtsell);
        edtbmi1=findViewById(R.id.edtbmi1);
        edtbmi2=findViewById(R.id.edtbmi2);
        edtbmi3=findViewById(R.id.edtbmi3);

        btnbs=findViewById(R.id.btnbs);
        btnhm=findViewById(R.id.btnhm);
        btnbmi=findViewById(R.id.btnbmi);

        tvdbs=findViewById(R.id.tvdbs);
        tvdbmi1=findViewById(R.id.tvdbmi1);
        tvdbmi2=findViewById(R.id.tvdbmi2);
        tvdbmi3=findViewById(R.id.tvdbmi3);

        //////////==========/////////

        btnbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int buyInt=Integer.parseInt(edt1.getText().toString());
                int sellInt=Integer.parseInt(edt2.getText().toString());
                int profit=sellInt-buyInt;
                float buyFloat=Float.parseFloat(edt1.getText().toString());
                float sellFloat=Float.parseFloat(edt2.getText().toString());
                float perFloat=((sellFloat-buyFloat)/buyFloat)*100;
                tvdbs.setText("Your Profit Is BDT"+profit+"\nProfit Prcentice Is "+perFloat );

            }
        });
        ///////////////==কতো টাকায় বিক্রি করতে হবে==/////////

        btnhm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.length()<1){
                edt1.setError("Type Something");
                } else {
                    float bfloat=Float.parseFloat(edt1.getText().toString());
                    float pfloat=Float.parseFloat(edt2.getText().toString());
                   float hmfloat=bfloat+bfloat*(pfloat/100);
                   tvdbs.setText("you have to sell "+hmfloat);

                }

            }
        });
        //===============BMI Calculetor===========//

        btnbmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              if (edtbmi1.length()<1){
                  edtbmi1.setError("Type Number ");
              } else if (edtbmi2.length()<1) {
                edtbmi2.setError("Type Number ");
              } else if (edtbmi3.length()<1) {
                  edtbmi3.setError("Type Number ");
              } else {

              int wint=Integer.parseInt(edtbmi1.getText().toString());
              int fint=Integer.parseInt(edtbmi2.getText().toString());
              int iint=Integer.parseInt(edtbmi3.getText().toString());
              int bmim= (int) ((fint*0.3048)+(iint*0.0254));
              int bmi=wint/(bmim)^2;
              tvdbmi3.setText(" "+bmi);
              int a;


              }
            }
        });












    }
}