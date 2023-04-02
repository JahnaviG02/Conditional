import java.util.*;
public class Leap{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the year: ");
        int y = in.nextInt();
        if ((y % 400 == 0) || ((y % 100 != 0) && (y % 4 == 0))) {
            System.out.println("Yes, " + y + " is a leap year!");
        }
        else {
            System.out.println("No, " + y + " is NOT a leap year!");
        }
    }
}
