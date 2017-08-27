package com.example.android.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int quanitiyA=0;
    int quanitiyB=0;

    public void incrementTeamA(View view){
        quanitiyA++;
        displayTeamA(quanitiyA);

    }

    public void incrementTeamB(View view){
        quanitiyB++;
        displayTeamB(quanitiyB);

    }

    private void displayTeamA(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.teamA);
        quantityTextView.setText("" + number);
    }
    private void displayTeamB(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.teamB);
        quantityTextView.setText("" + number);
    }




}
