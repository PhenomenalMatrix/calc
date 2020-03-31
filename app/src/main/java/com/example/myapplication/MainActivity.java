package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    Double firstValues,secondValues,result_op;
    String opiration;
    boolean isEmpty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.result_field);
    }

    public void onNumberClick(View view) {
        switch (view.getId()){

            case R.id.one:
                result.append("1");
                break;

            case R.id.two:
                result.append("2");
                break;

            case R.id.three:
                result.append("3");
                break;

            case R.id.four:
                result.append("4");
                break;

            case R.id.five:
                result.append("5");
                break;

            case R.id.six:
                result.append("6");
                break;

            case R.id.seven:
                result.append("7");
                break;

            case R.id.eight:
                result.append("8");
                break;

            case R.id.nine:
                result.append("9");
                break;

            case R.id.clear:
                result.setText(null);
                break;

            case R.id.dot:
                if(isEmpty) {
                    result.setText("");
                }else {
                    result.append(".");
                }
        }
    }

    public void onOpirationClick(View view) {
        switch (view.getId()){

            case R.id.minus:
                firstValues = Double.valueOf(result.getText().toString());
                result.setText(firstValues + "-");
                opiration = "-";
                break;


            case R.id.plus:
                firstValues = Double.valueOf(result.getText().toString());
                result.setText(firstValues + "+");
                opiration = "+";
                break;

            case R.id.divide:
                firstValues = Double.valueOf(result.getText().toString());
                result.setText(firstValues + "/");
                opiration = "/";
                break;

            case R.id.multi:
                firstValues = Double.valueOf(result.getText().toString());
                result.setText(firstValues + "*");
                opiration = "*";
                break;

            case R.id.dot:
                firstValues = Double.valueOf(result.getText().toString());
                result.setText(firstValues + ".");
                opiration = ".";
                break;

            case R.id.equal:
                if(opiration!=null){
                    String two = result.getText().toString().replace(firstValues.toString() + opiration, " ");
                    secondValues =Double.valueOf(two);
                    switch (opiration){
                        case "+":
                            plus();
                            break;

                        case "-":
                            minus();
                            break;

                        case "*":
                            multi();
                            break;

                        case "/":
                            divide();
                            break;

                    }
                }
                break;

        }
    }

    public void plus(){
        result_op = firstValues + secondValues;
        result.setText(firstValues + "+" + secondValues + "=" + result_op);
    }

    public void minus(){
        result_op = firstValues - secondValues;
        result.setText(firstValues + "-" + secondValues + "=" + result_op);
    }

    public void multi(){
        result_op = firstValues * secondValues;
        result.setText(firstValues + "*" + secondValues + "=" + result_op);
    }


    public void divide(){
        result_op = firstValues / secondValues;
        result.setText(firstValues + "/" + secondValues + "=" + result_op);

    }
}
