package mod_2;
import java.util.Scanner;
public class fou_pro {

	public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        System.out.println("string:");
        String input = scanner.nextLine();
        if (isPalindrome(input)) {
            System.out.println("palindrome.");
        } else {
            System.out.println(" not a palindrome.");
        }
        public static boolean isPalindrome(String str) {
            str = str.toLowerCase();

            int left = 0
            int right = str.length() - 1;

            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
	}




