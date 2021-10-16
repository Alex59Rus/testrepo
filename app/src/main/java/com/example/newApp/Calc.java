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
        if (inputStr.length() > 9) {
            switch (buttonId) {
                case R.id.zero:
                    if (inputStr.length() != 0) {
                        inputStr.append("0");
                    }
                    break;
                case R.id.one:
                    if (inputStr.length() != 0) {
                        inputStr.append("1");
                    }
                    break;
                    case R.id.two:
                    if (inputStr.length() != 0) {
                        inputStr.append("2");
                    }
                    break;
                case R.id.three:
                    if (inputStr.length() != 0) {
                        inputStr.append("3");
                    }
                    break;
                case R.id.four:
                    if (inputStr.length() != 0) {
                        inputStr.append("4");
                    }
                    break;
                case R.id.five:
                    if (inputStr.length() != 0) {
                        inputStr.append("5");
                    }
                    break;
                case R.id.six:
                    if (inputStr.length() != 0) {
                        inputStr.append("6");
                    }
                    break;
                case R.id.seven:
                    if (inputStr.length() != 0) {
                        inputStr.append("7");
                    }
                    break;
                case R.id.eight:
                    if (inputStr.length() != 0) {
                        inputStr.append("8");
                    }
                    break;
                case R.id.nine:
                    if (inputStr.length() != 0) {
                        inputStr.append("9");
                    }
                    break;
            }
        }
    }
    //реакция на кнопки арифметических действий и "="
    public void onActionPressed(int actionId) {

    }
    public String getText() {
        return inputStr.toString();
    }
}
