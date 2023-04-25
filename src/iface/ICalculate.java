package iface;
import num.Number;

public interface ICalculate extends IAddition, IMultiplication, ISubtraction, IDivision {
}


interface IAddition {
    int Addition(Number var1, Number var2);
}
