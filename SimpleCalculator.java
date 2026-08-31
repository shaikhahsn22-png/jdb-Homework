public class SimpleCalculator {
    // Variables
    private static int totalCalculations = 0;
    protected int lastResult = 0;
    public String calculatorName = "MyCalculator";

    // Public Addition
    public int add(int a, int b){
        lastResult = a + b;
        totalCalculations++;
        return lastResult;
    }

    //Protected subtraction
    protected int subtract(int a, int b){
        lastResult = a - b;
        totalCalculations++;
        return lastResult;
    }

    //Public multiplication
    public double multiply(int a, int b) {
        lastResult = a * b;
        totalCalculations++;
        return lastResult;
    }

    //Public multiplication
    public double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero.");
            return 0;
        }

        lastResult = a / b;
        totalCalculations++;
        return lastResult;
    }

    //Private Method
    private void restCalculations(){
        lastResult = 0;
    }

    // Public Method
    public void monthlyReset(){
        restCalculations();
    }

    //Static Method
    static void showTotalCalculations(){
        System.out.println("Total Calculations: " + totalCalculations);
    }

    // Demonstrates local variable shadowing
    public void showLastResult(){
        int lastResult = 100;   //local var
        System.out.println("Local lastResult: " + lastResult);
        System.out.println("Instance lastResult" + this.lastResult);

    }

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();

        System.out.println("Calculator name: " + calculator.calculatorName);

        //Test add
        System.out.println("Addition: " + calculator.add(10,10));

        //Test subtract
        System.out.println("Subtraction: " + calculator.subtract(50,10));

        //Test Multiplication
        System.out.println("Multiplication: " + calculator.multiply(3,10));

        //Test Division
        System.out.println("Division: " + calculator.divide(10, 2));

        //Show last result and shadowing
        calculator.showLastResult();

        //Show last calculations
        SimpleCalculator.showTotalCalculations();

        //Reset through public method
        calculator.monthlyReset();

        System.out.println("After reset: ");
        calculator.showLastResult();
    }
}
