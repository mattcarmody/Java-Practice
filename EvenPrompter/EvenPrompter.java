import java.util.Scanner;

class EvenPrompter {
    public static void main(String[] args) {
        boolean cond = false;
        int n = 0;
        Scanner scan = new Scanner(System.in);
        
        while (cond != true) {
            System.out.print("Enter an even integer:");
            n = scan.nextInt();
            if (n % 2 == 0) {
                System.out.println("Thank you.");
                cond = true;
            } else {
                System.out.println("Try again!");
            }
        }
    }
}
