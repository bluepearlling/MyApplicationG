package com.example.maishuling.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button LoginButton = (Button) findViewById(R.id.loginButton);

        LoginButton.setOnClickListener(new View.OnClickListener() {
                                           public void onClick(View view) {
                                               Intent i = new Intent(MainActivity.this, HomePage.class);
                                               startActivity(i);
                                           }

                                       }
        );
    }
}
