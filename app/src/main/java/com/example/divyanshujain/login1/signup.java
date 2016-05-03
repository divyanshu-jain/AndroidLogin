package com.example.divyanshujain.login1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final EditText et1 = (EditText) findViewById(R.id.edittext3);
        final EditText et2 = (EditText) findViewById(R.id.edittext4);
        final EditText et3 = (EditText) findViewById(R.id.edittext5);
        final EditText et4 = (EditText) findViewById(R.id.edittext6);


        Button b1 = (Button) findViewById(R.id.button4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signup.this, outputsignup.class);
                intent.putExtra("keyforsendingtext1", et1.getText().toString());
                intent.putExtra("keyforsendingtext2", et2.getText().toString());
                intent.putExtra("keyforsendingtext3", et3.getText().toString());
                intent.putExtra("keyforsendingtext4", et4.getText().toString());
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
            }
        });


    }

}
