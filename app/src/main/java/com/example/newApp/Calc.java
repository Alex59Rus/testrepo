package com.example.newApp;

public class Calc {
    private int firstArg;
    private int secondArg;

    StringBuilder inputStr = new StringBuilder();

    private State state;

    private enum State {
        firstArgInput,
        secondArgInput,
        resultShow
    }
    //конструктор для инициализации полей
    public Calc() {
        state = State.firstArgInput;
    }
    //реакция на нажатие кнопки с цифрой
    public void onNumPressed(int buttonId) {

    }
    //реакция на кнопки арифметических действий и "="
    public void onActionPressed(int actionId) {

    }
}
