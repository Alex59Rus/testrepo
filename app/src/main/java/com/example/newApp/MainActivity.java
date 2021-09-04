package com.example.newApp;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private Calc calculator;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] numbersIds = new int[]{
                R.id.zero,
                R.id.one,
                R.id.two,
                R.id.three,
                R.id.four,
                R.id.five,
                R.id.six,
                R.id.seven,
                R.id.eight,
                R.id.nine
        };
        int[] actionsIds = new int[] {
                R.id.plus,
                R.id.minus,
                R.id.equals,
                R.id.percent,
                R.id.division,
                R.id.multiply
        };
        calculator = new Calc();
        //создание обработчиков событий для различных кнопок
        View.OnClickListener numberButtonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //при нажатии передаем в калькулятор идентификатор нажатой кнопки
                calculator.onNumPressed(view.getId());
            }
        View.OnClickListener actionButtonOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            calculator.onActionPressed(view.getId());
            }
        }
        }
    }
}
