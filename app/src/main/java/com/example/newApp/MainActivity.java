package com.example.newApp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Scanner;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Введите количество мостов N: ");
        int n = in.nextInt();
        if (!(n >= 1 && n<=1000)) {
            System.out.println("вы ввели n, не принадлежащее [1, 1000]!");
        } else {
            //counter
            int counter = 1;
            int indexLargeHeight = 0;
            while (counter <= n) {
                System.out.print("Введите высоту моста: ");
                int height = in.nextInt();
                if (height <=  437 && height <= 10000 && indexLargeHeight == 0) {
                    indexLargeHeight = counter;
                }
                counter++;
            }
            if (indexLargeHeight == 0) {
                System.out.println("No crash");
            } else {
                System.out.println("Crash " + indexLargeHeight);
                System.out.println("Else some strings");
            }
        }
    }
}
