package com.example.nickp.changemakerproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by nickp on 1/10/2017.
 */

public class Splash extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Thread timerThread = new Thread()
        {
            public void run()
            {
                try
                {
                    sleep(4000);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
                finally
                {
                    Intent intent = new Intent(Splash.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        finish();
    }
}
