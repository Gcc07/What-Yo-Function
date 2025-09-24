public class Calculator {
    // TODO: Create multiple versions of a 'multiply' method that can handle:
    // 1. Two integers
    public static int multiply(int numOne, int numTwo) {
        return (numOne * numTwo);
    }
    // 2. Three integers  
    public static int multiply(int numOne, int numTwo, int numThree) {
        return (numOne * numTwo * numThree);
    }
    // 3. Two double values
    public static double multiply(double doubleOne, double doubleTwo) {
        return (doubleOne * doubleTwo);
    }
    // 4. An integer and a string (repeat the string that many times)
    public static String multiply(int repititions, String repeatingString) {
        String final_string = "";
        for (int i = 0; i < repititions; i++) {
            final_string += repeatingString;
        }
        return final_string;
    }
    
    public static void main(String[] args) {
        // Test all your overloaded methods
        System.out.println("Two ints: " + multiply(5, 3));
        System.out.println("Three ints: " + multiply(5, 3, 2));
        System.out.println("Two doubles: " + multiply(5.5, 3.2));
        System.out.println("Int and string: " + multiply(3, "Hi!"));
    }
}