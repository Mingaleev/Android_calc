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
    String textNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initButton();
        tv_calc = findViewById(R.id.tv_calc);
        calc = new Calc();
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
        textNow = tv_calc.getText().toString();
        switch (view.getId()){
            case R.id.button_0: tv_calc.setText(calc.entering("0", textNow));
                break;
            case R.id.button_1: tv_calc.setText(calc.entering("1", textNow));
                break;
            case R.id.button_2: tv_calc.setText(calc.entering("2", textNow));
                break;
            case R.id.button_3: tv_calc.setText(calc.entering("3", textNow));
                break;
            case R.id.button_4: tv_calc.setText(calc.entering("4", textNow));
                break;
            case R.id.button_5: tv_calc.setText(calc.entering("5", textNow));
                break;
            case R.id.button_6: tv_calc.setText(calc.entering("6", textNow));
                break;
            case R.id.button_7: tv_calc.setText(calc.entering("7", textNow));
                break;
            case R.id.button_8: tv_calc.setText(calc.entering("8", textNow));
                break;
            case R.id.button_9: tv_calc.setText(calc.entering("9", textNow));
                break;
            case R.id.button_point: tv_calc.setText(calc.entering(".", textNow));
                break;
            case R.id.button_result: tv_calc.setText(calc.result(textNow));
                break;
            case R.id.button_clean: tv_calc.setText(calc.cleanTV());
                break;
            case R.id.button_sum: tv_calc.setText(calc.sum(textNow));
                break;
            case R.id.button_minus: tv_calc.setText(calc.minus(textNow));
                break;
            case R.id.button_multiplication: tv_calc.setText(calc.multiplication(textNow));
                break;
            case R.id.button_div: tv_calc.setText(calc.div(textNow));
                break;
        }
    }
}