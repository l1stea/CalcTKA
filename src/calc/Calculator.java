package calc;

import iface.ICalculate;
import num.Number;

public class Calculator implements ICalculate {
    Number firstNum;
    Number secondNum;
    String command = "";
    public Calculator()
    {
        firstNum = new Number();
        secondNum = new Number();
        command = "+";
    }
    public Calculator(String[] words){
        firstNum = new Number(words[0]);
        command = words[1];
        secondNum = new Number(words[2]);
    }

    public void Run(){
        switch (command) {
            case "+":
                Addition(firstNum, secondNum);
                break;
            case "-":
                Subtraction(firstNum, secondNum);
                break;
            case "*":
                Multiplication(firstNum, secondNum);
                break;
            case "/":
                Division(firstNum, secondNum);
                break;
            default:
                System.out.println("Арифметическое действие не распознано");
                break;
        }
    }
    @Override
    public void Addition(Number firstNum, Number secondNum) {
        System.out.println(firstNum.Num + secondNum.Num);
    }

    @Override
    public void Subtraction(Number firstNum, Number secondNum) {
        System.out.println(firstNum.Num - secondNum.Num);

    }

    @Override
    public void Multiplication(Number firstNum, Number secondNum) {
        System.out.println(firstNum.Num * secondNum.Num);
    }

    @Override
    public void Division(Number firstNum, Number secondNum) {
        System.out.println(firstNum.Num / secondNum.Num);
    }
}
