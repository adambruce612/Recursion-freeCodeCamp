import java.util.Scanner;

public class Palindrome
{
    public static boolean isPalindrome(String input)
    {
        // Define the base-case / stopping condition
        if (input.length() == 0 || input.length() == 1) return true;

        // Do some work to shrink the problem space
        if (input.charAt(0) == input.charAt(input.length() - 1))
        {
            return isPalindrome(input.substring(1, input.length() - 1));
        }

        // Additional base-case to handle non-palindromes
        return false;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = input.nextLine();

        if (isPalindrome(userInput)) System.out.println("Yes");
        else System.out.println("No" +
                "");
    }
}
