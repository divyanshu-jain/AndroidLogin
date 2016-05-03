package com.example.divyanshujain.login1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class outputlogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outputlogin);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView tv1 = (TextView) findViewById(R.id.edittext1);
        tv1.setText(getIntent().getExtras().getString("keyforsendingtext1"));

        TextView tv2 = (TextView) findViewById(R.id.edittext2);
        tv2.setText(getIntent().getExtras().getString("keyforsendingtext2"));


    }

}
