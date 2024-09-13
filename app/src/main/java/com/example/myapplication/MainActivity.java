package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btnFac, btnTabji, btnPC, btnsum, btntem, btnpera, btnage, btnmetter, btnpower, btnpicaso,
            btnIfElse;
    TextView titleText;
    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.title_anim);

        titleText = findViewById(R.id.titleText);

        btnFac = findViewById(R.id.btnFac);
        btnTabji = findViewById(R.id.btnTabji);
        btnPC = findViewById(R.id.btnPC);
        btnsum = findViewById(R.id.btnsum);
        btntem=findViewById(R.id.btnTem);
        btnpera=findViewById(R.id.btnpera);
        btnage=findViewById(R.id.btnage);
        btnmetter=findViewById(R.id.btnmeter);
        btnpower=findViewById(R.id.btnpower);
        btnpicaso=findViewById(R.id.btnpicaso);
        btnIfElse = findViewById(R.id.btnIfElse);






        titleText.startAnimation(animation);








//======================btnFac Start Here ==============================//

        btnFac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent facIntent = new Intent(MainActivity.this, ActivityFac.class);
                startActivity(facIntent);

            }
        });


        //======================btnFac End Here ==============================//


        // ======================= btnTabji Start Here ====================//


        btnTabji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tabjiIntent = new Intent(MainActivity.this, ActivityTajbi.class);
                startActivity(tabjiIntent);
            }
        });


        // ======================= btnTabji End Here =====================//



        // =================== Button Calculator Start =================//

        btnPC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent calcIntent = new Intent(MainActivity.this, ActivityCalc.class);
                startActivity(calcIntent);
            }
        });



        // =================== Button Calculator End  ==================//
        //=================Sum Calculator Start============//

        btnsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent addIntent =new Intent(MainActivity.this, Activity_Add.class);
                startActivity(addIntent);
            }
        });



        //====================Tempeture================//
        btntem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
          Intent temIntent=new Intent(MainActivity.this,Activity_Tem.class);
          startActivity(temIntent);
            }
        });


        //====================Perimeter============//

        btnpera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent peraIntent=new Intent(MainActivity.this, Activity_Perimeter.class);
                startActivity(peraIntent);
            }
        });
        //================Age Calculetor Start Here=============//
        btnage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ageIntent=new Intent(MainActivity.this, ActivityAge.class);
                startActivity(ageIntent);

            }
        });
        //===========btnmeter start here===========//
        btnmetter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent metterIntent=new Intent(MainActivity.this, Activitymetter.class);
                startActivity(metterIntent);
            }
        });
        //=============Meter Close Here===========//





        //==============Power Start Here=============//
      btnpower.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent powerIntent=new Intent(MainActivity.this, Activitypower.class);
              startActivity(powerIntent);
          }
      });
      //=============Picaso start here==/////////
        btnpicaso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
          Intent picasoIntent=new Intent(MainActivity.this, ActivityPicaso.class);
          startActivity(picasoIntent);
            }
        });
        //===========================  ===========//

        //==================    =============//


        btnIfElse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, Activity_If_Else.class));
            }
        });

























    }



}