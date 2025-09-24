public class MathHelper {
    // TODO: Implement these methods
    
    // 1. Create a method called 'calculateSum' that takes two integers 
    //    and returns their sum
    public static int calculateSum(int numOne, int numTwo) {
        return (numOne + numTwo);
    }
    // 2. Create a method called 'findMin' that takes two integers 
    //    and returns the smaller one
    public static int findMin(int numOne, int numTwo) {
        if (numOne < numTwo) {
            return numOne;
        }
        else {
            return numTwo;
        }
    }
    // 3. Create a void method called 'printResult' that takes an integer 
    //    and prints "The result is: [number]"
    public static void printResult(int Result) {
        System.out.println(Result);
    }
    
    public static void main(String[] args) {
        // Test your methods here
        int sum = calculateSum(15, 25);
        int min = findMin(10, 20);
        printResult(sum);
        printResult(min);
    }
}