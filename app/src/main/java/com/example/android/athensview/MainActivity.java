package com.example.android.athensview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the swim category
        TextView swim = (TextView) findViewById(R.id.swim);

        // Set a click listener on that View
        swim.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the swim category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SwimActivity}
                Intent swimIntent = new Intent(MainActivity.this, SwimActivity.class);

                // Start the new activity
                startActivity(swimIntent);
            }
        });

        // Find the View that shows the see category
        TextView see = (TextView) findViewById(R.id.see);

        // Set a click listener on that View
        see.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the see category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link com.example.android.athensview.SeeActivity}
                Intent seeIntent = new Intent(MainActivity.this, SeeActivity.class);

                // Start the new activity
                startActivity(seeIntent);
            }
        });

        // Find the View that shows the eat category
        TextView eat = (TextView) findViewById(R.id.eat);

        // Set a click listener on that View
        eat.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the eat category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link com.example.android.athensview.EatActivity}
                Intent eatIntent = new Intent(MainActivity.this, EatActivity.class);

                // Start the new activity
                startActivity(eatIntent);
            }
        });

        // Find the View that shows the party category
        TextView party = (TextView) findViewById(R.id.party);

        // Set a click listener on that View
        party.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the party category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PartyActivity}
                Intent partyIntent = new Intent(MainActivity.this, PartyActivity.class);

                // Start the new activity
                startActivity(partyIntent);
            }
        });
    }
}