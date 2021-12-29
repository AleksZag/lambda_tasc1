import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        try {
            int c = calc.devide.apply(a, b); // ошибка по причине деления на ноль в переменной devide класса Calculator
            calc.println.accept(c);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль невозможно");
        }

    }

}

