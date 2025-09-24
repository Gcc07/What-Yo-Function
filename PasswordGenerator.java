public class PasswordGenerator {
    
    // Create methods to generate:
    public static  int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    // 1. A random lowercase letter


    public static char getRandomLower() {
        double numRandom = getRandomNumber(97,122);
        return (char)numRandom;
    }

    // 2. A random uppercase letter  
    // 3. A random digit character
    // 4. A random special character from: !@#$%^&*
    // 5. A method that generates a password of specified length 
    //    containing a mix of all character types
    
    public static void main(String[] args) {
        System.out.println("Random lowercase: " + getRandomLower());
        // System.out.println("Random uppercase: " + getRandomUpper());
        // System.out.println("Random digit: " + getRandomDigit());
        // System.out.println("Random special: " + getRandomSpecial());
        // System.out.println("8-character password: " + generatePassword(8));
    }
}