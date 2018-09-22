package com.example.maishuling.myapplication;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class MainActivity extends AppCompatActivity implements onTaskCompleted
{

    private Button testButton;
    TextView httpResult ;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testButton = (Button) findViewById(R.id.tryButton);
        testButton.setOnClickListener(new AwesomeButtonClick());
       // httpResult = (TextView) findViewById(R.id.httpView);


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



    private void awesomeButtonClicked()
    {
        testButton.setText("AWESOME!");
        asyncTask task = new asyncTask(MainActivity.this);
        task.execute();
    }

    class AwesomeButtonClick implements View.OnClickListener
    {
        @Override
        public void onClick(View v)
        {
            awesomeButtonClicked();
        }
    }

    @Override
    public void onTaskCompleted(String response)
    {
        // Just showing the response in a Toast message
        Toast.makeText(getApplicationContext(), response, Toast.LENGTH_LONG).show();
        //httpResult.setText(response);
        Log.v("toast",response);
    }


}
