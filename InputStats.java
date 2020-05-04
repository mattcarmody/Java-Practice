import java.util.Scanner;

class InputStats {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        int num = 0;
        
        System.out.println("Enter a series of integers separated by spaces and then enter 'done':");
        
        while (scan.hasNextInt()) {
            num = scan.nextInt();
            sum += num;
            count++;
        }
        
        System.out.println("You entered " + count + " integers.");
        System.out.println("Their sum is " + sum);
        
    }
}
