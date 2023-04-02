import java.util.*;
public class VowelorConsonant {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter an alphabet : ");
        char ch = sc.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println("It's a VOWEL.");
            }
            else {
                System.out.println("It's a CONSONANT.");
            }

        }
 
	else {
            System.out.println("Invalid input! Please enter an alphabet.");
        }
    }
}
