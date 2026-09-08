public class simpleCalculator {

        //create variables
        private static int totalNumber = 0;
        protected int result = 0;
        public String calculatorName = "My Calculator";

        // add method
        public int add(int a, int b){
            result = a + b;
            totalNumber++; // incremant total number of calculations
            return result;
        }

        //substraction method
        protected int subtract(int a, int b){
            result = a - b;
            totalNumber++; // incremant total number of calculations
            return result;
        }

        //multiplication method
        protected int multiplication(int a, int b){
            result = a * b;
            totalNumber++; // incremant total number of calculations
            return result;
        }

        //division method
        protected int division(int a, int b){
            result = a / b;
            totalNumber++; // incremant total number of calculations
            return result;
        }


        // resets the last result to zero method
        private void resetCalculator(){
            totalNumber = 0;
        }

        //method that internally calls the private resetCalculator() method
        public void monthlyReset(){
            resetCalculator();
        }

        //method prints the total number of calculations done
        static int showTotalCalculations(){
            return totalNumber;
        }

        //prints the last result
        public void showLastResult(){
            //declare local variable
            int lastResult = this.result;
            System.out.println("Local last result: " + lastResult);
            System.out.println("Instance last result: " + this.result);
        }

    public static void main(String[] args) {
        //create SimpleCalculator object
        simpleCalculator simpleCalculator = new simpleCalculator();

        System.out.println("Calculator name: " + simpleCalculator.calculatorName);
        System.out.println("Add: "+ simpleCalculator.add(10, 10));
        System.out.println("Subtract: "+ simpleCalculator.subtract(20, 10));
        System.out.println("Multiplication: "+ simpleCalculator.multiplication(15, 5));
        System.out.println("Division: "+ simpleCalculator.division(20, 2));

        simpleCalculator.showTotalCalculations(); // show number of calculations
        simpleCalculator.showLastResult(); // show last result
        simpleCalculator.monthlyReset(); //to reset number of calculations to 0
        simpleCalculator.showLastResult(); // show last result after reset


    }



}
