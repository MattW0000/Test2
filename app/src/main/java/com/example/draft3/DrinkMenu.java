package com.example.draft3;
import com.example.draft3.Constants;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DrinkMenu extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track_drink);
        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Constants.drink++;
                closeDrinkMenu();
            }

        });
        Button button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Constants.drink++;
                closeDrinkMenu();
            }

        });
        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Constants.drink++;
                closeDrinkMenu();
            }

        });
        Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Constants.drink++;
                closeDrinkMenu();
            }

        });
    }
    public void closeDrinkMenu(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
