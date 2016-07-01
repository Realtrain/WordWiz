package com.mattrine.wordwiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void playGame(View v){
        Intent intent = new Intent(MainActivity.this, gameplay.class);
        MainActivity.this.startActivity(intent);
    }


}
