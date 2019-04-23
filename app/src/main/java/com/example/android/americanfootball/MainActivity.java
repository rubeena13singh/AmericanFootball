package com.example.android.americanfootball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.android.americanfootball.R;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA=0;
    int scoreTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void SafetyAddOneForTeamA(View v) {
        scoreTeamA++;
        displayForTeamA(scoreTeamA);
    }
    public void SafetyAddOneForTeamB(View v) {
        scoreTeamB++;
        displayForTeamB(scoreTeamB);
    }
    public void addOneForTeamA(View v) {
        scoreTeamA++;
        displayForTeamA(scoreTeamA);
    }
    public void addOneForTeamB(View v) {
        scoreTeamB++;
        displayForTeamB(scoreTeamB);
    }
    public void addThreeForTeamA(View v) {
        scoreTeamA+=3;
        displayForTeamA(scoreTeamA);
    }
    public void addThreeForTeamB(View v) {
        scoreTeamB+=3;
        displayForTeamB(scoreTeamB);
    }
    public void addSixForTeamA(View v) {
        scoreTeamA+=6;
        displayForTeamA(scoreTeamA);
    }
    public void addSixForTeamB(View v) {
        scoreTeamB+=6;
        displayForTeamB(scoreTeamB);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void resetScore(View view) {
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
