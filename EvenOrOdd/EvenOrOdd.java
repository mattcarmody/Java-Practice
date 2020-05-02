import java.util.Scanner;
import java.util.InputMismatchException;

class EvenOrOdd {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter an integer number:");
        
        try {
            int i = scan.nextInt();
            
            if (i % 2 == 0) {
                System.out.println(i + " is even.");
            } else {
                System.out.println(i + " is odd.");
            }
        } catch(InputMismatchException e) {
            System.out.println("That wasn't an integer.");
        }
    }
}
