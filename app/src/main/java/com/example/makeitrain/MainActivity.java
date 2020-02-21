package com.example.makeitrain;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private TextView moneyText;
    private int moneyCounter = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        moneyText=findViewById(R.id.money_text);


    }

    public void MoneyCount( View v) {

        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

        moneyCounter += 1000;

       moneyText.setText(String.valueOf(numberFormat.format(moneyCounter)));
        switch (moneyCounter) {
            case 10000:
                moneyText.setTextColor(Color.BLACK);
                break;
            case 15000:
                moneyText.setTextColor(Color.YELLOW);
                break;
            case 20000:
                moneyText.setTextColor(Color.GREEN);
                break;
            default:
                break;}

    }
}
