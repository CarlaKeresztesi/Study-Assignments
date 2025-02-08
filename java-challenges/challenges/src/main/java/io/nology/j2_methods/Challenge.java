package io.nology.j2_methods;

public class Challenge {

    public Challenge() {
    }

    /**
     * A method to find the smallest number among three given integers
     *
     * @param num1 the first number
     * @param num2 the second number
     * @param num3 the third number
     * @return the smallest of the three numbers
     */
    public int findSmallestNumber(int num1, int num2, int num3) {
        if (num1 <= num2 && num1 <= num3) {
            return num1;
        } else if (num2 <= num1 && num2 <= num3) {
            return num2;
        }
        return num3;
    }

    /**
     * A method to check whether a string is a valid password
     * <p>
     * The password must:
     * have at least ten characters
     * consist of only letters and digits
     * contain at least two digits
     *
     * @param password the password string to be validated
     * @return true if the password is valid, otherwise false
     */
    public boolean isValidPassword(String password) {
        if (password.length() < 10) {
            return false;
        }
        int digitCount = 0; //variable to track the digits
        char ch = 0; //variable to track the characters
        for (int i = 0; i < password.length(); i++) {
           ch = password.charAt(i); //to retrieve a character from a string in java
        }
        if (!Character.isLetterOrDigit(ch)) { //checks if char is letter or digit
            return false;
        }
        if (Character.isDigit(ch)) { //if digit, the digit count is incremented
            digitCount++;
        }

        return digitCount >= 2;
    }
}
