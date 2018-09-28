package com.irish.salvador.salvadorlabexer5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.net.Uri;
import android.view.View;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.support.constraint.ConstraintLayout;


public class SecondMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d("LAB4", "onCreate() has executed.");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LAB4", "onStart() has executed.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LAB4", "onResume() has executed.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LAB4", "onPause() has executed.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LAB4", "onStop() has executed.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LAB4", "onDestroy() has executed.");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LAB4", "onRestart() has executed.");
    }


    public void Activity1Press(View v){
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }
    public void MapPress(View v){
        Uri g = Uri.parse("geo:14.587103, 120.981280");
        Intent i = new Intent(Intent.ACTION_VIEW, g);
        Intent chooser = Intent.createChooser(i, "Choose map application");
        startActivity(chooser);
    }
}
