public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.addNumbers(303, 22);


    }

    public void addNumbers(int x, int y) {
        int sum = x + y;
        System.out.println("sum:" + sum);

    }

}
