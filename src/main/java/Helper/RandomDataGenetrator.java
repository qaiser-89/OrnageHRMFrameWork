package Helper;

import java.util.Random;

public class RandomDataGenetrator
{
    // Method to generate a random email
    public static String generateRandomEmail(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder email = new StringBuilder(length);
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            email.append(characters.charAt(random.nextInt(characters.length())));
        }

        // Append a domain to the random string
        email.append("@example.com");

        return email.toString();
    }

    // Method to generate a random password
    public static String generateRandomPassword(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_+=<>?";
        StringBuilder password = new StringBuilder(length);
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            password.append(characters.charAt(random.nextInt(characters.length())));
        }

        return password.toString();
    }

    public static void main(String[] args) {
        // Generate a random email with 10 characters (excluding the domain part)
        String randomEmail = generateRandomEmail(10);

        // Generate a random password with 12 characters
        String randomPassword = generateRandomPassword(12);

        System.out.println("Random Email: " + randomEmail);
        System.out.println("Random Password: " + randomPassword);
    }
}

