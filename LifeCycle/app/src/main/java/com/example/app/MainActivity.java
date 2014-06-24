package com.example.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity
{

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Dans onCreate()", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStart() {
//l' activity est visible.
        super.onStart();
        Toast.makeText(this, " Dans onStart()", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onPause()
    {

        super.onPause();
        Toast.makeText(this, " Dans onPause()", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onResume()
    {

        super.onResume();
        Toast.makeText(this, " Dans onResume()", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStop()
    {
        //l'activity n'est plus visible
        super.onStop();
        Toast.makeText(this, "Dans onStop()", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onDestroy()
    {
//l'activité va être détruite
        super.onDestroy();
        Toast.makeText(this, "onDestroy()", Toast.LENGTH_LONG).show();
    }

}