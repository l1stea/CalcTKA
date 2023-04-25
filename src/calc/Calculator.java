package calc;

import iface.ICalculate;
import num.Number;

public class Calculator implements ICalculate {
    Number firstNum;
    Number secondNum;
    String command = "";

    public Calculator() {
        this.firstNum = new Number();
        this.secondNum = new Number();
        this.command = "+";
    }

    public Calculator(String[] words) {
        this.firstNum = new Number(words[0]);
        this.command = words[1];
        this.secondNum = new Number(words[2]);
    }

    public int Run() throws Exception {
        switch (this.command) {
            case "+":
                return this.Addition(this.firstNum, this.secondNum);
            case "-":
                return this.Subtraction(this.firstNum, this.secondNum);
            case "*":
                return this.Multiplication(this.firstNum, this.secondNum);
            case "/":
                return this.Division(this.firstNum, this.secondNum);
            default:
                throw new Exception("Арифметическое действие не распознано");
        }
    }

    public int Addition(Number firstNum, Number secondNum) {
        return firstNum.Num + secondNum.Num;
    }

    public int Subtraction(Number firstNum, Number secondNum) {
        return firstNum.Num - secondNum.Num;
    }

    public int Multiplication(Number firstNum, Number secondNum) {
        return firstNum.Num * secondNum.Num;
    }

    public int Division(Number firstNum, Number secondNum) {
        return firstNum.Num / secondNum.Num;
    }
}
