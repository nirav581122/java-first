public class Calculator {
    static int a = 30;
    static int b = 40;
    static int answer;

    public static void main(String[] args) {
        addition();
        subtraction();
        multification();
        divison();
    }
    static void divison() {
        answer = a / b;
        System.out.println(answer);
    }
    static void multification() {
        answer = a * b;
        System.out.println(answer);
    }
    static void subtraction() {
        answer = a - b;
        System.out.println(answer);
    }

    static void addition() {
        answer = a + b;
        System.out.println(answer);
    }

}
