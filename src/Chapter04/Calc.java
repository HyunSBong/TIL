package Chapter04;
import java.util.Scanner;

class Add {
    private int a;
    private int b;
    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int calculate() {
        return a + b;
    }
}

class Sub {
    private int a;
    private int b;
    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int calculate() {
        return a - b;
    }
}

class Mult {
    private int a;
    private int b;
    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int calculate() {
        return a * b;
    }
}

class Div {
    private int a;
    private int b;
    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int calculate() {
        return a / b;
    }
}

class Rem {
    private int a;
    private int b;
    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int calculate() {
        return a % b;
    }
}

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("두 정수와 연산자를>>");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        String operator= scanner.next();
        Add add = new Add();
        Sub sub = new Sub();
        Mult mult = new Mult();
        Div div = new Div();
        Rem rem = new Rem();

        switch (operator) {
            case "+":
                add.setValue(num1, num2);
                System.out.println(add.calculate());
                break;
            case "-":
                sub.setValue(num1, num2);
                System.out.println(sub.calculate());
                break;
            case "*":
                mult.setValue(num1, num2);
                System.out.println(mult.calculate());
                break;
            case "/":
                div.setValue(num1, num2);
                System.out.println(div.calculate());
                break;
            case "%":
                rem.setValue(num1, num2);
                System.out.println(rem.calculate());
                break;
        }
        scanner.close();
    }
}
