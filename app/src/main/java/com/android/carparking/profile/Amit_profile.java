package com.android.carparking.profile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.carparking.R;

public class Amit_profile extends AppCompatActivity {
    TextView phone_profile,Location;
    Button call,what_call;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amit_profile);
        what_call = findViewById(R.id.what_call);
        Location = findViewById(R.id.Location);

        what_call.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                gotoUrl("https://api.whatsapp.com/send/");


            }
        });

        Location.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.google.com/maps/");


            }
        });











    }

    private void gotoUrl(String s) {

        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}