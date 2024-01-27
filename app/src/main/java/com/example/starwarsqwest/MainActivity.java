package com.example.starwarsqwest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends AppCompatActivity {
    static int randomNum = ThreadLocalRandom.current().nextInt(1, 8 + 1);
    String action = ("start"+ randomNum).toString();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button anakin = findViewById(R.id.button1);
        Button luke = findViewById(R.id.button2);
        Button sidius = findViewById(R.id.button3);





    }

    public void b1(View view) {
        Random rn = new Random();
        int randomNum = rn.nextInt(9 - 1 + 1) + 1;
        switch (randomNum) {
            case 1:
                Intent intent1 = new Intent(this, start1.class);
                intent1.putExtra("anakin", 1);
                startActivity(intent1);
                break;
            case 2:
                Intent intent2 = new Intent(this, start2.class);
                intent2.putExtra("anakin", 1);
                startActivity(intent2);
                break;
            case 3:
                Intent intent3 = new Intent(this, start3.class);
                intent3.putExtra("anakin", 1);
                startActivity(intent3);
                break;
            case 4:
                Intent intent4 = new Intent(this, start4.class);
                intent4.putExtra("anakin", 1);
                startActivity(intent4);
                break;
            case 5:
                Intent intent5 = new Intent(this, start5.class);
                intent5.putExtra("anakin", 1);
                startActivity(intent5);
                break;
            case 6:
                Intent intent6 = new Intent(this, start6.class);
                intent6.putExtra("anakin", 1);
                startActivity(intent6);
                break;
            case 7:
                Intent intent7 = new Intent(this, start7.class);
                intent7.putExtra("anakin", 1);
                startActivity(intent7);
                break;
            case 8:
                Intent intent8 = new Intent(this, start8.class);
                intent8.putExtra("anakin", 1);
                startActivity(intent8);
                break;
            case 9:
                Intent intent9 = new Intent(this, start9.class);
                intent9.putExtra("anakin", 1);
                startActivity(intent9);
                break;

        }
    }

    public void b2(View view) {
        Random rn = new Random();
        int randomNum = rn.nextInt(9 - 1 + 1) + 1;

        switch (randomNum) {
            case 1:
                Intent intent1 = new Intent(this, start1.class);
                intent1.putExtra("luke", 2);
                startActivity(intent1);
                break;
            case 2:
                Intent intent2 = new Intent(this, start2.class);
                intent2.putExtra("luke", 2);
                startActivity(intent2);
                break;
            case 3:
                Intent intent3 = new Intent(this, start3.class);
                intent3.putExtra("luke", 2);
                startActivity(intent3);
                break;
            case 4:
                Intent intent4 = new Intent(this, start4.class);
                intent4.putExtra("luke", 2);
                startActivity(intent4);
                break;
            case 5:
                Intent intent5 = new Intent(this, start5.class);
                intent5.putExtra("luke", 2);
                startActivity(intent5);
                break;
            case 6:
                Intent intent6 = new Intent(this, start6.class);
                intent6.putExtra("luke", 2);
                startActivity(intent6);
                break;
            case 7:
                Intent intent7 = new Intent(this, start7.class);
                intent7.putExtra("luke", 2);
                startActivity(intent7);
                break;
            case 8:
                Intent intent8 = new Intent(this, start8.class);
                intent8.putExtra("luke", 2);
                startActivity(intent8);
                break;
            case 9:
                Intent intent9 = new Intent(this, start9.class);
                intent9.putExtra("luke", 2);
                startActivity(intent9);
                break;

        }
//        Intent intent2 = new Intent(this, start1.class);
//        intent2.putExtra("luke", 2);
//        startActivity(intent2);
    }

    public void b3(View view) {
        Random rn = new Random();
        int randomNum = rn.nextInt(9 - 1 + 1) + 1;
        switch (randomNum) {
            case 1:
                Intent intent1 = new Intent(this, start1.class);
                intent1.putExtra("sidius", 3);
                startActivity(intent1);
                break;
            case 2:
                Intent intent2 = new Intent(this, start2.class);
                intent2.putExtra("sidius", 3);
                startActivity(intent2);
                break;
            case 3:
                Intent intent3 = new Intent(this, start3.class);
                intent3.putExtra("sidius", 3);
                startActivity(intent3);
                break;
            case 4:
                Intent intent4 = new Intent(this, start4.class);
                intent4.putExtra("sidius", 3);
                startActivity(intent4);
                break;
            case 5:
                Intent intent5 = new Intent(this, start5.class);
                intent5.putExtra("sidius", 3);
                startActivity(intent5);
                break;
            case 6:
                Intent intent6 = new Intent(this, start6.class);
                intent6.putExtra("sidius", 3);
                startActivity(intent6);
                break;
            case 7:
                Intent intent7 = new Intent(this, start7.class);
                intent7.putExtra("sidius", 3);
                startActivity(intent7);
                break;
            case 8:
                Intent intent8 = new Intent(this, start8.class);
                intent8.putExtra("sidius", 3);
                startActivity(intent8);
                break;
            case 9:
                Intent intent9 = new Intent(this, start9.class);
                intent9.putExtra("sidius", 3);
                startActivity(intent9);
                break;
        }





//        Intent intent3 = new Intent(this, start1.class);
//        intent3.putExtra("sidius", 3);
//        startActivity(intent3);
    }
}