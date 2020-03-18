package com.csat.harmanassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    int index;
    double price;
    SeekBar seekBar;
    int quantity;
    EditText edittext , editText1;
    RadioButton btn1, btn2,btn3;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.food);
        seekBar = findViewById(R.id.seekbar);
        edittext = findViewById(R.id.heightTxt);
        editText1 = findViewById(R.id.price);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn = findViewById(R.id.submit);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                index = spinner.getSelectedItemPosition();
                System.out.println("postion is " + index);
                if (index == 0) {
                    price = 4.99;
                    String ab = String.valueOf(price);
                    edittext.setText(ab);

                } else if (index == 1) {
                    price = 3.88;
                    String ab = String.valueOf(price);
                    edittext.setText(ab);
                } else if (index == 2) {
                    price = 4.88;
                    String ab = String.valueOf(price);
                    edittext.setText(ab);
                } else if (index == 3) {
                    price = 5.88;
                    String ab = String.valueOf(price);
                    edittext.setText(ab);
                } else if (index == 4) {
                    price = 3.88;
                    String ab = String.valueOf(price);
                    edittext.setText(ab);
                } else if (index == 5) {
                    price = 8.0;
                    String ab = String.valueOf(price);
                    edittext.setText(ab);
                } else if (index == 6) {
                    price = 9.78;
                    String ab = String.valueOf(price);
                    edittext.setText(ab);
                } else if (index == 7) {
                    price = 2.887;
                    String ab = String.valueOf(price);
                    edittext.setText(ab);
                } else if (index == 8) {
                    price = 13.88;
                    String ab = String.valueOf(price);
                    edittext.setText(ab);
                } else if (index == 9) {
                    price = 7.8;
                    String ab = String.valueOf(price);
                    edittext.setText(ab);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //Another interface callback
            }
        });

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                quantity = seekBar.getProgress();
                System.out.println("Progress of seekbar " + quantity);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        if (btn1.isSelected() == true) {
            double totalPrice = (price * quantity) + 0.10 + 0.13;
            String rs = String.valueOf(totalPrice);
            editText1.setText(rs);
        } else if (btn2.isSelected() == true) {
            double totalPrice = (price * quantity) + 0.20 + 0.13;
            String rs = String.valueOf(totalPrice);
            editText1.setText(rs);
        } else if (btn3.isSelected() == true) {
            double totalPrice = (price * quantity) + 0.30 + 0.13;
            String rs = String.valueOf(totalPrice);
            editText1.setText(rs);
        }



    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, Second.class);
            startActivity(intent);
        }
    });
}}




