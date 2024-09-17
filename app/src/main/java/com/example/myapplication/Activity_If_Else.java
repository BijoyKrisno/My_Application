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

public class Activity_If_Else extends AppCompatActivity {
    EditText edtnum1, edtnum2, edtnum3, edtnum4, edtnum5;
    Button btnnumber, btnnumber2, btnnumber3, btnnumber4, btnnumber5, btnnumber6, btnnumber7, btnnumber8;
    TextView tvdnumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_if_else);
        edtnum1=findViewById(R.id.edtnum1);
        edtnum2=findViewById(R.id.edtnum2);
        edtnum3=findViewById(R.id.edtnum3);
        edtnum4=findViewById(R.id.edtnum4);
        edtnum5=findViewById(R.id.edtnum5);

        btnnumber=findViewById(R.id.btnnumber);
        btnnumber2=findViewById(R.id.btnnumber2);
        btnnumber3=findViewById(R.id.btnnumber3);
        btnnumber4=findViewById(R.id.btnnumber4);
        btnnumber5=findViewById(R.id.btnnumber5);
        btnnumber6=findViewById(R.id.btnnumber6);
        btnnumber7=findViewById(R.id.btnnumber7);
        btnnumber8=findViewById(R.id.btnnumber8);

        tvdnumber=findViewById(R.id.tvdnumber);


        btnnumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int num1=Integer.parseInt(edtnum1.getText().toString());
                int num2=Integer.parseInt(edtnum2.getText().toString());


                if (num1>num2){
                    tvdnumber.setText("The Number Is Maximum"+num1);

                } else if (num1<num2) {
                tvdnumber.setText("the number is maximum"+num2);
                } else if (num1==num2) {
                tvdnumber.setText("they are equal");
                }
            }
        });

        //////////////==mamimum among three number==//////////


        btnnumber2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int N1=Integer.parseInt(edtnum1.getText().toString());
                int N2=Integer.parseInt(edtnum2.getText().toString());
                int N3=Integer.parseInt(edtnum3.getText().toString());

                if (N1>N2 && N1>N3){
                    tvdnumber.setText(" "+edtnum1);
                } else if (N2>N1 && N2>N3) {
                   tvdnumber.setText(" "+edtnum2);
                } else if (N3>N1 && N3>N2) {
                  tvdnumber.setText(" "+edtnum3);
                }

            }
        });

        ////////////////== Posistive Or Negetive==////////////

        
    btnnumber3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int p1=Integer.parseInt(edtnum1.getText().toString());

            if (p1<0){
                tvdnumber.setText("The Number Is "+p1+"Negetive");
            } else if (p1>0) {
              tvdnumber.setText("The Number Is "+p1+"Positive");
            } else if (p1==0) {
                tvdnumber.setText("the number is "+p1+"equal");
            }


        }
    });

//////////////////////==Divided By 5 0r 11 Start Here==///////////

        btnnumber4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            int intd=Integer.parseInt(edtnum1.getText().toString());
            if (intd % 5==0) {
              tvdnumber.setText("The Number Divided by 5"+intd);
            } else if (intd%11==0) {
              tvdnumber.setText("the number is divided ny 11"+intd);
            } else if (intd%5==0 && intd%11==0) {
              tvdnumber.setText("The Number is didived by 5 and 11"+intd);
            }


            }
        });

        /////////== Even Number Or Odd Number==////////

        btnnumber5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




         if (edtnum1.length()<1){
             edtnum1.setError("TYpe Something");
         } else {
             int EO=Integer.parseInt(edtnum1.getText().toString());
             if (EO%2==0){
                 tvdnumber.setText("The Number Is Even"+EO);
             } else if (EO%2==1) {
                 tvdnumber.setText("The Number Is Odd");
             }
         }

            }
        });
        //==========Leap Year Start Here//=========
        btnnumber6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int leap=Integer.parseInt(edtnum1.getText().toString());
                if (leap%4==0 && leap%400==0){
                    tvdnumber.setText("Is a Leap Year"+leap);
                } else if (leap%100!=0) {
                  tvdnumber.setText("Is not a Leap Year"+leap);
                } else{
                    tvdnumber.setText("Is a common Year");
                }

            }
        });
//=================== Result Sheet Is Start Here==///////////////
        btnnumber7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtnum1.length()<1){
                    edtnum1.setError("Type Something");
                } else if (edtnum2.length()<1) {
                    edtnum2.setError("Type Something");
                } else if (edtnum3.length()<1) {
                    edtnum3.setError("Type Something");
                } else if (edtnum4.length()<1) {
                    edtnum4.setError("Type Something");
                } else {
                    int m1=Integer.parseInt(edtnum1.getText().toString());
                    int m2=Integer.parseInt(edtnum2.getText().toString());
                    int m3=Integer.parseInt(edtnum3.getText().toString());
                    int m4=Integer.parseInt(edtnum4.getText().toString());
                    int m5=Integer.parseInt(edtnum5.getText().toString());
                    int sum=m1+m2+m3+m4+m5;
                    int avr=sum/5;


                    if (avr>=90){
                        tvdnumber.setText("Your Grade Is A");
                    } else if (avr>=80) {
                        tvdnumber.setText("Your Grade Is B");
                    } else if (avr>=60) {
                        tvdnumber.setText("Your Grade Is C");
                    } else if (avr>=40) {
                        tvdnumber.setText("Your Grade Is D");
                    } else {
                        tvdnumber.setText(" Your Are Fucking Fail");

                    }

                }
            }
        });

        //=========== Electrycity Bill==========///

btnnumber8.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {


        if (edtnum1.length()<1){
            edtnum1.setError("Type Your Unit In Number");
        }else {
            float unit=Float.parseFloat(edtnum1.getText().toString());

        float bill50=(float) ((unit*.5)+(unit*.2));

        float bill150=(float)((unit-50)*.75+25);
        float bill150f=(float)(bill150*.2);

        float bill250=(float) ((unit-150)*1.20+100);
        float bill250f=(float) (bill250*.2);

        float bill250p=(float) ((unit-250)*1.50+220);
        float bill250pf=(float) (bill250p*.2);

        if (unit<=50){
            tvdnumber.setText("The bill will be pay"+bill50);
        } else if (unit<=150) {
            tvdnumber.setText("The bill will be pay"+bill150f);
        } else if (unit<=250) {
          tvdnumber.setText("The bill will be pay"+bill250);
        } else if (unit>250) {
           tvdnumber.setText("The bill will be pay"+bill250pf);
        }


        }
    }
});


    }
}