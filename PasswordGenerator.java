public class PasswordGenerator {
    
    // Create methods to generate: # 
    public static  int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    // 1. A random lowercase letter
    public static char getRandomLower() {
        double numRandom = getRandomNumber(97,122);
        return (char)numRandom;
    }

    // 2. A random uppercase letter  
    public static char getRandomUpper() {
        double numRandom = getRandomNumber(65,90);
        return (char)numRandom;
    }
    // 3. A random digit character
    public static char getRandomDigit() {
        double numRandom = getRandomNumber(48,57);
        return (char)numRandom;
    }
    // 4. A random special character from: !@#$%^&*
    public static char getRandomSpecial() {
        String special = "!@#$%^&*";
        double numRandom = getRandomNumber(0,8);
        int intRandom = (int)Math.round(numRandom);
        return special.charAt(intRandom);
    }
    // 5. A method that generates a password of specified length 
    //    containing a mix of all character types
    public static String generatePassword(int length) {
        // Create a for loop 
        String password = "";
        for (int i = 0; i < length; i++) {
            double numRandom = getRandomNumber(0,3);
            int intRandom = (int)Math.round(numRandom);
            switch(intRandom) {
                case 0 -> {
                    password += getRandomLower();
                }
                case 1 -> {
                    password += getRandomUpper();
                }
                case 2 -> {
                    password += getRandomDigit();
                }
                case 3 -> {
                    password += getRandomSpecial();
                }
            }
        }
        return password;
    }
    
    public static void main(String[] args) {
        System.out.println("Random lowercase: " + getRandomLower());
        System.out.println("Random uppercase: " + getRandomUpper());
        System.out.println("Random digit: " + getRandomDigit());
        System.out.println("Random special: " + getRandomSpecial());
        System.out.println("8-character password: " + generatePassword(8));
    }
}