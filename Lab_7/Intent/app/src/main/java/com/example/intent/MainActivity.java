package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnOpen=(Button)findViewById(R.id.btnOpenChildActivity);
        btnOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doOpenChildActivity();
            }
        });
    }
    public void doOpenChildActivity(){
        Intent myIntent=new Intent(this,ChildActivity.class);
        startActivity(myIntent);
    }
}
