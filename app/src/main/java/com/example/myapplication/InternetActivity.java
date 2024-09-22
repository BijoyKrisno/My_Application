package com.example.myapplication;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class InternetActivity extends AppCompatActivity {
    Button btnInternet;
    TextView tvdIntenet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internet);
        btnInternet=findViewById(R.id.btnInternet);
        tvdIntenet=findViewById(R.id.tvdInternet);

        btnInternet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ConnectivityManager connectivityManager = (ConnectivityManager) (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo=connectivityManager.getActiveNetworkInfo();
                if (networkInfo!=null && networkInfo.isConnectedOrConnecting()){
                    tvdIntenet.setText("Your Network Is Connected");
                } else {
                    tvdIntenet.setText("No Internet ");
                }



            }
        });

    }
}