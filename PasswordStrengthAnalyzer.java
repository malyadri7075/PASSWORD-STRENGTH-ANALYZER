import java.util.Scanner;

public class PasswordStrengthAnalyzer {

    // Function to check password strength
    public static String checkStrength(String password) {
        int score = 0;

        // Rule 1: Length check
        if (password.length() >= 8) {
            score++;
        }

        // Rule 2: Contains uppercase
        if (password.matches(".*[A-Z].*")) {
            score++;
        }

        // Rule 3: Contains lowercase
        if (password.matches(".*[a-z].*")) {
            score++;
        }

        // Rule 4: Contains digit
        if (password.matches(".*[0-9].*")) {
            score++;
        }

        // Rule 5: Contains special character
        if (password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            score++;
        }

        // Strength decision
        if (score <= 2) {
            return "Weak Password";
        } else if (score == 3 || score == 4) {
            return "Medium Password";
        } else {
            return "Strong Password";
        }
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a password to analyze: ");
        String password = sc.nextLine();

        String strength = checkStrength(password);
        System.out.println("Password Strength: " + strength);

        sc.close();
    }
}
