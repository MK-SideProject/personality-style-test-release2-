package com.example.personality_style_test.foodtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class foodtest_12_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodtest12);

        Button foodtest_12_an1 = (Button) findViewById(R.id.foodtest_12_an1);
        Button foodtest_12_an2 = (Button) findViewById(R.id.foodtest_12_an2);

        foodtest_12_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent11 = getIntent();
                Bundle bundle = intent11.getExtras();

                int food_o = bundle.getInt("food_o");

                Intent intent12 = new Intent(getBaseContext(), foodtest_13_Activity.class);
                intent12.putExtra("food_o", food_o);

                startActivity(intent12);
            }
        });

        foodtest_12_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent11 = getIntent();
                Bundle bundle = intent11.getExtras();

                int food_o = bundle.getInt("food_o");
                food_o = food_o -1;

                Intent intent12 = new Intent(getBaseContext(), foodtest_13_Activity.class);
                intent12.putExtra("food_o", food_o);

                startActivity(intent12);
            }
        });
    }
}