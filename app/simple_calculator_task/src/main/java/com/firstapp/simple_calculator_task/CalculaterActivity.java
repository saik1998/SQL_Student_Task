package com.firstapp.simple_calculator_task;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalculaterActivity extends AppCompatActivity  {

    boolean toNewop=true;
    String oldNumber="";
    String op="+";
    EditText editText1, number2;
    TextView outputre;

    Button button1, button2, button3, button4, button5, button6, button7, button8, button9,
            button0, buttonplus, buttondivi, buttonmul, buttonsub, buttonpercentage, buttondot,buttondot1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculater);

        editText1 = findViewById(R.id.value1);
//        number2 = findViewById(R.id.value2);

//        outputre = findViewById(R.id.result1);

        button1 = findViewById(R.id.one);

        button2=findViewById(R.id.two);

        button3=findViewById(R.id.three);

        button4=findViewById(R.id.four);

        button5=findViewById(R.id.five);

        button6=findViewById(R.id.six);

        button7=findViewById(R.id.seven);

        button8=findViewById(R.id.eight);

        button9=findViewById(R.id.nine);
        button0=findViewById(R.id.zero);
        buttondot=findViewById(R.id.dot);
        buttondot1=findViewById(R.id.dot1);



        buttonplus=findViewById(R.id.plus);//+

        buttondivi=findViewById(R.id.equls);//=
        buttonmul=findViewById(R.id.multiply);//*

        buttonsub=findViewById(R.id.minus);//-

        buttonpercentage=findViewById(R.id.division);

        buttondot=findViewById(R.id.dot);


    }

    public void numberEvent(View view) {
            if (toNewop)
                editText1.setText("");
            toNewop = false;

            String number = editText1.getText().toString();

            switch (view.getId()) {
                case R.id.one:
                    number += "1";
                    break;

                case R.id.two:
                    number += "2";
                    break;

                case R.id.three:
                    number += "3";
                    break;

                case R.id.four:
                    number += "4";
                    break;

                case R.id.five:
                    number += "5";
                    break;

                case R.id.six:
                    number += "6";
                    break;

                case R.id.seven:
                    number += "7";
                    break;

                case R.id.eight:
                    number += "8";
                    break;

                case R.id.nine:
                    number += "9";
                    break;

                case R.id.zero:
                    number += "0";
                    break;

                case R.id.plus:
                    number += "+";
                    break;

                case R.id.multiply:
                    number += "*";
                    break;
                case R.id.dot1:
                    number +=".";
                    break;

                case R.id.minus:
                    number += "-";
                    break;

                case R.id.equls:
                    number += "=";
                    break;

                case R.id.division:
                    number += "/";
                    break;
            }
            editText1.setText(number);
        }

    public void operatorEvent(View view) {
        toNewop=true;
        oldNumber=editText1.getText().toString();
        switch (view.getId()){
            case R.id.plus:op="+"; break;
            case R.id.minus:op="-"; break;
            case R.id.division:op="/"; break;
            case R.id.multiply:op="*"; break;

        }
    }



    public void eventEqual(View view) {
        String newNumber=editText1.getText().toString();
        int result2=0;
        switch (op){
            case "+":
                result2= (int) (Double.parseDouble(oldNumber)+Double.parseDouble(newNumber));
                break;
            case "-":
                result2= (int) ((int)Double.parseDouble(oldNumber)-Double.parseDouble(newNumber));
                break;
            case "*":
                result2= (int) (Double.parseDouble(oldNumber)*Double.parseDouble(newNumber));
                break;
            case "/":
                result2= (int) (Double.parseDouble(oldNumber)/Double.parseDouble(newNumber));
                break;

        }
        editText1.setText(result2+"");
    }

    public void acEvent(View view) {
        editText1.setText("0");
        toNewop=true;

    }
}



//    @Override
//    public void onClick(View v) {
//
//
//
//
//    }
//
//    }








