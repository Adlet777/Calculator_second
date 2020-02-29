package com.example.calculator;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {



    private boolean isFunctionPressed = false;
    private double beforeTheSign = 0;
    private int afterTheSign = 0;
    private char curFunc;
    private boolean answerWasGiven = false;
    private boolean dotCounter = false;
    private String screenTemp = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_main);

        final TextView Calcscr = findViewById(R.id.calcscr);
        final Button One = findViewById(R.id.one);
        final Button Two = findViewById(R.id.two);
        final Button Three = findViewById(R.id.three);
        final Button Four = findViewById(R.id.four);
        final Button Five = findViewById(R.id.five);
        final Button Six = findViewById(R.id.six);
        final Button Seven = findViewById(R.id.seven);
        final Button Eight = findViewById(R.id.eight);
        final Button Nine = findViewById(R.id.nine);
        final Button Zero = findViewById(R.id.zero);
        final Button delete = findViewById(R.id.delete);
        final Button Clear = findViewById(R.id.clear);
        final Button Sum = findViewById(R.id.plus);
        final Button Equal = findViewById(R.id.equal);
        final Button Product = findViewById(R.id.product);
        final Button Division = findViewById(R.id.divide);
        final Button Minus = findViewById(R.id.minus);
        final Button Root = findViewById(R.id.root);
        final Button Power = findViewById(R.id.power);
        final Button Dot = findViewById(R.id.dot);


        final Button Percent = findViewById(R.id.percent);
        final Button Sin = findViewById(R.id.sin);
        final Button Cos = findViewById(R.id.cos);
        final Button Tan = findViewById(R.id.tan);
        final Button Ln = findViewById(R.id.ln);
        final Button Log = findViewById(R.id.log);
        final Button Pow2 = findViewById(R.id.pow);
        final Button Factorial = findViewById(R.id.factorial);
        final Button NthRoot = findViewById(R.id.nthroot);



        final View.OnClickListener CalculatorListener = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                final int id = v.getId();

                switch(id){

                    case R.id.dot:
                        if(dotCounter == false){
                        dotCounter = true;
                        Calcscr.append(".");
                        screenTemp = Calcscr.getText().toString();}
                        break;

                    case R.id.one:

                        if (answerWasGiven == true){
                            answerWasGiven = false;
                            Calcscr.setText("1");
                            screenTemp = Calcscr.getText().toString();

                            break;

                        }if(answerWasGiven == false){
                        Calcscr.append("1");
                        screenTemp = Calcscr.getText().toString();
                        break;}

                    case R.id.two:
                        if (answerWasGiven == true){
                            answerWasGiven = false;
                            Calcscr.setText("2");
                            screenTemp = Calcscr.getText().toString();
                            break;

                        }if(answerWasGiven == false){
                        Calcscr.append("2");
                        screenTemp = Calcscr.getText().toString();
                        break;}
                    case R.id.three:
                        if (answerWasGiven == true){
                            answerWasGiven = false;
                            Calcscr.setText("3");
                            screenTemp = Calcscr.getText().toString();
                            break;

                        }if(answerWasGiven == false){
                        Calcscr.append("3");
                        screenTemp = Calcscr.getText().toString();
                        break;}
                    case R.id.four:
                        if (answerWasGiven == true){
                            answerWasGiven = false;
                            Calcscr.setText("4");
                            screenTemp = Calcscr.getText().toString();
                            break;

                        }if(answerWasGiven == false){
                        Calcscr.append("4");
                        screenTemp = Calcscr.getText().toString();
                        break;}
                    case R.id.five:
                        if (answerWasGiven == true){
                            answerWasGiven = false;
                            Calcscr.setText("5");
                            screenTemp = Calcscr.getText().toString();
                            break;

                        }if(answerWasGiven == false){
                        Calcscr.append("5");
                        screenTemp = Calcscr.getText().toString();
                        break;}
                    case R.id.six:
                        if (answerWasGiven == true){
                            answerWasGiven = false;
                            Calcscr.setText("6");
                            screenTemp = Calcscr.getText().toString();
                            break;

                        }if(answerWasGiven == false){
                        Calcscr.append("6");
                        screenTemp = Calcscr.getText().toString();
                        break;}
                    case R.id.seven:
                        if (answerWasGiven == true){
                            answerWasGiven = false;
                            Calcscr.setText("7");
                            screenTemp = Calcscr.getText().toString();
                            break;

                        }if(answerWasGiven == false){
                        Calcscr.append("7");
                        screenTemp = Calcscr.getText().toString();
                        break;}
                    case R.id.eight:
                        if (answerWasGiven == true){
                            answerWasGiven = false;
                            Calcscr.setText("8");
                            screenTemp = Calcscr.getText().toString();
                            break;

                        }if(answerWasGiven == false){
                        Calcscr.append("8");
                        screenTemp = Calcscr.getText().toString();
                        break;}
                    case R.id.nine:
                        if (answerWasGiven == true){
                            answerWasGiven = false;
                            Calcscr.setText("9");
                            screenTemp = Calcscr.getText().toString();
                            break;

                        }if(answerWasGiven == false){
                        Calcscr.append("9");
                        screenTemp = Calcscr.getText().toString();
                        break;}
                    case R.id.zero:


                        if (answerWasGiven == true ){
                            answerWasGiven = false;
                            Calcscr.setText("0");
                            screenTemp = Calcscr.getText().toString();
                            break;

                        }if(answerWasGiven == false ){

                            Calcscr.append("0");
                            screenTemp = Calcscr.getText().toString();

                            break;

                            

                        }

                    case R.id.plus:


                        if(isFunctionPressed == false){
                            String scr = Calcscr.getText().toString();
                            afterTheSign = scr.length()+1;
                            beforeTheSign = Double.parseDouble(scr);
                            Calcscr.append("+");
                            screenTemp = Calcscr.getText().toString();
                            isFunctionPressed = true;
                            answerWasGiven = false;
                            curFunc = '+';
                            dotCounter = false;}
                        break;



                    case R.id.minus:


                        if(isFunctionPressed == false){
                            String scr = Calcscr.getText().toString();
                            afterTheSign = scr.length()+1;
                            beforeTheSign = Double.parseDouble(scr);
                            Calcscr.append("-");
                            screenTemp = Calcscr.getText().toString();
                            isFunctionPressed = true;
                            answerWasGiven = false;
                            curFunc = '-';
                            dotCounter = false;}
                        break;

                    case R.id.product:

                        if(isFunctionPressed == false){
                            String scr = Calcscr.getText().toString();
                            afterTheSign = scr.length()+1;
                            beforeTheSign = Double.parseDouble(scr);
                            Calcscr.append("*");
                            screenTemp = Calcscr.getText().toString();
                            isFunctionPressed = true;
                            answerWasGiven = false;
                            curFunc = '*';
                            dotCounter = false;}
                        break;

                    case R.id.divide:

                        if(isFunctionPressed == false){
                            String scr = Calcscr.getText().toString();
                            afterTheSign = scr.length()+1;
                            beforeTheSign = Double.parseDouble(scr);
                            Calcscr.append("/");
                            screenTemp = Calcscr.getText().toString();
                            isFunctionPressed = true;
                            answerWasGiven = false;
                            curFunc = '/';
                            dotCounter = false;}
                        break;

                    case R.id.root:

                        if(isFunctionPressed == false){
                            String scr = Calcscr.getText().toString();
                            double res = Double.parseDouble(scr);
                            res = Math.sqrt(res);

                            int ans = (int)res;
                            Calcscr.setText(String.valueOf(ans));
                            screenTemp = Calcscr.getText().toString();
                            dotCounter = false;

                        }
                        break;


                    case R.id.power:


                        if(isFunctionPressed == false){
                            String scr = Calcscr.getText().toString();
                            double res = Double.parseDouble(scr);

                            double answer = res * res;
                            Calcscr.setText(String.valueOf(answer));
                            screenTemp = Calcscr.getText().toString();
                            isFunctionPressed = false;
                            answerWasGiven = true;

                            dotCounter = false;}
                        break;


                    case R.id.percent:


                        if(isFunctionPressed == false ){
                            String scr = Calcscr.getText().toString();

                            double res = Double.parseDouble(scr);

                            double answer = res /100;
                            Calcscr.setText(String.valueOf(answer));
                            screenTemp = Calcscr.getText().toString();
                            }

                        break;

                    case R.id.sin:

                        if(isFunctionPressed == false){
                            String scr = Calcscr.getText().toString();
                            double res = Double.parseDouble(scr);
                            double r = Math.toRadians(res);
                            double result = Math.sin(r);


                            Calcscr.setText(String.valueOf(result));
                            screenTemp = Calcscr.getText().toString();
                            dotCounter = false;

                        }
                        break;

                    case R.id.cos:

                        if(isFunctionPressed == false){
                            String scr = Calcscr.getText().toString();
                            double res = Double.parseDouble(scr);
                            double r = Math.toRadians(res);
                            double result = Math.cos(r);


                            Calcscr.setText(String.valueOf(result));
                            screenTemp = Calcscr.getText().toString();
                            dotCounter = false;

                        }
                        break;

                    case R.id.tan:

                        if(isFunctionPressed == false){
                            String scr = Calcscr.getText().toString();
                            double res = Double.parseDouble(scr);
                            double r = Math.toRadians(res);
                            double result = Math.tan(r);


                            Calcscr.setText(String.valueOf(result));
                            screenTemp = Calcscr.getText().toString();
                            dotCounter = false;

                        }
                        break;

                    case R.id.log:

                        if(isFunctionPressed == false){
                            String scr = Calcscr.getText().toString();
                            double res = Double.parseDouble(scr);
                            double r = Math.toRadians(res);
                            double result = Math.log10(r);


                            Calcscr.setText(String.valueOf(result));
                            screenTemp = Calcscr.getText().toString();
                            dotCounter = false;

                        }
                        break;

                    case R.id.ln:

                        if(isFunctionPressed == false){
                            String scr = Calcscr.getText().toString();
                            double res = Double.parseDouble(scr);
                            double r = Math.toRadians(res);
                            double result = Math.log(r);


                            Calcscr.setText(String.valueOf(result));
                            screenTemp = Calcscr.getText().toString();
                            dotCounter = false;

                        }
                        break;

                    case R.id.factorial:
                        if(isFunctionPressed == false){
                            String scr = Calcscr.getText().toString();
                            int res = Integer.parseInt(scr);
                            int cnt = 1;

                            for(int a = 1; a<=res ; a++ ){
                                cnt = cnt * a;
                            }

                            Calcscr.setText(String.valueOf(cnt));
                            screenTemp = Calcscr.getText().toString();
                        }
                        break;


                    case R.id.nthroot:


                        if(isFunctionPressed == false){
                            String scr = Calcscr.getText().toString();
                            afterTheSign = scr.length()+1;
                            beforeTheSign = Double.parseDouble(scr);
                            Calcscr.append("√");
                            screenTemp = Calcscr.getText().toString();
                            isFunctionPressed = true;
                            answerWasGiven = false;
                            curFunc = '√';
                            dotCounter = false;}
                        break;


                    case R.id.pow:


                        if(isFunctionPressed == false){
                            String scr = Calcscr.getText().toString();
                            afterTheSign = scr.length()+1;
                            beforeTheSign = Double.parseDouble(scr);
                            Calcscr.append("^");
                            screenTemp = Calcscr.getText().toString();
                            isFunctionPressed = true;
                            answerWasGiven = false;
                            curFunc = '^';
                            dotCounter = false;}
                        break;

                    case R.id.equal:

                        if(isFunctionPressed ){
                            if(curFunc == '+'){
                                String str = Calcscr.getText().toString();
                                double SecondNumber = Double.parseDouble(str.substring(afterTheSign, str.length()));
                                SecondNumber += beforeTheSign;
                                Calcscr.setText(String.valueOf(SecondNumber));
                                screenTemp = Calcscr.getText().toString();
                                isFunctionPressed = false;
                                curFunc = ' ';
                                answerWasGiven = true;
                                dotCounter = true;
                                }

                            if(curFunc == '-'){
                                String str = Calcscr.getText().toString();
                                double SecondNumber = Double.parseDouble(str.substring(afterTheSign, str.length()));
                                SecondNumber = beforeTheSign - SecondNumber;
                                Calcscr.setText(String.valueOf(SecondNumber));
                                screenTemp = Calcscr.getText().toString();
                                isFunctionPressed = false;
                                curFunc = ' ';
                                answerWasGiven = true;
                                dotCounter = true;
                                }

                            if(curFunc == '*'){
                                String str = Calcscr.getText().toString();
                                double SecondNumber = Double.parseDouble(str.substring(afterTheSign, str.length()));
                                SecondNumber *= beforeTheSign;
                                Calcscr.setText(String.valueOf(SecondNumber));
                                screenTemp = Calcscr.getText().toString();
                                isFunctionPressed = false;
                                curFunc = ' ';
                                answerWasGiven = true;
                                dotCounter = true;

                            }

                            if(curFunc == '/'){
                                String str = Calcscr.getText().toString();
                                double SecondNumber = Double.parseDouble(str.substring(afterTheSign, str.length()));
                                //SecondNumber /= beforeTheSign;
                                if(SecondNumber == 0){
                                    Calcscr.setText("error");
                                    screenTemp = Calcscr.getText().toString();
                                    isFunctionPressed = false;
                                    curFunc = ' ';
                                    answerWasGiven = true;
                                    dotCounter = true;
                                    break;
                                }
                                else {
                                double res = beforeTheSign / SecondNumber;
                                //Calcscr.setText(String.valueOf(SecondNumber));
                                Calcscr.setText(String.valueOf(res));
                                screenTemp = Calcscr.getText().toString();
                                isFunctionPressed = false;
                                curFunc = ' ';
                                answerWasGiven = true;
                                dotCounter = true;
                                break;}
                                }

                            if(curFunc == '√'){
                                String str = Calcscr.getText().toString();
                                Double SecondNumber = Double.parseDouble(str.substring(afterTheSign, str.length()));
                                double result = Math.pow(SecondNumber, 1/beforeTheSign);
                                double res = Math.abs(Math.round(result));
                                Calcscr.setText(String.valueOf(res));
                                screenTemp = Calcscr.getText().toString();
                                isFunctionPressed = false;
                                curFunc = ' ';
                                answerWasGiven = true;
                                dotCounter = true;

                            }

                            if(curFunc == '^'){
                                String str = Calcscr.getText().toString();
                                double SecondNumber = Double.parseDouble(str.substring(afterTheSign, str.length()));
                                double result = Math.pow(beforeTheSign, SecondNumber);
                                Calcscr.setText(String.valueOf(result));
                                screenTemp = Calcscr.getText().toString();
                                isFunctionPressed = false;
                                curFunc = ' ';
                                answerWasGiven = true;
                                dotCounter = true;

                            }

                        }
                        break;


                }

            }

        };
        One.setOnClickListener(CalculatorListener);
        Two.setOnClickListener(CalculatorListener);
        Three.setOnClickListener(CalculatorListener);
        Four.setOnClickListener(CalculatorListener);
        Five.setOnClickListener(CalculatorListener);
        Six.setOnClickListener(CalculatorListener);
        Seven.setOnClickListener(CalculatorListener);
        Eight.setOnClickListener(CalculatorListener);
        Nine.setOnClickListener(CalculatorListener);
        Zero.setOnClickListener(CalculatorListener);
        Sum.setOnClickListener(CalculatorListener);
        Equal.setOnClickListener(CalculatorListener);
        Product.setOnClickListener(CalculatorListener);
        Division.setOnClickListener(CalculatorListener);
        Minus.setOnClickListener(CalculatorListener);
        Root.setOnClickListener(CalculatorListener);
        Power.setOnClickListener(CalculatorListener);
        Dot.setOnClickListener(CalculatorListener);

        Percent.setOnClickListener(CalculatorListener);
        Sin.setOnClickListener(CalculatorListener);
        Cos.setOnClickListener(CalculatorListener);
        Tan.setOnClickListener(CalculatorListener);
        Ln.setOnClickListener(CalculatorListener);
        Log.setOnClickListener(CalculatorListener);
        Pow2.setOnClickListener(CalculatorListener);
        Factorial.setOnClickListener(CalculatorListener);
        NthRoot.setOnClickListener(CalculatorListener);



        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = Calcscr.getText().toString();
                int length = str.length();

                if(length>0){


                        str = str.substring(0, length - 1);
                        Calcscr.setText(str);
                        screenTemp = Calcscr.getText().toString();
                        dotCounter = false;


                }
            }
        });


        Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Calcscr.setText("");
                screenTemp = Calcscr.getText().toString();
                dotCounter = false;

            }
        });


        if(savedInstanceState != null) {
           screenTemp = savedInstanceState.getString("screenTemp");
           Calcscr.setText(screenTemp);
           beforeTheSign = savedInstanceState.getDouble("beforeTheSign");
           isFunctionPressed = savedInstanceState.getBoolean("isFunctionPressed");
           afterTheSign = savedInstanceState.getInt("afterTheSign");
           curFunc = savedInstanceState.getChar("curFunc");
           answerWasGiven = savedInstanceState.getBoolean("answerWasGiven");
           dotCounter = savedInstanceState.getBoolean("dotCounter");
        }


    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("screenTemp", screenTemp);
        outState.putDouble("beforeTheSign", beforeTheSign);
        outState.putBoolean("isFunctionPressed", isFunctionPressed);
        outState.putInt("afterTheSign", afterTheSign);
        outState.putChar("curFunc", curFunc);
        outState.putBoolean("answerWasGiven", answerWasGiven);
        outState.putBoolean("dotCounter", dotCounter);
    }


}
