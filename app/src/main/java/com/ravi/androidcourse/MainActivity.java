package com.ravi.androidcourse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    double input1 = 0, input2 = 0;
    boolean Addition, Subtraction, Multiplication, Division, mRemainder, decimal;
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnAdd, btnDiv, btnSub, btnMul, btnEqual, Remainder, btnClear;

    TextView textView;
    String mainText = "";

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textview);
        // numbers
        btn0 = findViewById(R.id.btn_0);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);
        btn5 = findViewById(R.id.btn_5);
        btn6 = findViewById(R.id.btn_6);
        btn7 = findViewById(R.id.btn_7);
        btn8 = findViewById(R.id.btn_8);
        btn9 = findViewById(R.id.btn_9);
        btnEqual = findViewById(R.id.btn_equal);


        // operators
        btnEqual = findViewById(R.id.btn_equal);

        btnDiv = findViewById(R.id.btn_div);
        btnAdd = findViewById(R.id.btn_plus);
        btnSub = findViewById(R.id.btn_minus);
        btnMul = findViewById(R.id.btn_multiply);

        btnClear = findViewById(R.id.btn_clear);

        //numbers listner
        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);

        //operator listner
        btnAdd.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnSub.setOnClickListener(this);

        btnClear.setOnClickListener(this);
        btnEqual.setOnClickListener(this);


    }

    @Override
    public void onClick(View View) {
        switch (View.getId()) {
            case R.id.btn_0:
                mainText = mainText + 0;
                textView.setText(mainText);
                break;

            case R.id.btn_1:
                mainText = mainText + 1;
                textView.setText(mainText);
                break;

            case R.id.btn_2:
                mainText = mainText + 2;
                textView.setText(mainText);
                break;

            case R.id.btn_3:
                mainText = mainText + 3;
                textView.setText(mainText);
                break;

            case R.id.btn_4:
                mainText = mainText + 4;
                textView.setText(mainText);
                break;

            case R.id.btn_5:
                mainText = mainText + 5;
                textView.setText(mainText);
                break;

            case R.id.btn_6:
                mainText = mainText + 6;
                textView.setText(mainText);
                break;

            case R.id.btn_7:
                mainText = mainText + 7;
                textView.setText(mainText);
                break;

            case R.id.btn_8:
                mainText = mainText + 8;
                textView.setText(mainText);
                break;

            case R.id.btn_9:
                mainText = mainText + 9;
                textView.setText(mainText);
                break;

            case R.id.btn_plus:
                if (textView.getText().length() != 0)
                    input1 = Float.parseFloat(textView.getText() + "");
                Addition = true;
                decimal = false;
                textView.setText(null);
                break;

            case R.id.btn_minus:
                if (textView.getText().length() != 0)
                    input1 = Float.parseFloat(textView.getText() + "");
                Subtraction = true;
                decimal = false;
                textView.setText(null);
                break;

            case R.id.btn_multiply:
                if (textView.getText().length() != 0)
                    input1 = Float.parseFloat(textView.getText() + "");
                Multiplication = true;
                decimal = false;
                textView.setText(null);
                break;

            case R.id.btn_div:
                if (textView.getText().length() != 0)
                    input1 = Float.parseFloat(textView.getText() + "");
                Division = true;
                decimal = false;
                textView.setText(null);
                break;

            case R.id.btn_equal:
                if (Addition || Subtraction || Multiplication || Division || mRemainder) {
                    input2 = Float.parseFloat(textView.getText() + "");
                }

                if (Addition) {

                    textView.setText(input1 + input2 + "");
                    Addition = false;
                }

                if (Subtraction) {

                    textView.setText(input1 - input2 + "");
                    Subtraction = false;
                }

                if (Multiplication) {
                    textView.setText(input1 * input2 + "");
                    Multiplication = false;
                }

                if (Division) {
                    textView.setText(input1 / input2 + "");
                    Division = false;
                }
                if (mRemainder) {
                    textView.setText(input1 % input2 + "");
                    mRemainder = false;
                }
            case R.id.btn_clear:
                mainText = mainText + btnClear;
                textView.setText(mainText);
                break;

        }
    }

}