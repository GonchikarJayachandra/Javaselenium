public class Calculator1 {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.addNumbers( 300, 220);
    }
    public void addNumbers(int x,int y){
        int sum=x+y;
        System.out.println("sum :"+sum);
    }
}