//        binding.button8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                binding.etEdit.setText(binding.etEdit.getText() + "8");
//            }
//        });
//
//        binding.btnNine.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                binding.etEdit.setText(binding.etEdit.getText() + "9");
//            }
//        });
//
//        binding.btnFour.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                binding.etEdit.setText(binding.etEdit.getText() + "4");
//            }
//        });
//
//        binding.btnFive.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                binding.etEdit.setText(binding.etEdit.getText() + "5");
//            }
//        });
//
//        binding.btnSix.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                binding.etEdit.setText(binding.etEdit.getText() + "6");
//            }
//        });
//
//        binding.btnOne.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                binding.etEdit.setText(binding.etEdit.getText() + "1");
//            }
//        });
//
//        binding.btnTwo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                binding.etEdit.setText(binding.etEdit.getText() + "2");
//            }
//        });
//
//        binding.btnThree.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                binding.etEdit.setText(binding.etEdit.getText() + "3");
//            }
//        });
//
//
//        binding.btnDot.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                binding.etEdit.setText(binding.etEdit.getText() + ".");
//            }
//        });
//
//        binding.btnZero.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                binding.etEdit.setText(binding.etEdit.getText() + "0");
//            }
//        });
//
//        binding.btnEquals.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Calculate();
//                binding.tvInfo.setText(binding.tvInfo.getText().toString() + decimalFormat.format(val2) + " = " + decimalFormat.format(val1));
//                val1 = Double.NaN;
//                CURRENT_ACTION = '0';
//            }
//        });
//
//        binding.btnDivide.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Calculate();
//                CURRENT_ACTION = DIVISION;
//                binding.tvInfo.setText(decimalFormat.format(val1) + " / ");
//                binding.etEdit.setText(null);
//            }
//        });
//
//        binding.btnMultiply.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Calculate();
//                CURRENT_ACTION = MULTIPLICATION;
//                binding.tvInfo.setText(decimalFormat.format(val1) + " * ");
//                binding.etEdit.setText(null);
//            }
//        });
//
//
//        binding.btnAdd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Calculate();
//                CURRENT_ACTION = ADDITION;
//                binding.tvInfo.setText(decimalFormat.format(val1) + " + ");
//                binding.etEdit.setText(null);
//            }
//        });
//
//        binding.btnMinus.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Calculate();
//                CURRENT_ACTION = SUBTRACTION;
//                binding.tvInfo.setText(decimalFormat.format(val1) + " - ");
//                binding.etEdit.setText(null);
//            }
//        });
//
//        binding.btnClear.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(binding.etEdit.getText().length() > 0){
//                    CharSequence currentText = binding.etEdit.getText();
//                    binding.etEdit.setText(currentText.subSequence(0, currentText.length() - 1));
//                }else{
//                    val1 = Double.NaN;
//                    val2 = Double.NaN;
//                    binding.etEdit.setText("");
//                    binding.tvInfo.setText("");
//                }
//            }
//        });
//        private void Calculate(){
//            if (!Double.isNaN(val1)){
//                val2 = Double.parseDouble(binding.etEdit.getText().toString());
//                binding.etEdit.setText(null);
//
//                switch (CURRENT_ACTION){
//                    case ADDITION:
//                        val1 = this.val1 + val2;
//                        break;
//                    case SUBTRACTION:
//                        val1 = this.val1 - val2;
//                        break;
//                    case MULTIPLICATION:
//                        val1 = this.val1 * val2;
//                        break;
//                    case DIVISION:
//                        val1 = this.val1 / val2;
//                        break;
//                }
//            }else{
//                try{
//                    val1 = Double.parseDouble(binding.etEdit.getText().toString());
//                }catch (Exception e){}
//            }
//        }
















//        value1 = findViewById(R.id.edt1);
//        value1 = findViewById(R.id.edt2);
//
//        opresult = findViewById(R.id.outputresult);
//
//        add = findViewById(R.id.add1);
//        mul = findViewById(R.id.mul1);
//        div = findViewById(R.id.div1);
//        sub = findViewById(R.id.sub1);
//
//
//    }

//    public void multipication(View view) {
//        num1=Integer.valueOf(value1.getText().toString());
//        num2=Integer.valueOf(value1.getText().toString());
//        results= Double.valueOf(num1*num2);
//
//        opresult.setText(String.valueOf(results));
//
//
//
//
//    }
//
//    public void division(View view) {
//        num1=Integer.valueOf(value1.getText().toString());
//        num2=Integer.valueOf(value1.getText().toString());
//        results=Double.valueOf(num1/num2);
//
//        opresult.setText(String.valueOf(results));
//    }
//
//    public void substraction(View view) {
//        num1=Integer.valueOf(value1.getText().toString());
//        num2=Integer.valueOf(value1.getText().toString());
//
//
//        results=Double.valueOf(num1-num2);
//
//        opresult.setText(String.valueOf(results));
//    }
//
//    public void addition(View view) {
//        Toast.makeText(this, "Additing ", Toast.LENGTH_SHORT).show();
//
//        num1=Double.parseDouble(value1.getText().toString());
//        num2=Double.parseDouble(value1.getText().toString());
//
//        Double results=(num1+num2);
//        opresult.setText(String.valueOf(results));
//
//
//
//
////        num1=Integer.valueOf(value1.getText().toString());
////        num2=Integer.valueOf(value1.getText().toString());
////
////
////        results=Double.parseDouble(String.valueOf(num1+num2));
////
////        opresult.setText(String.valueOf(results));
//
//    }







