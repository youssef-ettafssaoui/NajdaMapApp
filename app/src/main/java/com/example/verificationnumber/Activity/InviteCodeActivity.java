package com.example.verificationnumber.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

import com.example.verificationnumber.R;

public class InviteCodeActivity extends AppCompatActivity {


    String name,email,password, date,issharing, code;
    Uri imageUri;

    TextView t1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invite_code);
        t1 = (TextView) findViewById(R.id.textView);
        Intent myIntent = getIntent ();

        if (myIntent!=null) {
            name = myIntent.getStringExtra("name");
            email = myIntent.getStringExtra("email");
            password = myIntent.getStringExtra("password");
            code = myIntent.getStringExtra("code");
            issharing = myIntent.getStringExtra("isSharing");
            imageUri = myIntent.getParcelableExtra("imageUri");
        }
        t1.setText(code);

    }
}