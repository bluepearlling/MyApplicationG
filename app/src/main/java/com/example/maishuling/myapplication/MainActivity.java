package com.example.maishuling.myapplication;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button LoginButton = (Button) findViewById(R.id.loginButton);

        LoginButton.setOnClickListener(new View.OnClickListener()
                                       {
                                           public void onClick(View view)
                                           {
                                               Intent i = new Intent(MainActivity.this, HomePage.class);
                                               startActivity(i);
                                           }

                                       }
        );
    }

}
