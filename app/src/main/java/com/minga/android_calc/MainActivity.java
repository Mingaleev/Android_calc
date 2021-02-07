package com.minga.android_calc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Calc calc;

    Button button_clean;
    Button button_div;
    Button button_multiplication;
    Button button_minus;
    Button button_sum;
    Button button_result;
    Button button_point;
    Button button_0;
    Button button_1;
    Button button_2;
    Button button_3;
    Button button_4;
    Button button_5;
    Button button_6;
    Button button_7;
    Button button_8;
    Button button_9;
    TextView tv_calc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initButton();
        tv_calc = findViewById(R.id.tv_calc);
        calc = new Calc(tv_calc);
    }

    private void initButton() {
        button_clean = findViewById(R.id.button_clean);
        button_clean.setOnClickListener(this);
        button_div = findViewById(R.id.button_div);
        button_div.setOnClickListener(this);
        button_multiplication = findViewById(R.id.button_multiplication);
        button_multiplication.setOnClickListener(this);
        button_minus = findViewById(R.id.button_minus);
        button_minus.setOnClickListener(this);
        button_sum = findViewById(R.id.button_sum);
        button_sum.setOnClickListener(this);
        button_result = findViewById(R.id.button_result);
        button_result.setOnClickListener(this);
        button_point = findViewById(R.id.button_point);
        button_point.setOnClickListener(this);
        button_0 = findViewById(R.id.button_0);
        button_0.setOnClickListener(this);
        button_1 = findViewById(R.id.button_1);
        button_1.setOnClickListener(this);
        button_2 = findViewById(R.id.button_2);
        button_2.setOnClickListener(this);
        button_3 = findViewById(R.id.button_3);
        button_3.setOnClickListener(this);
        button_4 = findViewById(R.id.button_4);
        button_4.setOnClickListener(this);
        button_5 = findViewById(R.id.button_5);
        button_5.setOnClickListener(this);
        button_6 = findViewById(R.id.button_6);
        button_6.setOnClickListener(this);
        button_7 = findViewById(R.id.button_7);
        button_7.setOnClickListener(this);
        button_8 = findViewById(R.id.button_8);
        button_8.setOnClickListener(this);
        button_9 = findViewById(R.id.button_9);
        button_9.setOnClickListener(this);
    }



    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_0:
                calc.entering("0");
                break;
            case R.id.button_1: calc.entering("1");
                break;
            case R.id.button_2: calc.entering("2");
                break;
            case R.id.button_3: calc.entering("3");
                break;
            case R.id.button_4: calc.entering("4");
                break;
            case R.id.button_5: calc.entering("5");
                break;
            case R.id.button_6: calc.entering("6");
                break;
            case R.id.button_7: calc.entering("7");
                break;
            case R.id.button_8: calc.entering("8");
                break;
            case R.id.button_9: calc.entering("9");
                break;
            case R.id.button_point: calc.entering(".");
                break;
            case R.id.button_result: calc.result();
                break;
            case R.id.button_clean: calc.cleanTV();
                break;
            case R.id.button_sum: calc.sum();
                break;
            case R.id.button_minus: calc.minus();
                break;
            case R.id.button_multiplication: calc.multiplication();
                break;
            case R.id.button_div: calc.div();
                break;
        }
    }
}