package com.example.draft3;

import static com.example.draft3.Constants.drink;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.textView3);
        textView.setText(Integer.toString(drink));
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDrinkMenu();
            }

        });
    }
    public void openDrinkMenu(){
        Intent intent = new Intent(this, DrinkMenu.class);
        startActivity(intent);
    }
}