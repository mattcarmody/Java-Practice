import java.util.Scanner;

class EvenOrOdd {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter an integer number:");
        
        while (scan.hasNextInt()) {
            int i = scan.nextInt();
            
            if (i % 2 == 0) {
                System.out.println(i + " is even.");
            } else {
                System.out.println(i + " is odd.");
            }
        }
    }
}
